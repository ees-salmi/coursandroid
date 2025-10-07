package com.example.coursandroid

import android.R

open class voiture(var mar: String, var mat: String, var num:Int){

     fun afficher(){
        println("c est une $mar");
    }

    fun getNum(): Int {
        return num*2
    }
}

class camion( mar: String,  mat: String,  num:Int, var poids : Float) : voiture(mar,mat,num) {


}

fun main(){
    var v = voiture("ford","Z344",12)
    var c = camion("totyota","Z344",12,123f)

    v.afficher()
    var numr =  v.getNum()








}
