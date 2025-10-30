package com.example.coursandroid

import kotlinx.coroutines.*
/*couroutine
runBlocking : démarre une coroutine et bloque le thread principal (utile en tests)
launch : exécution sans retour (Unit)
async / await : exécution avec retour
delay : suspend l’exécution sans bloquer le thread
suspend : rend une fonction compatible avec les coroutines
 */
suspend fun fetchDataFromServer(): String {
    delay(3000) // simulate network delay
    return "username : motdepasse"
}



fun testappelasyn() = runBlocking {
    println("Début du programme")

    launch {
        delay(2000)
        println("Tâche asynchrone terminée")
    }

    println("Fin du programme ")
}

suspend fun getdatafromaserver() : HashMap<String,String> {
    val list  = hashMapOf<String,String>()
    delay(2000)
    list.put("nom","brahim")
    return list
}


fun getprofile() = runBlocking {
    val deferredProfile = async{
        delay(2000L)
        "brahim"
    } // Simulate a long-running task
    deferredProfile.await()
    println(deferredProfile.await())
}
fun getname():String {
    return "brahim"
}
fun main() = runBlocking  {
   /* println("debut de programme")
    val nom = getprofile()
    println(nom)
    println("fin de programme")*/
    println("debut de programme")
        launch{ println(getdatafromaserver()) }
    println("fin de programme")
}