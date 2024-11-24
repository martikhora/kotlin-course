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

    } catch (e: NullPointerException) {
        println("NullPointerException")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("")
    } catch (e: ClassCastException) {
        println("ClassCastException")
    } catch (e: NumberFormatException) {
        println("NumberFormatException")
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException")
    } catch (e: IllegalStateException) {
        println("IllegalStateException")
    } catch (e: OutOfMemoryError) {
        println("OutOfMemoryError")
    } catch (e: StackOverflowError) {
        println("StackOverflowError")
    }
}

fun setPrice(price: Double) {
    require(price >= 0) //проверяем аргументы на валидность
    { "Цена не может быть отрицательной" }
}

fun recursive() {
    recursive()
}

var initialized = false
fun causeException() {
    if (!initialized) throw IllegalStateException("Object is not initialized")
}

