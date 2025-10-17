package com.example.coursandroid

// on doit implementer l interface pour qu'on puisse utiliser les pr et méth
class Liste() {
    val list : MutableList<Int> = mutableListOf()
    fun remremplirList(){
        for (i in 0..10){
            list.add(i,i*2)
        }
        for (i in 0..10){
            println(list.get(i))
        }
    }

    fun getMax() : Int {
        var max : Int = 0
        for (elt in list){
            if(elt > max ){
                max = elt
            }
        }
       return max
    }

    fun getNbrPair(): List<Int> {
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(elt % 2 == 0 ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }
}

fun remplirList(){
    val list : MutableList<Int> = mutableListOf()
    for (i in 0..10){
        list.add(i,i*2)
    }
    for (i in 0..10){
        println(list.get(i))
    }

}

fun main(){
    remplirList()
}