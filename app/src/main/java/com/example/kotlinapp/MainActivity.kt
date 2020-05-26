package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btn : Button = findViewById(R.id.button)
        Btn.setOnClickListener({
            val text: TextView = findViewById(R.id.text)
            text.setText("Hello World It is Button")
        })
    }
}
