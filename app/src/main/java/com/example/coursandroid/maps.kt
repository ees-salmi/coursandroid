package com.example.coursandroid

import androidx.compose.runtime.internal.illegalDecoyCallException

fun main(array: Array<String>){

    var groupe202 : HashMap<String,Double> = hashMapOf()
    groupe202.put("tarik",15.2)
    groupe202.put("zakaria",17.2)
    groupe202.put("marwa",10.5)
    groupe202.put("ilyass",12.4)
    var somme  = 0.0
    var compteur = 0

    for(value in groupe202.values){
        somme = somme + value
        compteur++
    }
    // to use exception handling here

    println(somme/groupe202.size)

    var max = groupe202.get(groupe202.keys.first())
    var max2 = groupe202.values.first()
    for(i in groupe202.values){
        if (i > max2){
                max2 = i
    }
    }
    println(max2)

    var listdlist : HashMap<String, HashMap<String,Double>> = hashMapOf()
        listdlist.put("groupe2",groupe202)
    var groupe201 : HashMap<String,Double> = hashMapOf()
        listdlist.put("groupe1",groupe201)

}
