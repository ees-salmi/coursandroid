package com.example.coursandroid

var nom = "hakima"
fun String.premierChar() : Char ? {
    if(this.isEmpty() )
        return null
    else
        return this[0]
}
fun String.getCharByindex(i : Int) : Char ? {
    if(this.isEmpty() )
        return null
    else if (this.length > i)
        return this[i]
    else
        return null
}
fun Int.estPair() : Boolean {
    if( this % 2 == 0)
        return true
    else
        return false
}
// pour crer une extension qui retourne le dernier charactere
fun String.getLastCharacter() : Char ? {
    if(this.isEmpty())
        return null
    else
        return this[this.length - 1]
}


fun main(){
    var nom: String = "amne"
    var a : Int = 4

    println(nom.getLastCharacter())
}
