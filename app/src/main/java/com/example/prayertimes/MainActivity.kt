package com.example.prayertimes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.prayertimes.model.Items
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), ISalahView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SalahPresenter(this).getDataFromApi("london")
    }

    @SuppressLint("WrongViewCast")
    override fun onDataCompleteFromApi(salah: Items) {
        findViewById<TextView>(R.id.fajr_time).text = salah.fajr
        findViewById<TextView>(R.id.sunrise_time).text = salah.shurooq
        findViewById<TextView>(R.id.dhuhr_time).text = salah.dhuhr
        findViewById<TextView>(R.id.asr_time).text = salah.asr
        findViewById<TextView>(R.id.maghrib_time).text = salah.maghrib
        findViewById<TextView>(R.id.isha_time).text = salah.isha
    }

    override fun onDataErrorFromApi(throwable: Throwable) {
        error("Error ----> ${throwable.localizedMessage}")
        Toast.makeText(this, "Error ${throwable.localizedMessage}", Toast.LENGTH_LONG).show()

    }
}