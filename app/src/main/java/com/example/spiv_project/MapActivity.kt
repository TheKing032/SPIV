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
            val activity2Intent = Intent(applicationContext, ObjectG3::class.java)
            startActivity(activity2Intent)
        }

        val objG2 = findViewById<ImageView>(R.id.objektG2)
        objG2.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object G2", Toast.LENGTH_SHORT).show()
            val activity3Intent = Intent(applicationContext, ObjectG2::class.java)
            startActivity(activity3Intent)
        }

        val objG = findViewById<ImageView>(R.id.objektG)
        objG.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object G", Toast.LENGTH_SHORT).show()
            val activity4Intent = Intent(applicationContext, ObjectG::class.java)
            startActivity(activity4Intent)
        }

        val objF = findViewById<ImageView>(R.id.objektF)
        objF.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object F", Toast.LENGTH_SHORT).show()
            val activity5Intent = Intent(applicationContext, ObjectF::class.java)
            startActivity(activity5Intent)
        }

        val objE = findViewById<ImageView>(R.id.objektE)
        objE.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object E", Toast.LENGTH_SHORT).show()
            val activity6Intent = Intent(applicationContext, ObjectE::class.java)
            startActivity(activity6Intent)
        }

        val objC = findViewById<ImageView>(R.id.objektC)
        objC.setOnClickListener{
            Toast.makeText(applicationContext, "Taking you to Object C", Toast.LENGTH_SHORT).show()
            val activity7Intent = Intent(applicationContext, ObjectC::class.java)
            startActivity(activity7Intent)
        }

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}