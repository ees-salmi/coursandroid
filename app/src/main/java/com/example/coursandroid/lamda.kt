package com.example.coursandroid

import android.text.format.DateFormat
import java.util.Date

fun getdates(): Date {

    return Date("2012-12-12")

}
fun sommer(a : Int, b : Int) : Int{
    return a + b
}

// lamda
val sommerlamda = {a : Int, b : Int -> a+b}
val diff = { c : Int, b : Int ->
    val s = "name"
    s.toString()

}

fun main(){
    println(sommerlamda(2,3))
    println(diff(2,2))
    println("debut de programme")

    try {
            val b = 10 / 0
    }catch (e : Exception){
        val b = 10
        println("exception lancé sans arret de programme")
    }
    println("fin de programme")

    val list : ArrayList<String> = arrayListOf("amine","yassine","ahmed")
    println(list.get(0))
    try {
        println(list.get(3))
    } catch (e : IndexOutOfBoundsException){
        println("l indice utilisé n existe pas dans la list")
    }
    // creer une class qui lance une exception puis handle the exception
    //throw java.lang.IndexOutOfBoundsException()

    //

}