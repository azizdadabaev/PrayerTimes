package com.example.prayertimes.model

import com.google.gson.annotations.SerializedName

data class SalahTimeDataClass(

    @SerializedName("title")
    val title: String,
    @SerializedName("query")
    val query: String,
    @SerializedName("for")
    val forX: String,
    @SerializedName("method")
    val method: Int,
    @SerializedName("prayer_method_name")
    val prayer_method_name: String,
    @SerializedName("daylight")
    val daylight: Int,
    @SerializedName("timezone")
    val timezone: Int,
    @SerializedName("map_image")
    val map_image: String,
    @SerializedName("sealevel")
    val sealevel: Int,
    @SerializedName("today_weather")
    val today_weather: Today_weather,
    @SerializedName("link")
    val link: String,
    @SerializedName("qibla_direction")
    val qibla_direction: Double,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("postal_code")
    val postal_code: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("country_code")
    val country_code: String,
    @SerializedName("items")
    val items: List<Items>,
    @SerializedName("status_valid")
    val status_valid: Int,
    @SerializedName("status_code")
    val status_code: Int,
    @SerializedName("status_description")
    val status_description: String
)