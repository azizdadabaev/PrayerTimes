package com.example.prayertimes;

import android.content.Context
import com.example.prayertimes.model.Items
import com.example.prayertimes.model.SalahTimeDataClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SalahPresenter(context: Context){
    val salahView = context as ISalahView

    fun getDataFromApi(city : String){
        RetrofitService.create()
            .getApi(city)
            .enqueue(object : Callback<SalahTimeDataClass>{
                override fun onResponse(
                    call: Call<SalahTimeDataClass>,
                    response: Response<SalahTimeDataClass>
                ) {
                    salahView.onDataCompleteFromApi(response.body()?.items?.get(0) as Items)
                }

                override fun onFailure(call: Call<SalahTimeDataClass>, t: Throwable) {
                    salahView.onDataErrorFromApi(t)
                }

            }
            )
    }
}