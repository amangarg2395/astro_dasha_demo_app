package com.example.amangarg.astro_dasha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.astrodashalib.model.response.GenerateNewResponse

import com.example.astrodashalib.DashaData
import com.example.astrodashalib.interfaces.DashaCallback
import com.example.astrodashalib.model.GenerateNewRequestBody
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var generateNewRequestBody: GenerateNewRequestBody? = null
    var generateNewResponse = GenerateNewResponse()
    var dashaData = DashaData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dasha_btn.setOnClickListener {
            var intent = Intent(this, MainDashaActivity::class.java)

            generateNewRequestBody = GenerateNewRequestBody("New Delhi [India]", "3", "5", "1990", "18", "0", "82.30E", "82.30", "28:36", "77:12E", "28:36N", "77:12", "K", "all", "hindi", 1, 22, false, false, false, "OM", "New Product", 0)
            var userId = ""

            dashaData.getGenerateNewResponse(generateNewRequestBody!!, userId, object : DashaCallback<GenerateNewResponse> {
                override fun onSuccess(data: GenerateNewResponse) {
                    generateNewResponse = data

                    kpChartHashMap.put("kpChart", generateNewResponse.mKpChartList)
                    cuspHouseHashMap.put("cuspHouse", generateNewResponse.mCuspHouseList)
                    kpChartCuspHashMap.put("kpChartCusp", generateNewResponse.mKpChartCuspList)
                    cuspHouseCuspHashMap.put("cuspHouseCusp", generateNewResponse.mCuspHouseCuspList)
                    mahadashaModelHashMap.put("mahadashaModel", generateNewResponse.mMahaDashaModelItemList)
                    mainMahadashaListHashMap.put("mainMahadashaList", generateNewResponse.mMainMahaDashaList)
                    onlineResultHashMap.put("onlineResult", generateNewResponse.mOnlineResult)
                    paramForPerskvHashMap.put("paramForPerskv", generateNewResponse.mParamForPerskv)
                    paramForProdHashMap.put("paramForProd", generateNewResponse.mParamForProd)

                    startActivity(intent)

                }

                override fun onError(e: Throwable) {
                    Exception(e)

                }
            })


        }
    }
}
