package com.example.example

import com.google.gson.annotations.SerializedName


data class Rights (

  @SerializedName("Side" ) var Side : Int?           = null,
  @SerializedName("L"    ) var L    : ArrayList<Int> = arrayListOf()

)