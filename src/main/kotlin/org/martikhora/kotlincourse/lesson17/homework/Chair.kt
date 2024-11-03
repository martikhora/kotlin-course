package org.martikhora.kotlincourse.lesson17.homework

class Chair(name: String, material: String, val hasArmrests: Boolean) : Furniture(name, material) {
    override fun getDescription(): String {
        return "Стул: $name, Материал: $material, Есть подлокотники: $hasArmrests"
    }
}