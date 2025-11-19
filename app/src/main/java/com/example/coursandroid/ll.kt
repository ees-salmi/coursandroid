package com.example.coursandroid
import kotlinx.coroutines.*

data class Roue(val nbr : Int)
data class Cars(val model : String, val name : String){
    lateinit var nbrDesRoue : Roue
    init{
        nbrDesRoue = Roue(3)
    }
    fun afficher() = "le nombre de roue est $nbrDesRoue"
}

fun palindrome( str1 : String){
    if( str1 == str1.reversed()){
        println("oui palindrone") // aalaa , aya
    }
    else{
        println("non c pas palindrone")
    }
}

fun rectangle(larg : Double, long : Double):Double{
    return larg * long
}

fun main() = runBlocking {
        val resultat: Deferred<Int> = async {
            delay(1000)
            10 + 20
        }

        println("En attente du résultat...")
        val valeur = resultat.await()
        println("Résultat = $valeur")

    launch {
        println("Tâche 1 : je commence…")
        delay(1000)
        println("Tâche 1 : j'ai terminé !")
    }

    println("Je continue mon programme pendant que la tâche 1 travaille…")
}