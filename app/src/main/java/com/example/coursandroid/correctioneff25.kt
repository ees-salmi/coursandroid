package com.example.coursandroid


data class Smartphone(val id :Int, val model :String, val marque: String, val prix :Double, val quantite : Int)
class Magazin(val nom : String, val adresse : String){
    val listPhones  = arrayListOf<Smartphone>()
    fun ajoutersp(sp : Smartphone){
        listPhones.add(sp)
    }

    fun affichersp(){
        for(elt in listPhones){
            println(elt)
        }
    }

    fun recherchersp(id : Int): Smartphone ? {

        for (elt in listPhones) {
            if (elt.id == id) {
                return elt
            }
        }
        return null
    }
    fun supprimersp(id : Int){
        /*for(elt in listPhones) {
            if (elt.id == id) {
                listPhones.remove(elt)
            }
        }*/
        val spc = recherchersp(id)
        listPhones.remove(spc)
    }

}

fun main(){
    val sp1 = Smartphone(1,"iphone","iphone5",1000.00,20)
    val sp2 = Smartphone(2,"sumsung","A3",500.00,12)
    val sp3 = Smartphone(3,"sumsung","S5",500.00,12)

    val magazin1 = Magazin("m1","deroua")
    println(magazin1)
    magazin1.ajoutersp(sp1)
    magazin1.ajoutersp(sp2)
    magazin1.ajoutersp(sp3)
    magazin1.affichersp()
    println("apress la supprission")
    magazin1.supprimersp(1)
    magazin1.affichersp()

}