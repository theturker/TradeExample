package com.example.example

import com.google.gson.annotations.SerializedName


data class Result (

  @SerializedName("State"       ) var State       : Boolean? = null,
  @SerializedName("Code"        ) var Code        : Int?     = null,
  @SerializedName("Description" ) var Description : String?  = null,
  @SerializedName("SessionKey"  ) var SessionKey  : String?  = null,
  @SerializedName("Duration"    ) var Duration    : Int?     = null,
  @SerializedName("MsgType"     ) var MsgType     : String?  = null,
  @SerializedName("Timestamp"   ) var Timestamp   : String?  = null,
  @SerializedName("ClOrdID"     ) var ClOrdID     : String?  = null,
  @SerializedName("Reserved"    ) var Reserved    : String?  = null,
  @SerializedName("V"           ) var V           : String?  = null

)