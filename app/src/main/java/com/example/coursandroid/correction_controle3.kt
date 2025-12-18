package com.example.coursandroid

fun calculersommeage(age1 :Int, age2 :Int): Double {
    var somme  = 0.0
     somme = age1.toDouble() + age2.toDouble()
    return  somme
}

fun soustraction(a:Double, b: Double): String{
     val sous = a + b
    return sous.toString()
}
open class ComptesCIH(val type:String)
open class ComptesPaPal(val type:String)

class CompteTrouveException(message:String) : Exception(message)
enum class TypeCompte{PERSONNE,ENTREPRISE,COOPERATIVE}

class Compte(val numero:String,var solde : Double,val nomProprietaire : String,val typeCompte : TypeCompte)
interface InterfaceBanque{
    val listComptes : ArrayList<Compte>
    fun ajouterCompte(compte:Compte)
    fun rechercherCompte(solde:Double, type:TypeCompte):List<Compte>
    fun supprimerCompte(compte:Compte):Boolean
    fun getCapital():Double
    fun transferer(c1:Compte, c2:Compte, montant:Double)
}
class GestionBanque : InterfaceBanque {

    override
    val listComptes: ArrayList<Compte> = arrayListOf()


    override
    fun ajouterCompte(compte: Compte) {
        /*if(listComptes.contains(compte))
            throw CompteTrouveException("compte trouve")*/
        for (c in listComptes){
            if(c.numero == compte.numero){
                throw CompteTrouveException("compte trouve")
            }
        }
        listComptes.add(compte)
    }

    override
    fun rechercherCompte(
        solde: Double,
        type: TypeCompte
    ): List<Compte> {
        val listResults : ArrayList<Compte> = arrayListOf()
        for (c in listComptes){
            if(c.solde == solde && c.typeCompte == type){
                listResults.add(c)
                }
            }
        return listResults
    }

    override
    fun supprimerCompte(compte: Compte): Boolean {
        val r = listComptes.remove(compte)
        return r
    }

    override
    fun getCapital(): Double {
        var capital = 0.0
        for (c in listComptes){
            capital = capital + c.solde
        }
        return capital
    }

    override
    fun transferer(
        c1: Compte,
        c2: Compte,
        montant: Double
    ) {
        if(listComptes.contains(c1) && listComptes.contains(c2)){
            c1.solde = c1.solde - montant
            c2.solde = c2.solde + montant
        }
    }

}







fun main(){
    val s = soustraction(5.0,3.0)
    print(s)
}