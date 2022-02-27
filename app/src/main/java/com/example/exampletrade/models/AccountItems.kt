package com.example.example

import com.google.gson.annotations.SerializedName


data class AccountItems (

  @SerializedName("AccountID"             ) var AccountID             : String?                          = null,
  @SerializedName("ExchangeAccountID"     ) var ExchangeAccountID     : ExchangeAccountID?               = ExchangeAccountID(),
  @SerializedName("AccountRights"         ) var AccountRights         : ArrayList<AccountRights>         = arrayListOf(),
  @SerializedName("TransactionTypeRights" ) var TransactionTypeRights : ArrayList<TransactionTypeRights> = arrayListOf(),
  @SerializedName("Reserved"              ) var Reserved              : String?                          = null,
  @SerializedName("AccountIDExtended"     ) var AccountIDExtended     : String?                          = null

)