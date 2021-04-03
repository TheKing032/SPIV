package com.example.spiv_project

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapButton = findViewById<ImageView>(R.id.map)
        mapButton.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to FERI map", Toast.LENGTH_SHORT).show()
            val activity2Intent = Intent(applicationContext, MapActivity::class.java)
            startActivity(activity2Intent)
        }
    }
}
