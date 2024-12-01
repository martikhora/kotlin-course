package org.martikhora.kotlincourse.lesson25.homework

//Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()


fun sumOfDigits(number: String): Int {
    require(number.isNotEmpty()) { "Строка не должна быть пустой" }
    return number.map { it.digitToInt() }.sum()
}

val sumOfDigitsAnon: (String) -> Int = fun(number: String): Int {
    require(number.isNotEmpty()) { "Строка не должна быть пустой" }
    return number.map { it.digitToInt() }.sum()
}

val sumOfDigitsLambda: (String) -> Int = { number ->
    require(number.isNotEmpty()) { "Строка не должна быть пустой" }
    number.map { it.digitToInt() }.sum()
}

val sumOfDigitsLambdaNoType = { number: String ->
    require(number.isNotEmpty()) { "Строка не должна быть пустой" }
    number.map { it.digitToInt() }.sum()
}

fun main() {
    val number = "123456"
    val numberEmpty = ""

    println(sumOfDigits(number))
    println(sumOfDigitsAnon(number))
    println(sumOfDigitsLambda(number))
    println(sumOfDigitsLambdaNoType(number))


    try {
        println(sumOfDigits(numberEmpty))
        println(sumOfDigitsAnon(numberEmpty))
        println(sumOfDigitsLambda(numberEmpty))
        println(sumOfDigitsLambdaNoType(numberEmpty))
    } catch (e: Exception) {
        println(e.message)
    }
}