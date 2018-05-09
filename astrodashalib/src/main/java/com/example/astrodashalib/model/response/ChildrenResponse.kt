package com.example.astrodashalib.model.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ChildrenResponse : Serializable {

    @SerializedName("santanPred")
    var santanPred: String = ""
}