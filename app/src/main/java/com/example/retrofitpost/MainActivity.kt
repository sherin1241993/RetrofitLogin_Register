package com.example.retrofitpost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but_Register.setOnClickListener {
            var intent = Intent(this , RegisterScreen::class.java)
            startActivity(intent)
        }
    }
}