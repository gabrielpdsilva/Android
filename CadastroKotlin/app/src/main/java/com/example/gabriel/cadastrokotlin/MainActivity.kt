package com.example.gabriel.cadastrokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

//Necessario importar o seguinte para funcionar:
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLimpar: Button = findViewById<Button>(R.id.btnLimpar)

        btnLimpar.setOnClickListener(View.OnClickListener {
            val txtNome = txtNome.text.clear()
            val txtUsuario = txtUsuario.text.clear()
            val txtEmail = txtEmail.text.clear()
            val txtSenha = txtSenha.text.clear()
        })
    }
}
