package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.util.ArrayList

/**
 * Created by amangarg on 06/03/18.
 */

class MainMahaDasha : Serializable {

    @SerializedName("SNo")
    var sNo: Int = 0

    @SerializedName("Planet")
    var planet: Int = 0

    @SerializedName("StartDate")
    var startDate: Long = 0

    @SerializedName("EndDate")
    var endDate: Long = 0

    @SerializedName("Days")
    var days: Int = 0

    @SerializedName("Duration")
    var duration: String = ""

    @SerializedName("_signi")
    var signi: ArrayList<Signi> = ArrayList()

    @SerializedName("_naksigni")
    var naksigini: ArrayList<Signi> = ArrayList()

    @SerializedName("Signi_String")
    var siginiString: String = ""

    @SerializedName("Nak_Signi_String")
    var nakSiginiString: String = ""

}
