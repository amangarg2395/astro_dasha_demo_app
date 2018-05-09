package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.math.BigDecimal
import java.util.ArrayList

class CuspHouse : Serializable {

    @SerializedName("_house")
    var mHouse: Int = 0

    @SerializedName("_rashi")
    var mRashi: Int = 0

    @SerializedName("_laganrashi")
    var mLaganRashi:  Int = 0

    @SerializedName("_house_deg")
    var mHouseDeg: String? = null

    @SerializedName("_house_deg_decimal")
    var mHouseDegDecimal: BigDecimal = BigDecimal.ZERO

    @SerializedName("_rashi_lord")
    var mRashiLord:  Int = 0

    @SerializedName("_nak_lord")
    var mNakLord:  Int = 0

    @SerializedName("_sub_lord")
    var mSubLord:  Int = 0

    @SerializedName("_signi")
    var mSigni: ArrayList<Signi> = ArrayList()


    @SerializedName("_sub_sub_lord")
    var mSubSubLord:  Int = 0

    @SerializedName("isManda")
    var mIsManda: Boolean = true

}

