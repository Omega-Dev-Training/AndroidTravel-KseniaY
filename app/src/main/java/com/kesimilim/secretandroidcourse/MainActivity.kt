package com.kesimilim.secretandroidcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printAppInfo()
    }

    private fun printAppInfo() {
        Log.d("AppInfo", "${BuildConfig.APPLICATION_ID} v${BuildConfig.VERSION_NAME}(${BuildConfig.VERSION_CODE})")
    }
}