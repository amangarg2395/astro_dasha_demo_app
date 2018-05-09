package com.example.astrodashalib.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class GenerateNewRequestBody(@field:SerializedName("place_name")
                             var placeName: String, @field:SerializedName("day")
                             var day: String, @field:SerializedName("month")
                             var month: String, @field:SerializedName("year")
                             var year: String, @field:SerializedName("hour")
                             var hour: String, @field:SerializedName("minute")
                             var minute: String, @field:SerializedName("tz")
                             var tz: String, @field:SerializedName("timezone")
                             var timezone: String, @field:SerializedName("latitude")
                             var latitude: String, @field:SerializedName("lon")
                             var lon: String, @field:SerializedName("lat")
                             var lat: String, @field:SerializedName("longitude")
                             var longitude: String, ayan: String, combocat: String, language: String, cmbRotate: Int, txtAge: Int, chk72: Boolean, chkInclude: Boolean, chkShowRef: Boolean, name: String, comboProd: String, relationshipCode: Int) : Serializable {

    @SerializedName("ayan")
    var ayan = "K"

    @SerializedName("combocat")
    var combocat = "all"

    @SerializedName("language")
    var language = "hindi"

    @SerializedName("cmbRotate")
    var cmbRotate = 1

    @SerializedName("txtAge")
    var txtAge = 22

    @SerializedName("chk72")
    var chk72 = false

    @SerializedName("chkInclude")
    var chkInclude = false

    @SerializedName("chkShowRef")
    var chkShowRef = false

    @SerializedName("name")
    var name = "OM"

    @SerializedName("comboProd")
    var comboProd = "New Product"

    @SerializedName("relationshipCode")
    var relationshipCode = 0

    init {
        this.ayan = ayan
        this.combocat = combocat
        this.language = language
        this.cmbRotate = cmbRotate
        this.txtAge = txtAge
        this.chk72 = chk72
        this.chkInclude = chkInclude
        this.chkShowRef = chkShowRef
        this.name = name
        this.comboProd = comboProd
        this.relationshipCode = relationshipCode
    }
}
