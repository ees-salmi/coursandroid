package com.example.coursandroid

interface Tva {

    val propiete : Int
    fun getTva()
    fun reduireTva()
}

class Tvav1(val montant: Float) : Tva{
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
    }
}

fun main(){
    var p = Personne.stagiaire(222.2,202)
    var ad = Personne.administrateur(222.2)
    definirFonction(p)
    var a = Tvav1(5000f)
    var b = Tvav2(5000f)



}
