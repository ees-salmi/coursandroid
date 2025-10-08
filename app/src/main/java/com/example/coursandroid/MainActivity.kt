package com.example.coursandroid

import java.util.Date
import kotlin.math.pow

class Point(val x : Float,val y : Float)

class circle(val centre:Point, val rayon: Float){

    fun getSurface() : Double{
        return 2* 3.14 * rayon.pow(2)
    }
}
open class voiture(var mar: String, var mat: String, var num:Int){

     fun afficher(){
        println("c est une $mar");
    }

    fun getNumber(): Int {
        return num*2
    }
}

class camion( mar: String,  mat: String,  num:Int, var poids : Float) : voiture(mar,mat,num) {



}

fun main(){
    var v = voiture("ford","Z344",12)
    var c = camion("totyota","Z344",12,123f)

    var point = Point(2f,3f)
    var cir = circle(point,5f)

    v.afficher()
    var numr =  v.getNumber()
    println(numr)








}
