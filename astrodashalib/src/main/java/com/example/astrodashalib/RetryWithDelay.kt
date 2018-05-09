package com.example.astrodashalib

import rx.Observable
import rx.functions.Func1
import java.util.concurrent.TimeUnit

class RetryWithDelay(private val maxRetries: Int, private val retryDelayMillis: Int) : Func1<Observable<out Throwable>, Observable<*>> {
    private var retryCount: Int = 0

    init {
        this.retryCount = 0
    }

    override fun call(attempts: Observable<out Throwable>): Observable<*> {
        return attempts
                .flatMap { throwable ->
                    if (++retryCount < maxRetries) {
                        // When this Observable calls onNext, the original
                        // Observable will be retried (i.e. re-subscribed).
                        Observable.timer(retryDelayMillis.toLong(),
                                TimeUnit.MILLISECONDS)
                    } else Observable.error<Any>(throwable)

                    // Max retries hit. Just pass the error along.
                }
    }
}