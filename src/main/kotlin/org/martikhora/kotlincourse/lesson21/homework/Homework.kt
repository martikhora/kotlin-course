package org.martikhora.kotlincourse.lesson21.homework

class Homework {

    fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
        val size = minOf(keys.size, values.size)
        return keys.take(size).zip(values.take(size)).toMap()
    }


    fun <T> getMiddleElement(list: List<T>): T? {
        //проверяем, что список не пустой и имеет нечетное количество элементов
        if (list.isNotEmpty() && list.size % 2 == 1) {
            return list[list.size / 2] // возвращаем средний элемент
        }
        return null // если условия не выполнены, возвращаем null
    }

    class ListHolder<T> {
        private val items: MutableList<T> = mutableListOf()

        //метод для добавления элемента в список
        fun add(item: T) {
            items.add(item)
        }

        // метод для получения всех элементов из списка
        fun getAll(): List<T> {
            return items.toList()
        }
    }



}