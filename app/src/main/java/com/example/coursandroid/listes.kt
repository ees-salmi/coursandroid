package com.example.coursandroid

// on doit implementer l interface pour qu'on puisse utiliser les pr et méth
class Liste() {
   // val list : MutableList<Int> = mutableListOf()
    var list : ArrayList<Int> = ArrayList<Int>()
    fun remplirList(){
        for (i in 0..10){
            this.list.add(i,i*2)
        }
        for (i in 0..10){
            println(this.list.get(i))
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

    fun getNbrPair(): MutableList<Int> {
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(elt % 2 == 0 ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }

    fun getNbrImpair(): MutableList<Int>  {
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(elt % 2 != 0 ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }

    fun getNbrMulQu(): MutableList<Int>  {
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(elt % 4 == 0 ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }



    fun getNbrPremier():MutableList<Int>{
        var nouvList : MutableList<Int> = mutableListOf()
        for (elt in list){
            if(estPremier(elt) ){
                nouvList.add(elt)
            }
        }
        return nouvList
    }

    private fun estPremier(elt: Int): Boolean {

        for (i in 2..elt-1){
            if(elt % i == 0){
                return false
            }
        }

        return true
    }
}

fun remplirList(){
    val list : MutableList<Int> = mutableListOf()
    for (i in 0..20){
        list.add(i,i)
    }
    for (i in 0..10){
        println(list.get(i))
    }

}

fun main(){
    var l = Liste()
    l.remplirList()
    println(l.getNbrPremier())
}