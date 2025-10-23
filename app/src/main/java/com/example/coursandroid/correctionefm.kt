package com.example.coursandroid
fun main() {
    val nombres: ArrayList<Int> = arrayListOf()
    nombres.add(2)
    nombres.add(4)
    nombres.add(3)
    var som  = 0
    for(n in nombres){
        if(n % 2 == 0 ){
            som = som + n
        }
    }
    println(som)
    for (i in 0..10 step 4){

            println(i)

    }
    var n = 5
    var facto = 1
    for ( i in 1..n){
        facto = facto * i
    }
    println(facto)
}