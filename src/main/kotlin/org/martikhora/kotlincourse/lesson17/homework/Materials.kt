package org.martikhora.kotlincourse.lesson17.homework

abstract class Materials {
    private val materials = mutableListOf<String>()

    open fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }

    class Bottom : Materials() {
        fun addMaterialToBottom(material: String) {
            val current = extractMaterial().toMutableList()
            addMaterial(material)
            current.forEach { addMaterial(it) }
        }
    }


    class InterleavedContainer : Materials() {
        fun addMaterialsInInterleavedOrder(newMaterials: List<String>) {
            val currentMaterials = extractMaterial().toMutableList()
            val maxLength = kotlin.math.max(currentMaterials.size, newMaterials.size)
            val interleaved = mutableListOf<String>()

            for (index in 0 until maxLength) {
                if (index < newMaterials.size) {
                    interleaved.add(newMaterials[index])
                }
                if (index < currentMaterials.size) {
                    interleaved.add(currentMaterials[index])
                }
            }
            interleaved.forEach { addMaterial(it) }
        }
    }

    // Подкласс, который добавляет материалы в алфавитном порядке
    class AlphabeticalContainer : Materials() {
        override fun addMaterial(material: String) {
            val currentMaterials = extractMaterial().toMutableList()
            currentMaterials.add(material)
            currentMaterials.sort()
            currentMaterials.forEach { addMaterial(it) }
        }
    }

    // Подкласс, который принимает словарь строк
    class DictionaryContainer : Materials() {
        fun addDictionaryMaterials(dictionary: Map<String, String>) {
            val currentMaterials = extractMaterial().toMutableList()
            dictionary.forEach { (key, value) -> currentMaterials.add(0, key); currentMaterials.add(value) }
        }
    }
}
