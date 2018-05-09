package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

/**
 * Created by amangarg on 02/04/18.
 */

class CurrentAntardashaFalRequestBody(@field:SerializedName("kpChart")
                                      var kpChartList: ArrayList<KPChart>, @field:SerializedName("cuspHouse")
                                      var cuspHouseList: ArrayList<CuspHouse>, @field:SerializedName("mainMahaDashaList")
                                      var mainMahaDashaList: ArrayList<MainMahaDasha>, @field:SerializedName("onlineResult")
                                      var onlineResult: String, @field:SerializedName("paramForPerskv")
                                      var paramForPerskv: String, @field:SerializedName("paramForProd")
                                      var paramForProd: String)
