package com.example.coursandroid

// on doit implementer l interface pour qu'on puisse utiliser les pr et méth
class Liste() {
   // val list : MutableList<Int> = mutableListOf()
    var list : ArrayList<Int> = ArrayList<Int>()
    fun remplirList(){
        for (i in 0..10){
            this.list.add(i,i)
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
class Salle(val numero : Int, val nbrplace : Int, val nomSalle : String){
    override fun toString(): String {
        return "numero = $numero , place = $nbrplace , nom = $nomSalle"
    }
}
fun main(){
    var l = Liste()
    //l.remplirList()
    var list1 = l.getNbrPair()
    //println(list)
    var m = l.getMax()
   // println(m)

    var pr = l.getNbrImpair()
    //println(pr)
    var pre = l.getNbrPremier()
    //println(pre)
    val list : ArrayList<Salle> = arrayListOf()
    val salle1 = Salle(1,20,"salle 1")
    val salle2 = Salle(2,20,"salle 2")
    list.add(salle1)
    list.add(salle2)
    list.remove(salle2)
    list.removeAt(0)
    list.size
    list.addAll(list)

    println(salle1)
    val map = mapOf("key1" to 1, "key2" to 4)
    println(map.keys)
    println(map.values)
    var map2 : HashMap<String,Int> = hashMapOf()
    map2.put("tarik",21)
    map2.put("soukaina",18)
    map2.put("saad",18)
    map2.put("saad",23)
    println(map2.keys)

}