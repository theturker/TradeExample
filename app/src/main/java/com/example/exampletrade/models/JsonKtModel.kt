package com.example.example

import com.google.gson.annotations.SerializedName


data class JsonKtModel (

  @SerializedName("Result" ) var Result : Result?           = Result(),
  @SerializedName("Header" ) var Header : ArrayList<String> = arrayListOf(),
  @SerializedName("Item"   ) var Item   : ArrayList<Item>   = arrayListOf(),
  @SerializedName("Other"  ) var Other  : ArrayList<String> = arrayListOf()

)