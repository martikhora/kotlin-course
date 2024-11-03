package org.martikhora.kotlincourse.lesson17.homework

class Armchair(name: String, material: String, val hasArmrests: Boolean) : Furniture(name, material) {
    override fun getDescription(): String {
        return "Кресло: $name, Материал: $material, Есть подлокотники: $hasArmrests"
    }
}