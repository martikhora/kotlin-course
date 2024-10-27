package org.martikhora.kotlincourse.lesson15

class Homework {

    class Party {
        var location: String = ""
        var attendees: Int = 0

        fun details() {
            println("Вечеринка пройдет в $location")
            println("Приглашено $attendees гостей")
        }
    }

    class Emotion {
        var type: String = ""
        var intensity: Int = 0

        fun express() {
            println("Сейчас я испытываю эмоцию $type интенсивностью $intensity")
        }
    }

    class Moon {
        var isVisible: Boolean = false
        var phase: String = "New Moon"

        fun showPhase() {
            println("Текущая фаза Луны: $phase")
        }
    }

    class Product {
        var name: String = ""
        var cost: Double = 0.0
        var quantity: Int = 0
    }

    class Concert {
        var band: String = ""
        var location: String = ""
        var cost: Double = 0.0
        var hall: Int = 0
        private var ticketsSold: Int = 0

        fun information() {
            println("Концерт группы $band будет проходить в $location, цена билета: $cost, вместимость зала: $hall")
        }

        fun buyTicket() {
            ticketsSold++
        }
    }

    class Shelf {
        var capacity: Int = 0
        var items = mutableListOf<String>()

        fun addItem(item: String) {
            if (capacity > 0 && item.length <= capacity) {
                items.add(item)
            } else {
                println("На полке недостаточно места для $item")
            }
        }

        fun removeItem(item: String): Boolean {
            return items.remove(item)
        }

        fun canAccommodate(item: String): Boolean {
            val currentLoad = items.sumOf { it.length }
            return currentLoad + item.length <= capacity
        }

        fun contains(item: String): Boolean {
            return items.contains(item)
        }

        fun getListOfItems(): List<String> {
            return items.toList()
        }

        fun remainingCapacity(): Int {
            return capacity - items.sumOf { it.length }
        }
    }

    class Rack(private val maxShelves: Int) {
        var shelves = mutableListOf<Shelf>()

        fun addShelf(shelf: Shelf): Boolean {
            return if (shelves.size < maxShelves && !shelves.contains(shelf)) {
                shelves.add(shelf)
                true
            } else {
                false
            }
        }

        fun removeShelf(index: Int): Boolean {
            return if (index in shelves.indices) {
                shelves.removeAt(index)
                true
            } else {
                false
            }
        }

        fun addItem(item: String): Boolean {
            for (shelf in shelves) {
                if (shelf.canAccommodate(item)) {
                    shelf.addItem(item)
                    return true
                }
            }
            return false
        }

        fun removeItem(): Boolean {
            for (i in shelves.indices) {
                if (shelves[i] != null) {
                    val item = shelves[i]
                    shelves.removeAt(i)
                    return true
                }
            }
            return false
        }

        fun containsItem(item: String): Boolean {
            for (shelf in shelves) {
                if (shelf.contains(item)) {
                    return true
                }
            }
            return false
        }

        fun getShelves(): List<Shelf> {
            return shelves.toList()

        }

        fun printContents() {
            for ((index, shelf) in shelves.withIndex()) {
                println(
                    "Полка $index: Вместимость = ${shelf.capacity}, Осталось мест = ${shelf.remainingCapacity()}, " +
                            "Предметы = ${shelf.getListOfItems()}"
                )
            }
        }

        //Сложное удаление полки (advancedRemoveShelf):
        //Принимает индекс полки для удаления
        //Перераспределяет предметы по имеющимся полкам, начиная с самых длинных.
        // Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
        //Удаляет полку с оставшимися предметами
        //Возвращает список предметов, которые не удалось удалить

        fun advancedRemoveShelf(index: Int): List<String> {

            val itemsToReallocate = shelves[index].getListOfItems().toMutableList()
            val notPlacedItems = mutableListOf<String>()

            removeShelf(index) // Сначала удаляем полку

            // Сортируем оставшиеся полки по количеству предметов, начиная с большего
            val remainingShelves = shelves.sortedByDescending { it.capacity - it.remainingCapacity() }

            for (item in itemsToReallocate) {
                var placed = false
                for (shelf in remainingShelves) {
                    if (shelf.contains(item)) {
                        placed = true
                        break
                    }
                }
                if (!placed) {
                    notPlacedItems.add(item) // Предмет не удалось разместить на полках
                }
            }
            return notPlacedItems // Возвращаем список предметов, которые не удалось разместить
        }
    }
}
