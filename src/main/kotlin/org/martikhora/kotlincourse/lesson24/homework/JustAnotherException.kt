package org.martikhora.kotlincourse.lesson24.homework

class JustAnotherException(exception: ArrayIndexOutOfBoundsException) :
    RuntimeException("О нет, это исключение!", exception)

fun main() {
    val array = arrayOf(1, 2, 3)
    try {
        println(array[3])
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw JustAnotherException(e)
    }
}
