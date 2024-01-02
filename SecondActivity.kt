package com.idekhail.asa_app3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    lateinit var call_web: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        call_web = findViewById<EditText>(R.id.call_web)

        var next = findViewById<Button>(R.id.next)
        var call = findViewById<Button>(R.id.call)
        var web = findViewById<Button>(R.id.web)


        next.setOnClickListener{
            val i = Intent(this, MapActivity::class.java)
            startActivity(i)
        }

        call.setOnClickListener{
            callPhone(call_web.text.toString())
        }
        web.setOnClickListener{
            openWeb(call_web.text.toString())
        }
    }
    private fun callPhone(c:String){
        val i = Intent(Intent.ACTION_CALL, Uri.parse("tel:$c"))
        startActivity(i)
    }
    fun openWeb(w:String){
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(w)
        val chooser = Intent.createChooser(i,"open Web")
        startActivity(chooser)
    }
}