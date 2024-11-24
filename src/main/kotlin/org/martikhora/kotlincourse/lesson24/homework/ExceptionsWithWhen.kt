package org.martikhora.kotlincourse.lesson24.homework

fun main() {

    try {
        val str: String? = null
        println(str!!.length)

        val array = arrayOf(1, 2, 3)
        println(array[3])

        val i: Int = "string" as Int

        val stringNumber = "abc"
        val number = stringNumber.toInt()

        setPrice(-1.0)

        causeException()

        val list = mutableListOf<String>()
        while (true) {
            list.add("This will definitely cause an OutOfMemoryError")
        }

        recursive()

    } catch (e: Exception) {
        when (e) {
            is NullPointerException -> println("NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("ClassCastException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is IllegalStateException -> println("IllegalStateException")
            is OutOfMemoryError -> println("OutOfMemoryError")
            is StackOverflowError -> println("StackOverflowError")
        }
    }
}