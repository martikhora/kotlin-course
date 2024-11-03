package org.martikhora.kotlincourse.lesson17.homework

open class Furniture(val name: String, val material: String) {
    open fun getDescription(): String {
        return "Мебель: $name, Материал: $material"
    }
}