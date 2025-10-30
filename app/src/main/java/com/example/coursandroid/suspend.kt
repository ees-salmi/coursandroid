package com.example.coursandroid

import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

suspend fun fetchData(): String {
    delay(2000) // Simulate a network request taking 2 seconds
    return "Data fetched successfully!"
}
suspend fun calculateSum(): Int = coroutineScope{
    val deferredOne = async {
        delay(1000L) // Simulate a long-running task
        10
    }

     deferredOne.await()
}
fun main() = runBlocking{
    val dt = fetchData()
    println(dt)
    println("data finished")


}