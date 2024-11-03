package org.martikhora.kotlincourse.lesson17.homework

class Sofa(name: String, material: String, val seatingCapacity: Int) : Furniture(name, material) {
    override fun getDescription(): String {
        return "Диван: $name, Материал: $material, Вместимость: $seatingCapacity"
    }
}
