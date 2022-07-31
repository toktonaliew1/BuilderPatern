package com.example.builderpatern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val configuration: Configuration = ConfigurationBuilder()
            .setLatency(100)
            .setUserColor("blue")
            .setSensitivity(true)
            .build()
        return
    }
}