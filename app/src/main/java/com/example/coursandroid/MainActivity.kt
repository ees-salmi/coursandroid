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

class Camion1( mar: String,  mat: String,  num:Int, var poids : Float) : Voiture(mar,mat,num) {
}

interface Vehicule{

    fun demarrer()
    fun freiner()
}

class Car(val m:String,val model:String) : Vehicule {
    override fun demarrer() {
        println("la $model est demarer")
    }

    override fun freiner() {
        println("la voiture à freiner")
    }
}

class Camion : Vehicule{

    override fun demarrer() {
        println("le camion a demarer")
    }
    override fun freiner() {
        println("le camion à freiner")
    }
}

class Adam {
    var age : Int = 0
    var nom : String = ""
    fun getNom() :String {
        return nom
    }
    fun getAge() : Int{
        return age
    }
}
fun main(){

    var a = Car("AUDI","A8");
    //a.demarrer()
    //a.freiner()

    var c = Camion()
    //c.demarrer()
    //c.freiner()
    var name1 : String? = null
    var name2 : String = name1 ?: "amine"
    println(name2)

    var obj = Adam()
    obj.nom= "adam"
    obj.age = 23









}
