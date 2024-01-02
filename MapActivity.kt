package com.idekhail.asa_app3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MapActivity : AppCompatActivity() {

   //private lateinit var latitude: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val latitude = findViewById<EditText>(R.id.latitude)
        var longitude = findViewById<EditText>(R.id.longitude)

        var back = findViewById<Button>(R.id.back1)
        var map = findViewById<Button>(R.id.map)

        back.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        map.setOnClickListener{
            openMap(latitude.text.toString(), longitude.text.toString())
        }
    }
    fun openMap(latitude:String, longitude:String){
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse("geo:$latitude,$longitude")
        val chooser = Intent.createChooser(i,"open map")
        startActivity(chooser)
    }

}