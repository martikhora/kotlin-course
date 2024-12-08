package org.martikhora.kotlincourse.lesson26.homework

//Реализуйте функцию sumByCondition, которая принимает список чисел и функцию,
// определяющую условие для включения числа в сумму. Функция должна вернуть сумму чисел, прошедших проверку.

fun sumByCondition(
    listInt: List<Int>,
    condition: (Int) -> Boolean
): Int {
    return listInt.filter(condition).sum()
}

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6)

    val evenSum = sumByCondition(numberList) { it % 2 == 0 }
    println("Сумма четных чисел: $evenSum")

    val greaterThanThreeSum = sumByCondition(numberList) { it > 3 }
    println("Сумма чисел больше 3: $greaterThanThreeSum")
}