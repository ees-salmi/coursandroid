package com.example.coursandroid

class Article(val numeroRef: Int, val libele : String, val prix :Double, val qte :Int){

    override fun toString(): String {
        return "numero = $numeroRef, libele : $libele , prix = $prix"
    }
}
class Stock{
    var listArtcile = arrayListOf<Article>()

    fun rechercheArticle(numeroRef: Int) : Article{
        return listArtcile.filter { it.numeroRef == numeroRef }[0]
    }


}