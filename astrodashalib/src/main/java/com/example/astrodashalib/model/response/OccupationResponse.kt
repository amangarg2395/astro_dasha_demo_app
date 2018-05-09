package com.example.astrodashalib.model.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by amangarg on 06/04/18.
 */

class OccupationResponse : Serializable {

    @SerializedName("occupationPred")
    var occupationPred: String = ""
}
