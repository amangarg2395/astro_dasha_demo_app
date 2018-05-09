package com.example.astrodashalib.model.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CurrentAntardashaFalResponse : Serializable {

    @SerializedName("current35SalaFal")
    var antardashaText: String = ""
}