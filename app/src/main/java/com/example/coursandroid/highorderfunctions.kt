package com.example.coursandroid
// hight order function

val ajouter = {a : Int, b : Int -> a+b}

val soustrire = { a:Int, b : Int  -> a-b }

fun highorder(a:Int , b : Int, func : (Int,Int) -> Int): Int{

    val s = a + b
    val res = s + func(a,b)
    return res
}

fun main(){
    println(highorder(1,2,soustrire))
}