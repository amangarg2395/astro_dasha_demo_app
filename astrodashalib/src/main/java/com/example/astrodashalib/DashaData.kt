package com.example.astrodashalib

import com.example.astrodashalib.service.RestProvider
import com.example.astrodashalib.interfaces.DashaCallback
import com.example.astrodashalib.model.*
import com.example.astrodashalib.model.response.*
import com.example.astrodashalib.utils.Utils
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription

public class DashaData {

    internal var mCompositeSubscription = CompositeSubscription()

    internal var mGenerateNewResponse: GenerateNewResponse? = null
    internal var mYogYutiResponse: YogYutiResponse? = null
    internal var mHoroscopeResponse: HoroscopeResponse? = null
    internal var mHealthResponse: HealthResponse? = null
    internal var mMarriedLifeResponse: MarriedLifeResponse? = null
    internal var mOccupationResponse: OccupationResponse? = null
    internal var mParentsResponse: ParentsResponse? = null
    internal var mChildrenResponse: ChildrenResponse? = null
    internal var mCurrentMahadashaFalResponse: CurrentMahadashaFalResponse? = null
    internal var mCurrentAntardashaFalResponse: CurrentAntardashaFalResponse? = null


    fun getGenerateNewResponse(generateNewRequestBody: GenerateNewRequestBody, userId: String, callback: DashaCallback<GenerateNewResponse>) {
        try {
            mCompositeSubscription.add(RestProvider.getDashaService().getMahaDashaResponse(Utils.KEY_VALUE, generateNewRequestBody, userId)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<GenerateNewResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)
                        }

                        override fun onNext(generateNewResponseBody: GenerateNewResponse) {
                            mGenerateNewResponse = generateNewResponseBody
                            callback.onSuccess(mGenerateNewResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getGenerateNewResponseAsync(generateNewRequestBody: GenerateNewRequestBody, userId: String, callback: DashaCallback<GenerateNewResponse>) {
        try {
            mCompositeSubscription.add(RestProvider.getDashaService().getMahaDashaResponse(Utils.KEY_VALUE, generateNewRequestBody, userId)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<GenerateNewResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)
                        }

                        override fun onNext(generateNewResponseBody: GenerateNewResponse) {
                            mGenerateNewResponse = generateNewResponseBody
                            callback.onSuccess(mGenerateNewResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getCurrentMahadashaFal(currentMahadashaFalRequestBody: CurrentMahadashaFalRequestBody, callback: DashaCallback<CurrentMahadashaFalResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getCurrentMahadashaFalText(Utils.KEY_VALUE, currentMahadashaFalRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<CurrentMahadashaFalResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(currentMahadashaFalResponse: CurrentMahadashaFalResponse) {
                            mCurrentMahadashaFalResponse = currentMahadashaFalResponse
                            callback.onSuccess(mCurrentMahadashaFalResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getCurrentMahadashaFalAsync(currentMahadashaFalRequestBody: CurrentMahadashaFalRequestBody, userId: String, callback: DashaCallback<CurrentMahadashaFalResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getCurrentMahadashaFalText(Utils.KEY_VALUE, currentMahadashaFalRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<CurrentMahadashaFalResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(currentMahadashaFalResponse: CurrentMahadashaFalResponse) {
                            mCurrentMahadashaFalResponse = currentMahadashaFalResponse
                            callback.onSuccess(mCurrentMahadashaFalResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getCurrentAntardashaFal(currentAntardashaFalRequestBody: CurrentAntardashaFalRequestBody, callback: DashaCallback<CurrentAntardashaFalResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getCurrentAntardashaFalText(Utils.KEY_VALUE, currentAntardashaFalRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<CurrentAntardashaFalResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(currentAntardashaFalResponse: CurrentAntardashaFalResponse) {
                            mCurrentAntardashaFalResponse = currentAntardashaFalResponse
                            callback.onSuccess(mCurrentAntardashaFalResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getCurrentAntardashaFalAsync(currentAntardashaFalRequestBody: CurrentAntardashaFalRequestBody, userId: String, callback: DashaCallback<CurrentAntardashaFalResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getCurrentAntardashaFalText(Utils.KEY_VALUE, currentAntardashaFalRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<CurrentAntardashaFalResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(currentAntardashaFalResponse: CurrentAntardashaFalResponse) {
                            mCurrentAntardashaFalResponse = currentAntardashaFalResponse
                            callback.onSuccess(mCurrentAntardashaFalResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getYogYutiResponse(yogYutiRequestBody: YogYutiRequestBody, callback: DashaCallback<YogYutiResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyYogYutiText(Utils.KEY_VALUE, yogYutiRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<YogYutiResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(yogYutiResponse: YogYutiResponse) {
                            mYogYutiResponse = yogYutiResponse
                            callback.onSuccess(mYogYutiResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getYogYutiResponseAsync(yogYutiRequestBody: YogYutiRequestBody, callback: DashaCallback<YogYutiResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyYogYutiText(Utils.KEY_VALUE, yogYutiRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<YogYutiResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(yogYutiResponse: YogYutiResponse) {
                            mYogYutiResponse = yogYutiResponse
                            callback.onSuccess(mYogYutiResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getHoroscopeResponse(horoscopeRequestBody: HoroscopeRequestBody, callback: DashaCallback<HoroscopeResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getHoroscope(Utils.KEY_VALUE, horoscopeRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<HoroscopeResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(horoscopeResponse: HoroscopeResponse) {
                            mHoroscopeResponse = horoscopeResponse
                            callback.onSuccess(mHoroscopeResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getHoroscopeResponseAsync(horoscopeRequestBody: HoroscopeRequestBody, callback: DashaCallback<HoroscopeResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getHoroscope(Utils.KEY_VALUE, horoscopeRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<HoroscopeResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(horoscopeResponse: HoroscopeResponse) {
                            mHoroscopeResponse = horoscopeResponse
                            callback.onSuccess(mHoroscopeResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getHealthResponse(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<HealthResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyHealthText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<HealthResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(healthResponse: HealthResponse) {
                            mHealthResponse = healthResponse
                            callback.onSuccess(mHealthResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getHealthResponseAsync(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<HealthResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyHealthText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<HealthResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(healthResponse: HealthResponse) {
                            mHealthResponse = healthResponse
                            callback.onSuccess(mHealthResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getMarriedLifeResponse(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<MarriedLifeResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyMarriedLifeText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<MarriedLifeResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(marriedLifeResponse: MarriedLifeResponse) {
                            mMarriedLifeResponse = marriedLifeResponse
                            callback.onSuccess(mMarriedLifeResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getMarriedLifeResponseAsync(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<MarriedLifeResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyMarriedLifeText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<MarriedLifeResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(marriedLifeResponse: MarriedLifeResponse) {
                            mMarriedLifeResponse = marriedLifeResponse
                            callback.onSuccess(mMarriedLifeResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getOccupationResponse(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<OccupationResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyOccupationText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<OccupationResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)
                        }

                        override fun onNext(occupationResponse: OccupationResponse) {
                            mOccupationResponse = occupationResponse
                            callback.onSuccess(mOccupationResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getOccupationResponseAsync(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<OccupationResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyOccupationText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<OccupationResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)
                        }

                        override fun onNext(occupationResponse: OccupationResponse) {
                            mOccupationResponse = occupationResponse
                            callback.onSuccess(mOccupationResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getParentsResponse(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<ParentsResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyParentsText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<ParentsResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(parentsResponse: ParentsResponse) {

                            mParentsResponse = parentsResponse
                            callback.onSuccess(mParentsResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getParentsResponseAsync(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<ParentsResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyParentsText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<ParentsResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(parentsResponse: ParentsResponse) {

                            mParentsResponse = parentsResponse
                            callback.onSuccess(mParentsResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    fun getChildrenResponse(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<ChildrenResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyChildrenText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribe(object : Subscriber<ChildrenResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(childrenResponse: ChildrenResponse) {
                            mChildrenResponse = childrenResponse
                            callback.onSuccess(mChildrenResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    fun getChildrenResponseAsync(predictionRequestBody: PredictionRequestBody, callback: DashaCallback<ChildrenResponse>) {

        try {

            mCompositeSubscription.add(RestProvider.getDashaService().getOnlyChildrenText(Utils.KEY_VALUE, predictionRequestBody)
                    .retryWhen(RetryWithDelay(3, 2000))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : Subscriber<ChildrenResponse>() {
                        override fun onCompleted() {

                        }

                        override fun onError(e: Throwable) {
                            callback.onError(e)

                        }

                        override fun onNext(childrenResponse: ChildrenResponse) {
                            mChildrenResponse = childrenResponse
                            callback.onSuccess(mChildrenResponse!!)

                        }
                    }))
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

}
