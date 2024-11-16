package org.martikhora.kotlincourse.lesson21.homework

class ListValidator <T: Number> : Validator<List<T?>> {
    override fun validate(value: List<T?>): Boolean {
        //ни один элемент не равен null и не 0.0
        return value.all { it != null && it.toDouble() != 0.0 }
    }

}