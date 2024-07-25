package com.zevenApp.onecrwrpl

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val one = findViewById(R.id.numberone)
        val two = findViewById(R.id.numbertwo)
        val plus = findViewById(R.id.plus)
//        val min = findViewById(R.id.minus)
//        val times = findViewById(R.id.times)
//        val divide = findViewById(R.id.divide)
        val equal = findViewById(R.id.equal)
//        val operasi

        fun hitungBilangan(){ equal = one + two
        }

        plus.setOnClickListener{
            hitungBilangan()
        }
//        min.setOnClickListener{
//            val operasi = min
//        }
//        times.setOnClickListener{
//            val operasi = times
//        }
//        divide.setOnClickListener{
//            val operasi = divide
//        }

    }
}