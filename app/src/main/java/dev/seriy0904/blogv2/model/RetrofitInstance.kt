package dev.seriy0904.blogv2.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val instance: RetrofitRequests by lazy {
        Retrofit.Builder().baseUrl("http://localhost:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitRequests::class.java)
    }
}