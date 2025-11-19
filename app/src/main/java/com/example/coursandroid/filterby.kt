package com.example.coursandroid

/**
 * créer une classe pour la liste des attraction
 * access direct sans creation d objet
 * val attr = Attraction.MEDINA
 */
enum class Attraction{
   MEDINA,
   KESBAH,
   SHARA,
   MONTAGNE
}

class Ville(val nom : String, val listAttractions : ArrayList<Attraction>){

     override fun toString(): String {
         var listatt = ""
         for(attrac in listAttractions){
             listatt = "$listatt  $attrac"
         }
         return "ville : $nom les attractions : $listatt"
     }

    /* override fun equals(other: Any?): Boolean {
         return this == other
     }*/
}

class Circuit(val numero : Int, val description : String,val prix : Double){

    var lisville : ArrayList<Ville> = arrayListOf()

    fun getNbr() : Int{
        return lisville.size
    }

    fun ajouterVille(ville : Ville){

        if(lisville.contains(ville)){
            throw Exception("la ville existe deja dans la liste")
        }
        else {
            lisville.add(ville)
        }
    }

    fun afficherCircuit(){
        println("le circuit est : ")
        for (ville in  lisville){
            println(ville)
        }
    }
}
fun main(){
    val ville1 = Ville("Casabnaca",arrayListOf(Attraction.KESBAH, Attraction.MONTAGNE))
    val listattraction = arrayListOf(Attraction.KESBAH, Attraction.MEDINA)
    val ville2 = Ville("Rabat",listattraction)
    val circuit1 = Circuit(1,"circuit casa",500.0)
    val circuit2 = Circuit(2,"circuit Rabat",1000.0)
    circuit1.ajouterVille(ville1)
    circuit1.ajouterVille(ville2)
    circuit2.ajouterVille(ville2)
    circuit1.afficherCircuit()
    var lstCircuits : ArrayList<Circuit> = arrayListOf()
    lstCircuits.add(circuit1)
    lstCircuits.add(circuit2)
    println(lstCircuits.size)
    val listprixsup8 = lstCircuits.filter{it.prix > 800}
    // le circuit de plus grand prix
    val prixpluschere = lstCircuits.maxBy { it.prix }
    // le circuit de plus grand numero
    val circuitplusgrandnumer = lstCircuits.maxBy { it.numero }
    println(prixpluschere.prix)

}
