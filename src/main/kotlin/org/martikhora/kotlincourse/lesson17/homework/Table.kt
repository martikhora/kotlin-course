package org.martikhora.kotlincourse.lesson17.homework

class Table(name: String, material: String, val numberOfLegs: Int) : Furniture(name, material) {
    override fun getDescription(): String {
        return "Стол: $name, Материал: $material, Количество ног: $numberOfLegs"
    }
}