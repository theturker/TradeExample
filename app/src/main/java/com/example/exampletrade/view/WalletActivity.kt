package com.example.exampletrade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.example.Item
import com.example.example.JsonKtModel
import com.example.exampletrade.R
import com.example.exampletrade.adapter.RecyclerViewAdapter
import com.example.exampletrade.service.TradeAPI
import kotlinx.android.synthetic.main.activity_wallet.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WalletActivity : AppCompatActivity(), RecyclerViewAdapter.Listener {

    val BASE_URL = "https://tbpilot.matriksdata.com/9999/"
    var userName : String = ""
    var userPass : String = ""
    var accountWallet : String = ""
    private var tradeModels: ArrayList<Item>? = null
    private var recyclerViewAdapter : RecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)

        accountWallet = intent.getStringExtra("defaultAccount").toString()
        userName = intent.getStringExtra("edtUserId").toString()
        userPass = intent.getStringExtra("edtUserPass").toString()

        txtWalletId.text = accountWallet

        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        loadData()
    }

    private fun loadData() {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(TradeAPI::class.java)
        val call = service.getDataWallet(userName, userPass, accountWallet)

        call.enqueue(object: Callback<JsonKtModel> {
            override fun onFailure(call: Call<JsonKtModel>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<JsonKtModel>, response: Response<JsonKtModel>) {
                if (response.isSuccessful) {
                        Toast.makeText(applicationContext,response.body()?.Result?.Description.toString(),
                            Toast.LENGTH_LONG).show()
                        response.body()?.Item.let {
                            tradeModels = ArrayList(it)
                            recyclerViewAdapter = RecyclerViewAdapter(tradeModels!!,this@WalletActivity)
                            recyclerView.adapter = recyclerViewAdapter
                        }
                }
                else{
                    Toast.makeText(applicationContext,"Hata",
                        Toast.LENGTH_LONG).show()
                    return
                }
            }
        })
    }

    override fun onItemClick(cryptoModel: Item) {
        Toast.makeText(applicationContext,"Item Tıklanmıştır.",
            Toast.LENGTH_LONG).show()
    }
}