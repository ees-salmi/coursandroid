package com.example.coursandroid



data class Smatphone(var id: Int, var marque :String, var modele : String, var prix : Double, var quantite : Int)
// data contient les getters et les setters plus les méthodes toString, HachCode, copy, equals
class produit(var id:Int, var Nom : String)

interface Forme {
    fun calculerSurface() : Double
}

class Rectangle(val longueur : Int, val largeur : Int) : Forme{

    override fun calculerSurface() : Double {
        return (longueur * largeur).toDouble()
    }
}

class Circl(val rayon : Int) : Forme{

    override fun calculerSurface() : Double {
        return Math.PI * rayon * rayon
    }
}
class Triangle(val base : Double, val hauteur : Double) : Forme {
    override fun calculerSurface(): Double {
        return base * hauteur / 2
    }

}

fun surface(t : Forme ) : Double {
    return t.calculerSurface()
}


fun main(){
    val sp1 = Smatphone(1,"iphone","17",1200.0,23)
    var t = Triangle(2.3,4.2)
    var r = Rectangle(3,3)
    var c = Circl(5)
    surface(c)
}