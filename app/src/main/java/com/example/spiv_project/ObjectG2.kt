package com.example.spiv_project
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.libferiprostori.Data
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_object_g3.*
import java.util.*

class ObjectG2:AppCompatActivity(), AdapterView.OnItemSelectedListener {
    var floor_images: ArrayList<String>? = null
    var floor_names: ArrayList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_object_g3)
        setSupportActionBar(findViewById(R.id.toolbar))

        //val imgView:ImageView = findViewById(R.id.imageViewMain)
        //imgView.setImageResource(R.drawable.g2groundfloor)
        floor_images = Data.getBuilding("g2").floor_images
        floor_names = Data.getBuilding("g2").floor_names

        val dropdown:Spinner = findViewById(R.id.spinner01)
        ArrayAdapter.createFromResource(
            this,
            R.array.floorsG2,
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
    fun getImageId(context: Context, imageName: String): Int {
        return context.getResources()
            .getIdentifier("drawable/$imageName", null, context.getPackageName())
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        val imgView:ImageView = findViewById(R.id.imageViewMain)
        //imgView.setImageDrawable()
        if (text == "Ground floor")
            //imgView.setImageResource(floor_images?.get(0)!!)
            //Toast.makeText(applicationContext, R.drawable.g2secondfloor.toString(), Toast.LENGTH_SHORT).show()
        else if(text == "First floor")
            Toast.makeText(applicationContext, floor_names?.get(0)!!.toString(), Toast.LENGTH_SHORT).show()
            //imgView.setImageResource(getImageId(this, floor_images?.get(1)!!))
        /*
        - !! - garantujemo da input ne bo null
        - ?.get - safe input ker je array na začetku enak null.
        ==========================================   My Conclusion   ==========================================
            Problem je v tem da nič ne dobim iz floor_names ne vem ali so vsi razredi vredu-konstruktori, to bi se naj dalo preverit.
            Če bi dobio string oz. ime slike iz razreda Data.Buildings(key).floor_names , potem bi uporabil ta string da ga konvertujem v id slike iz drawables
            Potem bi se tisti id uporabil kot parameter v imgView.setImageResource(Int). setImageResource sprejema samo int kot parameter zato bi naj konvertovali
            ime slike v njen id. Id ne moremo vesti vnaprej in mislim da je ovo edini način če bi želeli da ovako setujemo slike v imgview.
        ========================================================================================================
        */
        else if(text == "Middle floor")
            imgView.setImageResource(getImageId(this, floor_images?.get(2)!!))
        else if(text == "Second floor")
            imgView.setImageResource(R.drawable.g2secondfloor)
        else if(text == "Third floor")
            imgView.setImageResource(R.drawable.g2thirdfloor)
        else if(text == "Fourth floor")
            imgView.setImageResource(R.drawable.g2fourthfloor)

    }
}