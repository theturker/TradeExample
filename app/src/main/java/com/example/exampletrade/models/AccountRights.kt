package com.example.example

import com.google.gson.annotations.SerializedName


data class AccountRights (

  @SerializedName("Code"      ) var Code      : String? = null,
  @SerializedName("Key"       ) var Key       : String? = null,
  @SerializedName("Value"     ) var Value     : String? = null,
  @SerializedName("Timestamp" ) var Timestamp : Int?    = null,
  @SerializedName("DataType"  ) var DataType  : Int?    = null

)