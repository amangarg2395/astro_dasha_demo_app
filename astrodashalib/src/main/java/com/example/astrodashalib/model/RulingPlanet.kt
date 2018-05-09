package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class RulingPlanet : Serializable {

    @SerializedName("description")
    var description: String = ""

    @SerializedName("value")
    var value: String = ""
}