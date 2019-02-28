package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btLogin : Button = findViewById<Button>(R.id.btLogin)

            btLogin.setOnClickListener(View.OnClickListener { it:View!
                    val text ViewLogin: TextView = findViewById<TextView>(R.id.etUserName) as TextView
                    toast(textViewLogin.text) })
                    }
                    */
        }
    }
