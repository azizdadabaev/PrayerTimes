package com.example.prayertimes.model

import com.google.gson.annotations.SerializedName

data class Items (

    @SerializedName("date_for") val date_for : String,
    @SerializedName("fajr") val fajr : String,
    @SerializedName("shurooq") val shurooq : String,
    @SerializedName("dhuhr") val dhuhr : String,
    @SerializedName("asr") val asr : String,
    @SerializedName("maghrib") val maghrib : String,
    @SerializedName("isha") val isha : String
)