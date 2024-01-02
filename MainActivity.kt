package com.idekhail.asa_app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      //  getWindow().requestFeature(Window.FEATURE_NO_TITLE)
     //   getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
      //      WindowManager.LayoutParams.FLAG_FULLSCREEN)

        Thread.sleep(1000)
        installSplashScreen()

        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)

        var login = findViewById<Button>(R.id.login)
        var close = findViewById<Button>(R.id.close)
        var clear = findViewById<Button>(R.id.clear)


        login.setOnClickListener{
            if(username.text.toString().trim() == "a" && password.text.toString() == "123"){
                val i = Intent(this, SecondActivity::class.java)
                startActivity(i)
            }
        }
        close.setOnClickListener {
            System.exit(-1)
        }
        clear.setOnClickListener {
            username.text.clear()
            password.text.clear()
        }
    }
}