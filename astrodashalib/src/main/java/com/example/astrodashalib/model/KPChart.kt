package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.math.BigDecimal
import java.util.ArrayList

class KPChart : Serializable {

    @SerializedName("planet")
    var planet: Int = 0

    @SerializedName("house")
    var house: Int = 0

    @SerializedName("rashi")
    var rashi: Int = 0

    @SerializedName("isBad")
    var isBad: Boolean = true

    @SerializedName("isVeryBad")
    var isVeryBad: Boolean = true

    @SerializedName("bhavChalitHouse")
    var bhavChalitHouse: Int = 0

    @SerializedName("bhavChalitHouseNew")
    var bhavChalitHouseNew: Int = 0

    @SerializedName("bhavChalitRashi")
    var bhavChalitRashi: Int = 0

    @SerializedName("planetDeg")
    var planetDeg: String = ""

    @SerializedName("planetDegDecimal")
    var planetDegDecimal: BigDecimal = BigDecimal.ZERO

    @SerializedName("rashiLord")
    var rashiLord: Int = 0

    @SerializedName("nakLord")
    var nakLord: Int = 0

    @SerializedName("subLord")
    var subLord: Int = 0

    @SerializedName("subSubLord")
    var subSubLord: Int = 0

    @SerializedName("signi")
    var signiList: ArrayList<Signi> = ArrayList()

    @SerializedName("isManda")
    var isManda: Boolean = true

    @SerializedName("isJadKharab")
    var isJadKharab: Boolean = true

    @SerializedName("isPakka")
    var isPakka: Boolean = true

}
