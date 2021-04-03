package com.example.spiv_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.DialogInterface
import kotlinx.android.synthetic.main.activity_main.*
import android.app.AlertDialog
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<ImageButton>(R.id.profil)
        num1.setOnClickListener{
            Toast.makeText(applicationContext, "HENLOOO PROFILE", Toast.LENGTH_SHORT).show()
        }
    }
}
