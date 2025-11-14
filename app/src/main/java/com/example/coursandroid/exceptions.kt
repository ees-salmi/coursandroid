package com.example.coursandroid

import java.lang.ArithmeticException
class InvalidAgeException(val messages : String) : Exception(messages){

}
class InvalidNoteException(val messages : String) : Exception(messages){

}

class Eleve(val nom : String, val age :Int, val moy : Double){
    // constructeur primaire
    init {
        if(age >= 26 || age <= 18){
            throw InvalidAgeException("L’âge doit être entre 18 et 26")
        }
        else if(moy > 20 || moy < 0){
            throw InvalidNoteException(" l note doit etre entre 0 et 20")
        }
        else {
            println(" l objet a ete avec success")
        }
    }
    // cons second
    /*constructor(age : Int, nom : String, moy : Double, messgae : String) : this(nom,age,moy){
        if(age >= 26 || age <= 18){
            throw InvalidAgeException("L’âge doit être entre 18 et 26")
        }
    }*/
}
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

    println("debut de programme")

    try {
        val eleve1 = Eleve("amine", 19, 21.0)
    } catch (e : InvalidNoteException){
        println(e.message)
    }
    println("fin du programme")


    /*val lists = arrayListOf<String>("ali","traik")
    println("debut de programme")

    try {
        println(lists.get(1))
    } catch (e : Exception){
        println("essayer de donner une autre index")
    }

    println("fin du programme")

    val s = Salles(1,20)
    s.getNumber()

    try {
        s.getException()
    }catch (e : Exception){
        println("exception lancée")
    }

    println("fin du programme")*/


}