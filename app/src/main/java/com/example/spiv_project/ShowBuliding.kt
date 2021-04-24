package com.example.spiv_project

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_object_g3.*

class ObjectG3 : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_g3)
        setSupportActionBar(findViewById(R.id.toolbar))

        val dropdown:Spinner = findViewById(R.id.spinner01);

        ArrayAdapter.createFromResource(
            this,
            R.array.floors3,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            dropdown.adapter = adapter
            spinner01.onItemSelectedListener = this
        }

        Toast.makeText(applicationContext, "Taking you to FERI map", Toast.LENGTH_SHORT).show()
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        val imgView:ImageView = findViewById(R.id.imageViewMain)
        //imgView.setImageResource(R.drawable.map)
        if (text == "Ground floor")
            imgView.setImageResource(R.drawable.g3pritlicje)
        else if(text == "Basement")
            imgView.setImageResource(R.drawable.g3basement)
        else if(text == "First floor")
            imgView.setImageResource(R.drawable.g3firstfloor)
        else if(text == "Second floor")
            imgView.setImageResource(R.drawable.g3secondfloor)

    }
}
