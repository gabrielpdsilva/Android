package com.example.gabriel.ankocadastro

import android.os.Bundle
//import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_list_view.*


class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        //setSupportActionBar(toolbar)
        /*

        fab.setOnClickListener{view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

        }*/

        var listView = findViewById<ListView>(R.id.listview1)
        val arrayDeLinhas: ArrayList<String> = ArrayList<String>()
        arrayDeLinhas.add("Primeira linha...")
        arrayDeLinhas.add("Segunda linha...")
        arrayDeLinhas.add("Terceira linha...")
        arrayDeLinhas.add("Quarta linha...")
        arrayDeLinhas.add("Quinta linha...")
        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayDeLinhas)

    }
}
