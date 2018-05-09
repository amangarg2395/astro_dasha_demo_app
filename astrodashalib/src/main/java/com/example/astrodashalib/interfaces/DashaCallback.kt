package com.example.astrodashalib.interfaces

interface DashaCallback<T> {


    fun onSuccess(data: T)

    fun onError(e: Throwable)

}
