package org.martikhora.kotlincourse.lesson12

class Homework {

    //    Напиши валидную сигнатура метода
    fun printSomething(string: String) {
        println(string)
    }

    //    Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
    fun doSomething() {}

    //    Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    //    Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
    fun lines(string: String) {

    }

    //    Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
    fun doubles(list: List<Int>): Double {
        return (list.sum() / list.size).toDouble()
    }

    //    Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
    fun length(string: String?): Int? {
        return string?.length
    }

    //    Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
    fun canBeNullable(): Double? {
        return null
    }

    //    Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
    fun nullableList(list: List<Int?>) {

    }

    //    Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
    fun returnString(int: Int): String? {
        return null
    }

    //    Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
    fun returnNullableList(): List<String?> {
        return listOf(null)
    }
//    Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.

    fun canBeNull(string: String?, int: Int?): Boolean? {
        return null
    }

    //    Напиши рабочий код для следующих задач:
//    Задача 1:
//    Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    fun multiplyByTwo(int: Int): Int {
        return int * 2
    }

    //    Задача 2:
//    Создайте функцию isEven, которая принимает целое число и возвращает true,
//    если число чётное, и false в противном случае.
    fun isEven(int: Int): Boolean {
        return int % 2 == 0
    }

    //    Задача 3:
//    Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//    Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    fun printNumbersUntil(int: Int) {
        if (int < 1) {
            return
        } else for (int in 1..int) {
            println(int)
        }
    }

    //    Задача 4:
//    Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//    Если отрицательных чисел нет, функция должна вернуть null.
    fun findFirstNegative(list: List<Int>): Int? {
        for (value in list) {
            if (value < 0) {
                return value
            }
        }
        return null
    }

    //
//    Задача 5:
//    Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//    Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
    fun processList(list: List<String?>) {
        for (i in list) {
            if (i == null) {
                return
            }
            println(i)
        }
    }

    //Рефакторинг
    fun drawRectangle(width: Int, height: Int) {
        isPositive(width, height)
        createFloor(width)
        createWalls(width, height)
        createFloor(width)
    }

    private fun isPositive (width: Int, height: Int){
        if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
        if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
    }

    private fun createFloor(width: Int){
        var topLine = "+"
        for (i in 1 until width - 1) {
            topLine += "-"
        }
        topLine += "+\n"
        print(topLine)
    }
    private fun createWalls(width: Int, height: Int) {
        for (i in 1 until height - 1) {
            var middleLine = "|"
            for (j in 1 until width - 1) {
                middleLine += " "
            }
            middleLine += "|\n"
            print(middleLine)
        }
    }
}