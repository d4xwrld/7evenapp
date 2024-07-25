package com.zevenApp.onecrwrpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LandingPage : AppCompatActivity() {

    var bilangan : Int=0

    fun tambahBilangan(){
        bilangan++

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landing_page)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets

//        val textView : TextView = findViewById(R.id.txt_loading)
        val button : Button = findViewById(R.id.btn_submit)

        button.setOnClickListener{
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
//            tambahBilangan()
//            textView.text = bilangan.toString()
        }
    }
}