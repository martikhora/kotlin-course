package org.martikhora.kotlincourse.lesson25.homework

//Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.


val uniqueNumbersAnon: (List<Int>) -> List<Int> = fun(numbers: List<Int>): List<Int> {
    require(numbers.isNotEmpty()) { "Список не может быть пустым" }
    return numbers.distinct()
}

val uniqueNumbersLambda: (List<Int>) -> List<Int> = { numbers ->
    require(numbers.isNotEmpty()) { "Список не может быть пустым" }
    numbers.distinct()
}

val uniqueNumbersLambdaNoType = { numbers: List<Int> ->
    require(numbers.isNotEmpty()) { "Список не может быть пустым" }
    numbers.distinct()
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val numbersEmpty = emptyList<Int>()

    println(numbers.uniqueNumbers(numbers))
    println(uniqueNumbersAnon(numbers))
    println(uniqueNumbersLambda(numbers))
    println(uniqueNumbersLambdaNoType(numbers))

    try {
        println(numbers.uniqueNumbers(numbersEmpty))
        println(uniqueNumbersAnon(numbersEmpty))
        println(uniqueNumbersLambda(numbersEmpty))
        println(uniqueNumbersLambdaNoType(numbersEmpty))
        println(uniqueNumbersLambdaNoType(numbersEmpty))
    } catch (e: Exception) {
        println(e.message)
    }

}