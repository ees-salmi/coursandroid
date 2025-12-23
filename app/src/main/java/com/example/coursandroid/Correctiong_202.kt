package com.example.coursandroid

enum class TypeComptes{PERSONNE,ENTREPRISE,COOPERATIVE}

class ComptesTrouveException(message : String): Exception(message)
class CompteB(val numero : String,var solde : Double, val proprietaire: String, val typeCompte :TypeComptes )

interface InterfaceBanques{
    val listComptes : ArrayList<CompteB>
    fun ajouterCompte(compte:CompteB)
    fun rechercherCompte(solde:Double, type:TypeCompte):List<CompteB>
    fun supprimerCompte(compte:CompteB):Boolean
    fun getCapital():Double
    fun transferer(c1:CompteB, c2:CompteB, montant:Double)
}

class PC(val marque : String, val prix :Double){
    fun afficherMarque(){
        println(marque)
    }
}
fun main(){
    val pc1 = PC("HP",2000.0)
    val pc2 = PC("HP",2000.0)
    val pc3 = PC("HP",2000.0)
    val pc4 = PC("HP",2000.0)
    val pc5 = PC("HP",2000.0)
    val listpc : ArrayList<PC> = arrayListOf()
    listpc.add(pc1)
    listpc.add(pc2)
    listpc.add(PC("DELL",8000.0))
    listpc.add(PC("IMAC",10000.0))
    for(pc in listpc){
        println(pc)
    }
    println(listpc[0])



}