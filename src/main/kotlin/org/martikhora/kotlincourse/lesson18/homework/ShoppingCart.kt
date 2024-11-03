package org.martikhora.kotlincourse.lesson18.homework

class ShoppingCart {
    private val items: MutableMap<Int, Int> = mutableMapOf()

    fun addToCart(itemId: Int) { //одна единица товара
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            if (amount > 0) {
                items[itemId] = items.getOrDefault(itemId, 0) + amount
            }
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }
}


//Учесть, что если товар уже есть в корзине, нужно увеличить его количество, если нет - добавить.
//Попробуй создать корзину и положить в неё товар разными способами, потом распечатать корзину в консоль.
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое
// количество артикулов и общее количество всего товара в корзине.
