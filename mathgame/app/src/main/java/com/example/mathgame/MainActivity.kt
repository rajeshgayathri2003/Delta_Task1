package com.example.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var buttonnum1: Button
    private lateinit var buttonnum2: Button
    private lateinit var tvnum28: TextView
    private lateinit var tvnum20: TextView
    private lateinit var buttontext1: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonnum1 = findViewById(R.id.buttonnum1)
        buttonnum2 = findViewById(R.id.buttonnum2)
        tvnum20 = findViewById(R.id.tvnum20)
        tvnum28 = findViewById(R.id.tvnum28)
        buttontext1 = findViewById(R.id.buttontext1)

        buttonnum1.setOnClickListener(){sendNum()}
        //val m = sendNum()
        //.i(m.toString(), "Hello")
        //

    }

    private fun setNum(num: CharSequence) {
        buttonnum1.text= num
        //text.text = num.toString()


    }

    fun sendNum() {
        val num1 = tvnum20.text
        val num2 = tvnum28.text
        buttontext1.setText(num1.toString())
        //buttontext1.setOnClickListener(){buttonnum1.text = num1.toString() }

        //return num2


    }


    }
