package org.martikhora.kotlincourse.lesson22.homework

fun Array<out Number>.minMax(): Pair<Double, Double> {
    val min = this.map { it.toDouble() }.minOrNull() ?: Double.NaN
    val max = this.map { it.toDouble() }.maxOrNull() ?: Double.NaN
    return Pair(min, max)
}


//    val numbers: Array<Number> = arrayOf(10, 5, 3.5, 8, 20, 0)
//    val result = numbers.minMax()
//
//    if (result != null) {
//        println("Минимальное значение: ${result.first}, Максимальное значение: ${result.second}")
//    } else {
//        println("Массив пуст")
//    }
//
//    //пустой массив
//    val emptyNumbers: Array<Number> = emptyArray()
//    val emptyResult = emptyNumbers.minMax()
//
//    if (emptyResult != null) {
//        println("Минимальное значение: ${emptyResult.first}, Максимальное значение: ${emptyResult.second}")
//    } else {
//        println("Массив пуст")
//    }
