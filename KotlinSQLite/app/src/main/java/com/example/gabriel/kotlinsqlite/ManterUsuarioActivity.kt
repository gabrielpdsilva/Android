package com.example.gabriel.kotlinsqlite

import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
//importandroid.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import org.jetbrains.anko.*


class ManterUsuarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//setContentView(R.layout.activity_manter_usuario)
        //setSupportActionBar(toolbar)

        //fab.setOnClickListener { view ->
        //    Snackbar.make(view, "Replacewithyourownaction", Snackbar.LENGTH_LONG)
        //        .setAction("Action", null).show()
        //}

        lateinit var edId: TextView
        lateinit var edNome: TextView
        lateinit var edEmail: TextView
        lateinit var edPass: TextView
        var bntListar: TextView

        var edCreated: TextView

        verticalLayout{

            padding = dip(100)
            background = ColorDrawable(Color.parseColor("#F8F2F2"))

            edId = editText{
                hint = "Id Hint"
                textSize = 24f
                textColor = Color.BLACK
//CENTER canbe INHERIT GRAVITY TEXT_START TEXT_END VIEW_START VIEW_END
                textAlignment = View.TEXT_ALIGNMENT_GRAVITY
            }
            edNome = editText{
                hint = "Nome Hint"
                textSize = 24f
                textAlignment = View.TEXT_ALIGNMENT_GRAVITY
            }
            edEmail = editText{
                hint = "email"
                textSize = 24f
            }
            edPass = editText{
                hint = "Pass"
                textSize = 24f
            }
            edCreated = editText{
                hint = "EmailHint"
                textSize = 24f
            }
            var button: Button = button("Incluir") {
                setOnClickListener(View.OnClickListener{

                    if(edNome.text.toString().equals("")){
                        toast("Nenhum campo preenchido!")
                    }else{
                        var u: Usuario = Usuario(
                                edNome.text.toString(),
                                edEmail.text.toString(),
                                edPass.text.toString()
                        )

                        UsuarioRepository(getApplicationContext()).create(u)
                        toast("toast normal: Usuario Incluido com sucesso")
                    }

                })
            }


    /*                alert(
                            "Usuario Cadastrado com Sucesso",
                            "Voce ja conhecia o toast com maior duracao?") {
                        yesButton{ longToast("Esse toast dura mais tempo…") }
                        noButton{}
                    }.show()
*/

                //    toast("toast normal: Usuario Incluido com sucesso")


            //******************************BOTÃO LISTAR************************************************************//
            /*
            var btnList: Button = button("Listar") {

                toast("Listar Usuarios...")
                var listU: List<Usuario> = UsuarioRepository(getApplicationContext()).findAll()
                for (u:Usuario in listU){
                    toast(u.nome)
                }
            } */

            var btnList: Button = button("Listar"){
                setOnClickListener(View.OnClickListener {

                    toast("Listando cadastros...")
                    var listU: List<Usuario> = UsuarioRepository(getApplicationContext()).findAll()
                    for(u:Usuario in listU){
                        toast(u.nome)
                    }
                })
            }

        }
    }
}
