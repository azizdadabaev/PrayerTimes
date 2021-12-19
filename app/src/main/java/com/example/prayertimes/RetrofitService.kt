package com.example.prayertimes

import android.telecom.Call
import com.example.prayertimes.model.SalahTimeDataClass
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {
    @GET("{city}.json?key=588ecfd00585363ce0748be2b1946ab0")
    abstract fun getApi(@Path("city")city:String):retrofit2.Call<SalahTimeDataClass>

    companion object{
            fun create(): RetrofitService{
                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://muslimsalat.com")
                    .build()
                return retrofit.create(RetrofitService::class.java)
            }
        }
}