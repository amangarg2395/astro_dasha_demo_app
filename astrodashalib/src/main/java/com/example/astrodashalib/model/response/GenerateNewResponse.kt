package com.example.astrodashalib.model.response

import com.example.astrodashalib.model.*
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.ArrayList

class GenerateNewResponse : Serializable {

    @SerializedName("maha_DashaModel")
    var mMahaDashaModelItemList: ArrayList<MahaDashaModelItem>  = ArrayList()

    @SerializedName("listView_PlanetModel")
    var mListViewPlanetModel: ArrayList<Planet>  = ArrayList()

    @SerializedName("listView_HouseModel")
    var mListViewHouseModel: ArrayList<House>  = ArrayList()

    @SerializedName("listView_RulingPlanetsModel")
    var mListViewRulingPlanetsModel: List<RulingPlanet>  = ArrayList()

    @SerializedName("rtf_Pred")
    var mRtfPred: String = ""

    @SerializedName("kp_image")
    var mKpImage: String = ""

    @SerializedName("lahiri_image")
    var mLahiriImage: String = ""

    @SerializedName("gochar_image")
    var mGocharImage: String = ""

    @SerializedName("planets_shubh_list")
    var mPlanetsShubhList: ArrayList<ShubhPlanet>  = ArrayList()

    @SerializedName("kpChart")
    var mKpChartList: ArrayList<KPChart>  = ArrayList()

    @SerializedName("kpChartCusp")
    var mKpChartCuspList: ArrayList<KPChart>  = ArrayList()

    @SerializedName("cuspHouse")
    var mCuspHouseList: ArrayList<CuspHouse>  = ArrayList()

    @SerializedName("cuspHouseCusp")
    var mCuspHouseCuspList: ArrayList<CuspHouse>  = ArrayList()

    @SerializedName("mainMahaDashaList")
    var mMainMahaDashaList: ArrayList<MainMahaDasha>  = ArrayList()

    @SerializedName("onlineResult")
    var mOnlineResult: String = ""

    @SerializedName("paramForPerskv")
    var mParamForPerskv: String  = ""

    @SerializedName("paramForProd")
    var mParamForProd: String = ""

}