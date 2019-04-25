package com.example.gabriel.kotlinsqlite

import android.media.Image
import java.util.*

//ExtendemosParcelable pra que o usuario possa ser passado de uma activity pra outra
//atraves de uma extra inserted
class Usuario(nome: String, email: String, pass: String){
    var id: Int = -1
    var nome: String = nome
    var email: String = email
    var pass: String = pass
    var created: Date = Date()
    lateinit var foto: Image

}
