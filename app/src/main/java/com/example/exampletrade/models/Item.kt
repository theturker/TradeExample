package com.example.example

import com.google.gson.annotations.SerializedName


data class Item (

  @SerializedName("ProtectionOrderID" ) var ProtectionOrderID : String? = null,
  @SerializedName("AccountID"         ) var AccountID         : String? = null,
  @SerializedName("RecordDate"        ) var RecordDate        : String? = null,
  @SerializedName("ClosingDate"       ) var ClosingDate       : String? = null,
  @SerializedName("Symbol"            ) var Symbol            : String? = null,
  @SerializedName("SymbolID"          ) var SymbolID          : Int?    = null,
  @SerializedName("State"             ) var State             : String? = null,
  @SerializedName("Type"              ) var Type              : String? = null,
  @SerializedName("Qty_T"             ) var QtyT              : Int?    = null,
  @SerializedName("Qty_T1"            ) var QtyT1             : Int?    = null,
  @SerializedName("Qty_T2"            ) var QtyT2             : Int?    = null,
  @SerializedName("Qty_T3"            ) var QtyT3             : Int?    = null,
  @SerializedName("Qty_Long"          ) var QtyLong           : Int?    = null,
  @SerializedName("Qty_Short"         ) var QtyShort          : Int?    = null,
  @SerializedName("Qty_Net"           ) var QtyNet            : Int?    = null,
  @SerializedName("Qty_Available"     ) var QtyAvailable      : Int?    = null,
  @SerializedName("LastPx"            ) var LastPx            : Double? = null,
  @SerializedName("SettlementPx"      ) var SettlementPx      : Double? = null,
  @SerializedName("OpeningAvgPrice"   ) var OpeningAvgPrice   : Int?    = null,
  @SerializedName("ClosingAvgPrice"   ) var ClosingAvgPrice   : Int?    = null,
  @SerializedName("StopPrice"         ) var StopPrice         : Int?    = null,
  @SerializedName("LimitPrice"        ) var LimitPrice        : Int?    = null,
  @SerializedName("Amount"            ) var Amount            : Double?    = null,
  @SerializedName("AmountShort"       ) var AmountShort       : Int?    = null,
  @SerializedName("AmountLong"        ) var AmountLong        : Int?    = null,
  @SerializedName("AvgCost"           ) var AvgCost           : Double? = null,
  @SerializedName("DailyCost"         ) var DailyCost         : Int?    = null,
  @SerializedName("PL"                ) var PL                : Int?    = null,
  @SerializedName("PL_Percent"        ) var PLPercent         : Int?    = null,
  @SerializedName("Credit"            ) var Credit            : Int?    = null,
  @SerializedName("MarginRequired"    ) var MarginRequired    : Int?    = null,
  @SerializedName("Swap"              ) var Swap              : Int?    = null,
  @SerializedName("DailyPL"           ) var DailyPL           : Int?    = null,
  @SerializedName("DailyPL_Percent"   ) var DailyPLPercent    : Int?    = null,
  @SerializedName("PL_ur"             ) var PLUr              : Int?    = null,
  @SerializedName("PL_r"              ) var PLR               : Int?    = null,
  @SerializedName("PositionSide"      ) var PositionSide      : Int?    = null,
  @SerializedName("ExFields"          ) var ExFields          : String? = null,
  @SerializedName("ExFields2"         ) var ExFields2         : String? = null,
  @SerializedName("PL_MarketPrice"    ) var PLMarketPrice     : Int?    = null,
  @SerializedName("SortOrder"         ) var SortOrder         : Int?    = null,
  @SerializedName("PositionID"        ) var PositionID        : String? = null

)