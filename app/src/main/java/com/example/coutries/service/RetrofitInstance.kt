package com.example.coutries.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public class RetrofitInstance {

    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://api.printful.com/"

    // Singleton Pattern used to create an instance of Retrofit

    // Singleton Pattern used to create an instance of Retrofit
    public fun getService(): GetCountryDataService? {

        // if instance is not created
        if (retrofit == null) {
            retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
        }

        // after instance created
        return retrofit?.create(GetCountryDataService::class.java)
    }

}