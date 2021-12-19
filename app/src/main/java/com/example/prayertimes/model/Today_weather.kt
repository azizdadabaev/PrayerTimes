package com.example.prayertimes.model

import com.google.gson.annotations.SerializedName

data class Today_weather (

    @SerializedName("pressure") val pressure : Int,
    @SerializedName("temperature") val temperature : Int
)