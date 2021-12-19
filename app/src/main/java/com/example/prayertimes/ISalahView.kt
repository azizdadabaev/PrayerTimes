package com.example.prayertimes

import android.content.ClipData
import com.example.prayertimes.model.Items

interface  ISalahView {
    fun onDataCompleteFromApi(salah: Items)
    fun onDataErrorFromApi(throwable: Throwable)
}