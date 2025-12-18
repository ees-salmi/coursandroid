package com.example.coursandroid

import androidx.compose.runtime.Composition

class CompteBan(var solde : Double, var num : String) {

    fun ajouterMonant(montant : Double){
        this.solde = this.solde + montant
    }

    fun tirerMonant(montant : Double){
        this.solde = this.solde - montant
    }

    fun afficher(){
        println(this.solde)
    }

    @Override
    override fun toString(): String {
        return "solde $solde"
    }
}

class Banques(val loc : String, var comptes : ArrayList<CompteBan>){
    fun ajouterComptes(compte : CompteBan){
        comptes.add(compte)
    }

    fun supprimerCompte(compte : CompteBan){
        if(compte.solde == 0.0){
            comptes.remove(compte)
        }

    }
}
fun main(){
    var c = CompteBan(2000.5,"MAR234")
    c.afficher()

    c.ajouterMonant(2000.5)
    c.afficher()

    var liste = arrayListOf<CompteBan>()
    var banque1 = Banques("deroua",liste)
    var rime = CompteBan(5000.0,"MAR1234")
    banque1.ajouterComptes(rime)
    banque1.ajouterComptes(c)
    for(compte in liste){
        println(compte)
    }
}