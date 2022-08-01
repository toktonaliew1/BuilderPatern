package com.example.builderpatern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.TypedArrayUtils.getText
import com.example.builderpatern.Singleton.getData
import com.example.builderpatern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.setText.text = Singleton.getData()
    }
}