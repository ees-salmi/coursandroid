package com.example.coursandroid

fun contientE(para : String) : Boolean {
    return para.lowercase().contains("e")
}

fun estpalindrome(nom : String) : Boolean{

    return nom.equals(nom.reversed())
}
// fonction lamda
val pal = {nom : String -> nom.equals(nom.reversed())}

val somme = {num : Int, num2 : Int -> num + num2}

// high order function
fun main(){
    val numbers = arrayOf(2,3,-1,5)
    val array = arrayListOf<String>("tarik","amine","marwa","meryam","bob")
    println(numbers)

    println(numbers.filter{ it % 2 == 0})
    println(array.filter{contientE(it)})
    println(array.filter { pal(it) })

}