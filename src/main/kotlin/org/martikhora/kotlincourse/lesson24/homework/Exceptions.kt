package org.martikhora.kotlincourse.lesson24


fun main() {

    //NullPointerException
    val str: String? = null
    println(str!!.length)

    //ArrayIndexOutOfBoundsException
    val array = arrayOf(1, 2, 3)
    println(array[3])

    //ClassCastException
    val i: Int = "string" as Int

    //NumberFormatException
    val stringNumber = "abc"
    val number = stringNumber.toInt()

    //IllegalArgumentException
    fun setPrice(price: Double) {
        require(price >= 0) //когда нужно проверить аргументы на валидность
        { "Цена не может быть отрицательной" }
    }

    //IllegalStateException
    var initialized = false
    fun doSomething() {
        if (!initialized) throw IllegalStateException("Object is not initialized")
    }
    doSomething()

    //OutOfMemoryError
    val list = mutableListOf<String>()
    while (true) {
        list.add("This will definitely cause an OutOfMemoryError")
    }

    //StackOverflowError
    fun recursive() {
        recursive()
    }

    recursive()

}







