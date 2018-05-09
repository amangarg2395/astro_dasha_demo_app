package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

/**
 * Created by amangarg on 07/03/18.
 */

class House : Serializable {

    @SerializedName("house")
    var mHouse: Int = 0

    @SerializedName("degree")
    var mDegree: String = ""

    @SerializedName("rlToSsl")
    var mRlToSsl: String = ""

    @SerializedName("significators")
    var mSignificators: String = ""

    @SerializedName("nakSigni")
    var mNakSigni: String = ""

    @SerializedName("subSigni")
    var mSubSigni: String = ""


}
