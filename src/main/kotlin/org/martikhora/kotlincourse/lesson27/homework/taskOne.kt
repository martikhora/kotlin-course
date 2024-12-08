package org.martikhora.kotlincourse.lesson27.homework

fun timeTracker(function: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    function()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}


fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    val elapsedTime = timeTracker { myFunction() }
    println("Время выполнения: $elapsedTime мс")

}