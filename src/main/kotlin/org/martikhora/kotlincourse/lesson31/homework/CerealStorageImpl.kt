package org.martikhora.kotlincourse.lesson31.homework

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {

    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal, Float>()
    private var totalContainers = 0

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        if (amount < 0) throw IllegalArgumentException("Количество не может быть отрицательным")
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val spaceLeft = getSpace(cereal)

        return if (spaceLeft >= amount) {
            storage[cereal] = currentAmount + amount
            0f
        } else {
            if (totalContainers + 1 > storageCapacity / containerCapacity) {
                throw IllegalStateException("Хранилище не позволяет разместить ещё один контейнер")
            }
            storage[cereal] = containerCapacity
            totalContainers++
            amount - spaceLeft
        }
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        if (amount < 0) throw IllegalArgumentException("Количество не может быть отрицательным")

        val currentAmount = storage.getOrDefault(cereal, 0f)
        return if (currentAmount >= amount) {
            storage[cereal] = currentAmount - amount
            amount
        } else {
            storage[cereal] = 0f
            currentAmount
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        if (currentAmount > 0) {
            return false
        }
        storage.remove(cereal)
        totalContainers--
        return true
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        return if (currentAmount >= containerCapacity) {
            0f
        } else {
            containerCapacity - currentAmount
        }
    }

    override fun toString(): String {
        TODO("Not yet implemented")
    }

}