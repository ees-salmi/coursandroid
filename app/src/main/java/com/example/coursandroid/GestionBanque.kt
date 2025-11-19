package com.example.coursandroid

import java.util.Date

//) Classe Operation : contient montant: Double, type: String ("DEPOT" ou "RETRAIT") type Enum
enum class Type{DEPOT,RETRAIT}

class Operation(val montant : Double,val type: Type, val date: Date){
    fun afficher():String {
        //[DEPOT] 250.0 Dh le 2025-01-10.
        return "[$type] $montant DH le $date"
    }
}

class CompteBancaire(val numero : String, val proprietaire :String, var solde :Double){
    val historique : ArrayList<Operation> = arrayListOf()

    fun deposer(montant : Double){
        solde = solde + montant
        val opper = Operation(montant,Type.DEPOT,Date())
        historique.add(opper)
    }

    fun retirer(montant : Double){
        if(solde >= montant) {
            solde = solde - montant
        }
        val opper = Operation(montant,Type.RETRAIT, Date())
        historique.add(opper)

    }

    fun afficherHistorique(){
        for(z in historique){
            println(z.afficher())
        }
    }
}
//Classe Banque : contient nom: String et comptes: MutableList<CompteBancaire>
class Banque(val nom : String ){
    val comptes : ArrayList<CompteBancaire> = arrayListOf()
    fun ajouterCompte(compte : CompteBancaire){
        comptes.add(compte)
    }

    fun rechercherCompte(numero: String): CompteBancaire?{
        val comptetrouve = comptes.find { it.numero == numero }
        return comptetrouve
        /*for(cpt in comptes){
            if(cpt.numero == numero ){
                return cpt
            }
            else {
                return null
            }
        }*/
    }
    fun transferer(from : CompteBancaire, to : CompteBancaire, montant: Double){

        from.retirer(montant)
        to.deposer(montant)
    }
}
fun main(){
   /* val dateNaissance = "16-10-2013";
    val jour = dateNaissance[0].toString()+dateNaissance[1].toString()
    val mois = dateNaissance.subSequence(3,5)
    val annee = dateNaissance.subSequence(6,10)
    println(mois)
    println(annee)*/



}