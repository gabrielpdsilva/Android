package com.example.gabriel.ankocadastro

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.*
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD



class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        var texto: TextView

        lateinit var edId: TextView
        lateinit var edNomeUsuario: TextView
        lateinit var edEmail: TextView
        lateinit var edPass: TextView


        verticalLayout {
            padding = dip(30)
            background = ColorDrawable(Color.parseColor("#c1c6ff")) //F8F2F2


//*********************************************************************************************************************************//

            //Textos e barras pra digitar

            texto = textView {
                text = "Tela de cadastro utilizando somente anko"
                textSize = 24f
                textColor = Color.DKGRAY
                textAlignment = View.TEXT_ALIGNMENT_CENTER //CENTER can be INHERIT GRAVITY TEXT_START TEXT_END VIEW_START VIEW_END
            }

            edId = editText {
                hint = "Nome"
                textSize = 18f
                // textColor = Color.GREEN
                // textAlignment = View.TEXT_ALIGNMENT_CENTER
            }

            edNomeUsuario = editText {
                hint = "Nome de usuário"
                textSize = 18f
                 // textAlignment = View.TEXT_ALIGNMENT_GRAVITY
            }

            edEmail = editText {
                hint = "E-mail"
                textSize = 18f
            }

            edPass = editText {
                hint = "Senha"
                inputType =  TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD //ou inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
                textSize = 18f
            }

//*********************************************************************************************************************************//

            //Botões

            var buttonClear: Button = button("Limpar"){
                backgroundColor = R.color.colorPrimary
                textColor = Color.WHITE
                textSize = 16f

                setOnClickListener(View.OnClickListener {

                    // text.clear() não estava funcionando

                    edId.setText("")
                    edNomeUsuario.setText("")
                    edEmail.setText("")
                    edPass.setText("")
                })
            }.lparams(){topMargin = dip(6);bottomMargin = dip(6)}


            var buttonList: Button = button("Listar"){
                backgroundColor = R.color.colorPrimary
                textColor = Color.WHITE
                textSize = 16f

                setOnClickListener(View.OnClickListener {

                    toast("botão Listar clicado")
                    startActivity<ListViewActivity>()
                })
            }.lparams(){topMargin = dip(6);bottomMargin = dip(6)}
        }
    }

}