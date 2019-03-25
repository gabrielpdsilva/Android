package com.example.gabriel.projetoanko

class AppStaticServices{
    companion object{
        public fun login(username:String, password:String) : Boolean{
              var ret: Boolean = false
              if(username is String && password is String){
                   if(username.equals("Admin") && password.equals("admin123")){
                      ret = true;
                  }
             }
             return ret;
        }
    }
}