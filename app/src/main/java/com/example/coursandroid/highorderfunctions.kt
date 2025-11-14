package com.example.coursandroid
// hight order function


val ajouter = {a : Int, b : Int -> a+b}

val soustrire = { a:Int, b : Int  -> a-b }

fun highorder(a:Int , b : Int, func : (Int,Int) -> Int): Int{

    val res = func(a,b)
    return res
}
val ajouters = {list : ArrayList<Int> , elm : Int -> list.add(elm)}
val supprim = {list : ArrayList<Int> , elm : Int -> list.remove(elm)}

fun listOperation(list :ArrayList<Int> , elm : Int , oper : (ArrayList<Int>,Int)-> Boolean ){
    oper(list,elm)
}
val modulo = {a : Int, b : Int -> a%b }

fun main(){
    val list : ArrayList<Int> = arrayListOf()
    listOperation(list,2,ajouters)
    listOperation(list,2,supprim)


}