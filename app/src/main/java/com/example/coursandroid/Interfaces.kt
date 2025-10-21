package com.example.coursandroid

interface Tva {

    val propiete : Int
    fun getTva()
    fun reduireTva()
}

open class Tvav1(val montant: Float) : Tva{
    override val propiete: Int
        get() = 23

    override fun getTva() {
        val m : Double = montant - montant*0.2
        println("le montant de apres reduction de tva est 20% est : $m")
    }

    override fun reduireTva() {
        println("apres reducion de tva c est 15%")
    }
}

class Tvav2(val montant: Float) : Tva {
    override val propiete: Int
        get() = 23
    override fun getTva() {
        val m : Double = montant - montant*0.15
        println("le montant de apres reduction de tva est 15% est : $m")
    }

    override fun reduireTva() {
        println("apres reducion de tva v2 c est 15%")
    }
}

sealed class Personne{
    data class stagiaire(val cne : Double,val groupe : Int) : Personne()
    data class Formateur(val cin : Double, val filiere :  String) : Personne()
    data class administrateur(val cin : Double) : Personne()
}

fun definirFonction(aamri : Personne){
    when(aamri){
        is Personne.stagiaire -> println("je suis stagiaire")
        is Personne.Formateur -> println("je uis formateur")
        is Personne.administrateur -> println("je suis admin")
        else -> 0
    }
}

class Calculer(val a:Int,val b :Int){
    fun va(a:Int) : Double{
        return a*a as Double
    }
    override fun  toString():String{
        return "a = $a and b $ = $b"
    }
}

fun main(){

    var tab : ArrayList<String> = arrayListOf()
    tab.add("ayoub")
    tab.add("adam")
    tab.add("rim")
    /*println(tab.get(0))
    tab.remove("ayoub")
    tab.removeAt(1)
    println(tab.size)
    println(tab.get(0))*/
    for(i in 0..tab.size-1 ){
        println(tab[i])
    }

    for(i in 0 until tab.size ){
        println(tab.get(i))
    }

    //creer une liste des des entiers est remplir la liste avec 5 entier puis afficher
    // les pair




}
