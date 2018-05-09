package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

/**
 * Created by amangarg on 06/04/18.
 */

class YogYutiRequestBody(@field:SerializedName("kpChartCusp")
                         var mKpChartCusp: ArrayList<KPChart>, @field:SerializedName("cuspHouseCusp")
                         var mCuspHouseCusp: ArrayList<CuspHouse>, @field:SerializedName("onlineResult")
                         var mOnlineResult: String, @field:SerializedName("paramForPerskv")
                         var mParamForPerskv: String)
