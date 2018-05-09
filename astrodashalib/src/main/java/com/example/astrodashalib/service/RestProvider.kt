package com.example.astrodashalib.service

import com.example.astrodashalib.BuildConfig
import com.example.astrodashalib.utils.BaseConfiguration
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestProvider {


    companion object {


        fun getDashaService(): DashaService {
            return provideRxRetrofit().create(DashaService::class.java)
        }

        private fun provideRxRetrofit(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl(BaseConfiguration.BASE_URL)
                    .client(provideOkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build()
        }

        private fun provideOkHttpClient(): OkHttpClient {
            val client = OkHttpClient.Builder()
            if (BuildConfig.DEBUG) {
                client.addInterceptor(HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            client.addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder()
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-Type", "application/json")
                        .method(original.method(), original.body())
                        .build()
                chain.proceed(request)
            }
            client.connectTimeout(3, TimeUnit.MINUTES)
                    .readTimeout(3, TimeUnit.MINUTES)
                    .writeTimeout(3, TimeUnit.MINUTES)
            return client.build()
        }
    }
}