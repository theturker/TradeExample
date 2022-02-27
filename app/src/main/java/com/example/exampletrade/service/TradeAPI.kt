package com.example.exampletrade.service

import com.example.example.ExampleJson2KtKotlin
import com.example.example.JsonKtModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TradeAPI {

    @GET("Integration.aspx?MsgType=A&CustomerNo=0&AccountID=0&ExchangeID=4&OutputType=2")
    fun getData(@Query("Username") userNameTxt: String, @Query("Password") passwordTxt: String): Call<ExampleJson2KtKotlin>

    @GET("Integration.aspx?MsgType=AN&CustomerNo=0&ExchangeID=4&OutputType=2")
    fun getDataWallet(@Query("Username") userNameTxt: String, @Query("Password") passwordTxt: String, @Query("AccountID") accountIdTxt: String): Call<JsonKtModel>
}