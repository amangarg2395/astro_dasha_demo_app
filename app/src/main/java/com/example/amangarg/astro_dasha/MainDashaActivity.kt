package com.example.amangarg.astro_dasha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.astrodashalib.DashaData
import com.example.astrodashalib.interfaces.DashaCallback
import com.example.astrodashalib.model.*
import com.example.astrodashalib.model.response.*
import kotlinx.android.synthetic.main.activity_main_dasha.*
import kotlinx.android.synthetic.main.progress_layout.*

class MainDashaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dasha)

        var intent = Intent(this, DashaTextActivity::class.java)
        var dashaData = DashaData()
        var dashaResponse: String? = null


        var kpChartValue: ArrayList<KPChart> = kpChartHashMap.get("kpChart") ?: ArrayList()
        var cuspHouseValue: ArrayList<CuspHouse> = cuspHouseHashMap.get("cuspHouse") ?: ArrayList()
        var kpChartCuspValue: ArrayList<KPChart> = kpChartCuspHashMap.get("kpChartCusp")
                ?: ArrayList()
        var cuspHouseCuspValue: ArrayList<CuspHouse> = cuspHouseCuspHashMap.get("cuspHouseCusp")
                ?: ArrayList()
        var mahadashaModelItemValue: ArrayList<MahaDashaModelItem> = mahadashaModelHashMap.get("mahadashaModel")
                ?: ArrayList()
        var mainMahadashaListValue: ArrayList<MainMahaDasha> = mainMahadashaListHashMap.get("mainMahadashaList")
                ?: ArrayList()
        var onlineResultValue: String = onlineResultHashMap.get("onlineResult") ?: ""
        var paramForPerskvValue: String = paramForPerskvHashMap.get("paramForPerskv") ?: ""
        var paramForProdValue: String = paramForProdHashMap.get("paramForProd") ?: ""

        horoscope_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE

            dashaData.horoscopeResponse(HoroscopeRequestBody(kpChartValue, onlineResultValue, paramForPerskvValue), object : DashaCallback<HoroscopeResponse> {
                override fun onSuccess(data: HoroscopeResponse) {

                    dashaResponse = data.luckyDayValue
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }
            })


        }

        current_mahadasha_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.getCurrentMahadashaFal(CurrentMahadashaFalRequestBody(kpChartValue, cuspHouseCuspValue, mainMahadashaListValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<CurrentMahadashaFalResponse> {
                override fun onSuccess(data: CurrentMahadashaFalResponse) {
                    dashaResponse = data.mahadashaText
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }

        current_antardasha_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.getCurrentAntardashaFal(CurrentAntardashaFalRequestBody(kpChartValue, cuspHouseCuspValue, mainMahadashaListValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<CurrentAntardashaFalResponse> {
                override fun onSuccess(data: CurrentAntardashaFalResponse) {
                    dashaResponse = data.antardashaText
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }

        yog_yuti_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.getYogYutiResponse(YogYutiRequestBody(kpChartValue, cuspHouseCuspValue, onlineResultValue, paramForPerskvValue), object : DashaCallback<YogYutiResponse> {
                override fun onSuccess(data: YogYutiResponse) {
                    dashaResponse = data.onlyYogYukti
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }

        health_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.healthResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<HealthResponse> {
                override fun onSuccess(data: HealthResponse) {
                    dashaResponse = data.healthPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }

        occupation_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.occupationResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<OccupationResponse> {
                override fun onSuccess(data: OccupationResponse) {
                    dashaResponse = data.occupationPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }
        parents_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.parentsResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<ParentsResponse> {
                override fun onSuccess(data: ParentsResponse) {
                    dashaResponse = data.parentsPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }

        children_cv.setOnClickListener {
            nsv.visibility = View.GONE
            progress_view_ll.visibility = View.VISIBLE
            dashaData.childrenResponse(PredictionRequestBody(kpChartValue, cuspHouseValue, onlineResultValue, paramForPerskvValue, paramForProdValue), object : DashaCallback<ChildrenResponse> {
                override fun onSuccess(data: ChildrenResponse) {
                    dashaResponse = data.santanPred
                    intent.putExtra("dashaResp", dashaResponse)
                    startActivity(intent)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

                override fun onError(e: Throwable) {
                    Exception(e)
                    progress_view_ll.visibility = View.GONE
                    nsv.visibility = View.VISIBLE
                }

            })
        }


    }


}
