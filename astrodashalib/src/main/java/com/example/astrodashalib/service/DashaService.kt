package com.example.astrodashalib.service

import com.example.astrodashalib.model.*
import com.example.astrodashalib.model.response.*
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import rx.Observable

interface DashaService{

    @POST("/generateNew")
    fun getMahaDashaResponse(@Header("key") secretValue: String, @Body kundliRequestBody: GenerateNewRequestBody, @Header("user_id") userId: String): Observable<GenerateNewResponse>

    @POST("/getCurrentMahadashaFal")
    fun getCurrentMahadashaFalText(@Header("key") secretValue: String, @Body currentMahadashaFalRequestBody: CurrentMahadashaFalRequestBody): Observable<CurrentMahadashaFalResponse>

    @POST("/getCurrentAntardashaFal")
    fun getCurrentAntardashaFalText(@Header("key") secretValue: String, @Body currentAntardashaFalRequestBody: CurrentAntardashaFalRequestBody): Observable<CurrentAntardashaFalResponse>

    @POST("/getOnlyYogyuti")
    fun getOnlyYogYutiText(@Header("key") secretValue: String, @Body yogYutiRequestBody: YogYutiRequestBody): Observable<YogYutiResponse>

    @POST("/getHoroScope")
    fun getHoroscope(@Header("key") secretValue: String, @Body horoscopeRequestBody: HoroscopeRequestBody): Observable<HoroscopeResponse>

    @POST("getHealth")
    fun getOnlyHealthText(@Header("key") secretValue: String, @Body predictionRequestBody: PredictionRequestBody): Observable<HealthResponse>

    @POST("getMarriedLife")
    fun getOnlyMarriedLifeText(@Header("key") secretValue: String, @Body predictionRequestBody: PredictionRequestBody): Observable<MarriedLifeResponse>

    @POST("getOccupation")
    fun getOnlyOccupationText(@Header("key") secretValue: String, @Body predictionRequestBody: PredictionRequestBody): Observable<OccupationResponse>

    @POST("getParents")
    fun getOnlyParentsText(@Header("key") secretValue: String, @Body predictionRequestBody: PredictionRequestBody): Observable<ParentsResponse>

    @POST("getChildren")
    fun getOnlyChildrenText(@Header("key") secretValue: String, @Body predictionRequestBody: PredictionRequestBody): Observable<ChildrenResponse>

}