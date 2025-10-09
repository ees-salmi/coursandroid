package com.example.coursandroid

import java.util.Date
import kotlin.math.pow

class Complexe(val re:Float , val im:Float){
    override fun toString(): String {
        return "$re + i $im"
    }

    fun calculerModule(){

    }
}

class Point(val x : Float,val y : Float)

class Circle(val centre:Point, val rayon: Float){

    fun getSurface() : Double{
        return 2* 3.14 * rayon.pow(2)
    }

    fun getVolume() : Double {
        val v = 4/3 * 3.14 * rayon.pow(3)

        return v
    }
}
open class Voiture(var mar: String, var mat: String, var num:Int){

     fun afficher(){
        println("c est une $mar");
    }

    fun getNumber(): Int {
        return num*2
    }
}

class Camion( mar: String,  mat: String,  num:Int, var poids : Float) : Voiture(mar,mat,num) {



}

fun main(){

    val pn : Point = Point(2f,3f,)
    var c3 = Circle(pn,2.3f)

    val surf = c3.getSurface()
    println(surf)
    var v = Voiture("ford","Z344",12)
    var c = Camion("totyota","Z344",12,123f)

    var point = Point(2f,3f)
    var cir = Circle(point,5f)

    var z1 = Complexe(2f,4f)
    var z2 = Complexe(3f,3f)
    fun produitcomplex( z : Complexe, z2 : Complexe) : Complexe{

        val z3 = Complexe(z.re*z2.re - z.im*z2.im,z.re*z2.im+z2.im +z2.im*z.re )
        return z3
    }
    print(z1)
    println("z1 = ${z2.re} + ${z2.im} i")









}
