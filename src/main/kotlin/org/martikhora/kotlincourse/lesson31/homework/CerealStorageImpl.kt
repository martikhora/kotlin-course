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

    private val containers = mutableMapOf<Cereal, Float>() //что лежит в контейнере + сколько
    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }

        val currentAmount = containers.getOrDefault(cereal, 0f) //сколько контейнеров есть
        val availableSpace = getSpace(cereal) //проверяем, сколько места в контейнере

        return if (availableSpace >= amount) { //если доступное место больше или равно количеству
            containers[cereal] = currentAmount + amount
            0f //возвращаем 0, все добавлено, остатка нет
        } else {
            containers[cereal] = currentAmount + availableSpace
            amount - availableSpace // возвращаем остаток
        }
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }

        val currentAmount = containers.getOrDefault(cereal, 0f) //сколько контейнеров есть

        return if (currentAmount >= amount) { //если количество крупы в контейнере больше или равно запрашиваемому
            containers[cereal] = currentAmount - amount //вычитаем запрашиваемое количество
            amount //возвращаем запрашиваемое количество
        } else {
            containers[cereal] = 0f
            currentAmount //возвращаем остаток
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        return if (containers.getOrDefault(cereal, 0f) == 0f) {
            containers.remove(cereal)
            true //контейнер уничтожен
        } else {
            false //контейнер не пуст
        }
    }

    override fun getAmount(cereal: Cereal): Float {
        return containers.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        val currentAmount = containers.getOrDefault(cereal, 0f)
        return containerCapacity - currentAmount
    }

    override fun toString(): String {
        return containers.entries.joinToString(", ") { "${it.key.name}: ${it.value}" }
    }

}