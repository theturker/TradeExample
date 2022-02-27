package com.example.example

import com.google.gson.annotations.SerializedName


data class TransactionTypeRights (

  @SerializedName("ExchangeID" ) var ExchangeID : Int?              = null,
  @SerializedName("Rights"     ) var Rights     : ArrayList<Rights> = arrayListOf()

)