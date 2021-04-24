package com.example.spiv_project

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        setSupportActionBar(findViewById(R.id.toolbar))

        val objG3 = findViewById<ImageView>(R.id.objektG3)
        objG3.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object G3", Toast.LENGTH_SHORT).show()
            val activity2Intent = Intent(applicationContext, ShowBuliding::class.java)
            startActivity(activity2Intent)
        }
        val objG2 = findViewById<ImageView>(R.id.objektG2)
        objG2.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object G2", Toast.LENGTH_SHORT).show()
            val activity3Intent = Intent(applicationContext, ObjectG2::class.java)
            startActivity(activity3Intent)
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}