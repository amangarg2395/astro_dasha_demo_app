package com.example.amangarg.astro_dasha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.astrodashalib.DashaData
import com.example.astrodashalib.interfaces.DashaCallback
import com.example.astrodashalib.model.*
import com.example.astrodashalib.model.response.*
import kotlinx.android.synthetic.main.activity_main_dasha.*

class MainDashaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dasha)

        var intent = Intent(this, DashaTextActivity::class.java)
        var dashaData = DashaData()
        var dashaResponse: String? = null


        var kpChartValue: ArrayList<KPChart> = kpChartHashMap.get("kpChart")?: ArrayList()
        var cuspHouseValue: ArrayList<CuspHouse> = cuspHouseHashMap.get("cuspHouse")?:ArrayList()
        var kpChartCuspValue: ArrayList<KPChart> = kpChartCuspHashMap.get("kpChartCusp")?:ArrayList()
        var cuspHouseCuspValue: ArrayList<CuspHouse> = cuspHouseCuspHashMap.get("cuspHouseCusp")?:ArrayList()
        var mahadashaModelItemValue: ArrayList<MahaDashaModelItem> = mahadashaModelHashMap.get("mahadashaModel")?:ArrayList()
        var mainMahadashaListValue: ArrayList<MainMahaDasha> = mainMahadashaListHashMap.get("mainMahadashaList")?:ArrayList()
        var onlineResultValue: String = onlineResultHashMap.get("onlineResult")?: ""
        var paramForPerskvValue: String = paramForPerskvHashMap.get("paramForPerskv")?: ""
        var paramForProdValue: String = paramForProdHashMap.get("paramForProd")?: ""

        horoscope_cv.setOnClickListener {


            dashaData.horoscopeResponse(HoroscopeRequestBody(kpChartValue, onlineResultValue, paramForPerskvValue), object : DashaCallback<HoroscopeResponse> {
                override fun onSuccess(data: HoroscopeResponse) {
                    dashaResponse = data.luckyDayValue
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })

        }

        current_mahadasha_cv.setOnClickListener {
            dashaData.getCurrentMahadashaFal(CurrentMahadashaFalRequestBody(kpChartValue, cuspHouseCuspValue, mainMahadashaListValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<CurrentMahadashaFalResponse> {
                override fun onSuccess(data: CurrentMahadashaFalResponse) {
                    dashaResponse = data.mahadashaText
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }

        current_antardasha_cv.setOnClickListener {
            dashaData.getCurrentAntardashaFal(CurrentAntardashaFalRequestBody(kpChartValue, cuspHouseCuspValue, mainMahadashaListValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<CurrentAntardashaFalResponse> {
                override fun onSuccess(data: CurrentAntardashaFalResponse) {
                    dashaResponse = data.antardashaText
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }

        yog_yuti_cv.setOnClickListener {
            dashaData.getYogYutiResponse(YogYutiRequestBody(kpChartValue, cuspHouseCuspValue, onlineResultValue, paramForPerskvValue), object : DashaCallback<YogYutiResponse> {
                override fun onSuccess(data: YogYutiResponse) {
                    dashaResponse = data.onlyYogYukti
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }

        health_cv.setOnClickListener {
            dashaData.healthResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<HealthResponse> {
                override fun onSuccess(data: HealthResponse) {
                    dashaResponse = data.healthPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }

        occupation_cv.setOnClickListener {
            dashaData.occupationResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<OccupationResponse> {
                override fun onSuccess(data: OccupationResponse) {
                    dashaResponse = data.occupationPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }
        parents_cv.setOnClickListener {
            dashaData.parentsResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<ParentsResponse> {
                override fun onSuccess(data: ParentsResponse) {
                    dashaResponse = data.parentsPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }

        children_cv.setOnClickListener {
            dashaData.childrenResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<ChildrenResponse> {
                override fun onSuccess(data: ChildrenResponse) {
                    dashaResponse = data.santanPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                }

            })
        }


    }

    fun showLoader(){

    }


}
