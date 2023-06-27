package com.example.coutries.service

import com.example.coutries.model.Result
import retrofit2.Call
import retrofit2.http.GET

interface GetCountryDataService {

    // Retrofit Interface
    @GET("countries")
    fun getResult(): Call<Result?>?
}