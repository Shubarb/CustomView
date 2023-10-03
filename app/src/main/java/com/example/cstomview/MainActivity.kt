package com.example.cstomview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customLayout = findViewById<CustomLinearLayout>(R.id.custom_layout)
        customLayout.setText("Custom Text")
        customLayout.setButtonText("Custom Button")

    }
}