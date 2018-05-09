package com.example.amangarg.astro_dasha

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dasha_text.*

class DashaTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasha_text)

        var dashaRespString:String = intent.getStringExtra("dashaResp")
        dashaRespString = dashaRespString.replace("<B>", "")
        dashaRespString = dashaRespString.replace("</B>", "")
        dashaRespString = dashaRespString.replace("<I>", "")
        dashaRespString = dashaRespString.replace("</I>", "")
        dashaRespString = dashaRespString.replace("</i>", "")
        dashaRespString = dashaRespString.replace("</b>", "")
        dashaRespString = dashaRespString.replace("<b>", "")
        dashaRespString = dashaRespString.replace("<i>", "")

        dasha_text.setText(dashaRespString)
    }
}
