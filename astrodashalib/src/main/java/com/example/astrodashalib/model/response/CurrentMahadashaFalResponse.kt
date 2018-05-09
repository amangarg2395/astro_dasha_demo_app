package com.example.astrodashalib.model.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CurrentMahadashaFalResponse : Serializable {

    @SerializedName("currentMahadashaFal")
    var mahadashaText: String = ""
}