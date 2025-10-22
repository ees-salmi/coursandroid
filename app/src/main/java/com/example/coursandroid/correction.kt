package com.example.coursandroid

fun main(array: Array<String>){
    /*val map = mapOf("key1" to 1, "key2" to 4)
    println(map.keys)
    println(map.values)
    var map2 : HashMap<String,Int> = hashMapOf()
    map2.put("tarik",21)
    map2.put("soukaina",18)
    map2.put("saad",19)
    map2.put("saad",23)
    println(map2.keys)
    println(map2.values)
    // creer une map pour stocker des objets des stagiaire
    // avec les clés entiers*/

    val list : ArrayList<String> = arrayListOf("amine","saad","mohamed","tarik","ali")
    var longmot = list.get(0)
    for(elt in list){
        if(elt.length > longmot.length){
            longmot = elt
        }
    }
    val listnombre : ArrayList<Int> = arrayListOf(2,4,-5,8)
    listnombre.add(-3)
    listnombre.add(2)
    for(elt in listnombre){
        if(elt < 0){
            //println(elt)
        }
    }
    val listp : ArrayList<Int> = arrayListOf()
    for(i in 1..1000){
        listp.add(i)
    }
    var estpremier = true
    for(elt in listp){
        estpremier = true
        for(i in 2..elt-1){
            if(elt % i == 0){
                estpremier = false
            }
        }
        if(estpremier){
            println(elt)
        }

    }


}
