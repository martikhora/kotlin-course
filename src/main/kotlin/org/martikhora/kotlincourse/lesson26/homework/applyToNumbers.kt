package org.martikhora.kotlincourse.lesson26.homework

//Создайте функцию applyToNumbers, которая принимает список чисел и функцию, преобразующую каждое число в другое число
//(те-есть принимающая число и возвращающая число). Функция должна вернуть результат преобразования исходного списка чисел.

fun applyToNumbers(
    numList: List<Int>,
    transform: (Int) -> Int
): List<Int> {
    return numList.map(transform)
}

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)

    val doubledList = applyToNumbers(numberList) { it * 2 }
    println(doubledList)

    val increasedList = applyToNumbers(numberList) { it + 10 }
    println(increasedList)
}