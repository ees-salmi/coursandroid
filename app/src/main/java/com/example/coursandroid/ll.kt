package com.example.coursandroid


data class Roue(val nbr : Int)
data class Cars(val model : String, val name : String){
    lateinit var nbrDesRoue : Roue
    init{
        nbrDesRoue = Roue(3)
    }
    fun afficher() = "le nombre de roue est $nbrDesRoue"
}

fun palindrome( str1 : String){
    if( str1 == str1.reversed()){
        println("oui palindrone") // aalaa , aya
    }
    else{
        println("non c pas palindrone")
    }
}

fun rectangle(larg : Double, long : Double):Double{
    return larg * long
}

fun main(){
    // oussama youssef
   val resltats =  rectangle(20.3,30.3)
    //println(resltats)
    val str1 : String = "ali"
    val str2 : String = "ilaa"


    /*val str : String  by lazy  {
        "test"
    }*/
    //val resultat = palindrome(str1,str2)
    //println(str)
   // println(rectangle(20.5,30.5))

}