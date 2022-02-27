package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("Result"          ) var Result          : Result?                 = Result(),
  @SerializedName("AccountList"     ) var AccountList     : ArrayList<String>       = arrayListOf(),
  @SerializedName("DefaultAccount"  ) var DefaultAccount  : String?                 = null,
  @SerializedName("CustomerID"      ) var CustomerID      : String?                 = null,
  @SerializedName("UserRights"      ) var UserRights      : ArrayList<UserRights>   = arrayListOf(),
  @SerializedName("AccountItems"    ) var AccountItems    : ArrayList<AccountItems> = arrayListOf(),
  @SerializedName("MarketDataToken" ) var MarketDataToken : String?                 = null,
  @SerializedName("CustomerName"    ) var CustomerName    : String?                 = null,
  @SerializedName("ExCode"          ) var ExCode          : Int?                    = null,
  @SerializedName("AccountListEx"   ) var AccountListEx   : ArrayList<String>       = arrayListOf(),
  @SerializedName("LicenceList"     ) var LicenceList     : ArrayList<String>       = arrayListOf(),
  @SerializedName("DevicePairToken" ) var DevicePairToken : String?                 = null,
  @SerializedName("Statistics"      ) var Statistics      : String?                 = null,
  @SerializedName("MatriksID"       ) var MatriksID       : String?                 = null

)