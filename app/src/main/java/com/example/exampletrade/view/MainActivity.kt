package com.example.exampletrade.view

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.example.example.ExampleJson2KtKotlin
import com.example.exampletrade.R
import com.example.exampletrade.service.TradeAPI
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(){

    val BASE_URL = "https://tbpilot.matriksdata.com/9999/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userPageButton.setOnClickListener{
            hideKeyboard(it)
            loadData()
        }
    }

    private fun loadData() {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        //TODO
        // Bu şekilde kullanılmamalı, ancak süre sorunu bulunduğu için servisten gelen bilgiler bekleme durumunda kullanıcı bilgilendirme amaçlıdır.
        var progressDoalog:ProgressDialog
        progressDoalog = ProgressDialog(this)
        progressDoalog.setMax(10)
        progressDoalog.setMessage("Yükleniyor")
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        progressDoalog.show()

        val service = retrofit.create(TradeAPI::class.java)
        val call = service.getData(edtUserId.text.toString(), edtUserPass.text.toString())

        call.enqueue(object: Callback<ExampleJson2KtKotlin> {
            override fun onFailure(call: Call<ExampleJson2KtKotlin>, t: Throwable) {
                t.printStackTrace()
                progressDoalog.dismiss()
            }

            override fun onResponse(
                call: Call<ExampleJson2KtKotlin>,
                response: Response<ExampleJson2KtKotlin>
            ) {
                if (response.isSuccessful) {
                    if(response.body()?.Result?.State == true){
                        Toast.makeText(applicationContext,"Hoşgeldiniz",
                            Toast.LENGTH_LONG).show()

                        val intent = Intent(applicationContext, WalletActivity::class.java)
                        intent.putExtra("defaultAccount", response.body()!!.DefaultAccount.toString())
                        intent.putExtra("edtUserId", edtUserId.text.toString())
                        intent.putExtra("edtUserPass", edtUserPass.text.toString())
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(applicationContext,response.body()?.Result?.Description.toString(),
                            Toast.LENGTH_LONG).show()
                        return
                    }
                }
                progressDoalog.dismiss()
            }
        })
    }

    fun hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
