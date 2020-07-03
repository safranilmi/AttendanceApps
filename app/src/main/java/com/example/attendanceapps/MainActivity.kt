package com.example.attendanceapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun loadScanLocation(){
        rippleBackground.startRippleAnimation()
        tvScanning.visibility = View.VISIBLE
        tvCheckInSuccess.visibility = View.GONE
    }

    private fun stopScanLocation(){
        rippleBackground.stopRippleAnimation()
        tvScanning.visibility = View.GONE
    }
}
