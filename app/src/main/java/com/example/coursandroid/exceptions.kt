package com.example.coursandroid

import java.lang.ArithmeticException

class Salles(val numero:Int,nbrPlaces:Int){
    fun getNumber(){
        println(numero)
    }

    fun getException(){
        val ex = IndexOutOfBoundsException()
        throw ex
    }


}

fun main(){
    /*val lists = arrayListOf<String>("ali","traik")
    println("debut de programme")

    try {
        println(lists.get(1))
    } catch (e : Exception){
        println("essayer de donner une autre index")
    }

    println("fin du programme")*/

    val s = Salles(1,20)
    s.getNumber()

    try {
        s.getException()
    }catch (e : Exception){
        println("exception lancée")
    }

    println("fin du programme")


}