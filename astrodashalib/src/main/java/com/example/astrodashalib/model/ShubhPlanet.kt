package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ShubhPlanet : Serializable {

    @SerializedName("planet")
    var planet: String = ""

    @SerializedName("isBad")
    var isBad: Boolean = false

    @SerializedName("status")
    var status: String = ""
}
