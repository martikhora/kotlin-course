package org.martikhora.kotlincourse.lesson25.homework

import java.util.InputMismatchException

//Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
//С помощью require проверь, что список не пустой.
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Создай лямбда выражение без указания типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

fun average(list: List<Double>): Double {
    require(list.isNotEmpty()) { "Список не может быть пустым" }
    return list.sum() / list.size
}

val averageAnon: (List<Double>) -> Double = fun(list: List<Double>): Double {
    require(list.isNotEmpty()) { "Список не может быть пустым" }
    return list.sum() / list.size
}

val averageLambda: (List<Double>) -> Double = { list ->
    require(list.isNotEmpty()) { "Список не может быть пустым" }
    list.sum() / list.size
}

val averageLambdaNoType = { list: List<Double> ->
    require(list.isNotEmpty()) { "Список не может быть пустым" }
    list.sum() / list.size
}

fun main() {

    val numbers1 = emptyList<Double>()
    val numbers2 = listOf(1.0, 2.0, 3.0, 4.0, 5.0)

    try {
        println(average(numbers1))
        println(averageAnon(numbers1))
        println(averageLambda(numbers1))
        println(averageLambdaNoType(numbers1))
    } catch (e: Exception) {
        println(e.message)
    }
}