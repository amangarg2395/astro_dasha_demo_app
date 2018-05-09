package com.example.astrodashalib.model.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by amangarg on 09/04/18.
 */

class HoroscopeResponse : Serializable{

    @SerializedName("aboutkundliHeader")
    var aboutkundliHeader: String = ""

    @SerializedName("janamrashiHeader")
    var janamrashiHeader: String = ""

    @SerializedName("janamrashiValue")
    var janamrashiValue: String = ""

    @SerializedName("janamlagnaHeader")
    var janamlagnaHeader: String = ""

    @SerializedName("janamlagnaValue")
    var janamlagnaValue: String = ""

    @SerializedName("nakHeader")
    var nakHeader: String = ""

    @SerializedName("nakValue")
    var nakValue: String = ""

    @SerializedName("birthdayPlanetHeader")
    var birthdayPlanetHeader: String = ""

    @SerializedName("birthdayPlanetValue")
    var birthdayPlanetValue: String = ""

    @SerializedName("birthTimePlanetHeader")
    var birthTimePlanetHeader: String = ""

    @SerializedName("birthTimePlanetValue")
    var birthTimePlanetValue: String = ""

    @SerializedName("currentMahadashaHeader")
    var currentMahadashaHeader: String = ""

    @SerializedName("currentMahadashaValue")
    var currentMahadashaValue: String = ""

    @SerializedName("currentAntardashaHeader")
    var currentAntardashaHeader: String = ""

    @SerializedName("currentAntardashaValue")
    var currentAntardashaValue: String = ""

    @SerializedName("manglikHeader")
    var manglikHeader: String = ""

    @SerializedName("manglicValue")
    var manglicValue: String = ""

    @SerializedName("kaalSarpHeader")
    var kaalSarpHeader: String = ""

    @SerializedName("kaalSarpValue")
    var kaalSarpValue: String = ""

    @SerializedName("gandMoolHeader")
    var gandMoolHeader: String = ""

    @SerializedName("gandMoolValue")
    var gandMoolValue: String = ""

    @SerializedName("luckyDayHeader")
    var luckyDayHeader: String = ""

    @SerializedName("luckyDayValue")
    var luckyDayValue: String = ""

    @SerializedName("luckynumberHeader")
    var luckynumberHeader: String = ""

    @SerializedName("luckynumberValue")
    var luckynumberValue: String = ""

    @SerializedName("ratna4YouHeader")
    var ratna4YouHeader: String = ""

    @SerializedName("ratna4YouSubHeader")
    var ratna4YouSubHeader: String = ""

    @SerializedName("ratna4YouValue")
    var ratna4YouValue: String = ""

    @SerializedName("vdaanHeader")
    var vdaanHeader: String = ""

    @SerializedName("vdaanValue")
    var vdaanValue: String = ""

    @SerializedName("daanHeader")
    var daanHeader: String = ""

    @SerializedName("daanValue")
    var daanValue: String = ""

    @SerializedName("vcolorHeader")
    var vcolorHeader: String = ""

    @SerializedName("vcolorValue")
    var vcolorValue: String = ""
}
