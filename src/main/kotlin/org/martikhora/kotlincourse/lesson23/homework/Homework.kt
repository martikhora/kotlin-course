package org.martikhora.kotlincourse.lesson23.homework

class Homework {

    fun analyzeDataType(value: Any) {
        when (value) {
            is String -> println("Это строка: [$value]")
            is Int -> println("Это целое число: [$value]")
            is List<*> -> println("Это список, количество элементов: [${value.size}]")
            is Map<*, *> -> println("Это карта, количество пар: [${value.size}]")
            else -> println("Неизвестный тип данных")
        }
    }

    fun safeCastToList(value: Any): Int {
        val list = value as? List<*> //тут пытаемся привести к List
        return list?.size ?: -1 //если приведение успешное, то возвращаем размер списка, если нет, то -1
    }

    fun getStringLengthOrZero(value: Any?): Int {
        val str = value as? String //пытаемся привести к string
        return str?.length ?: 0 //если получилось -- возвращаем длину строки, если нет, то 0
    }

    fun squareNumber(value: Any): Double {
        return when (value) {
            is Number -> value.toDouble() * value.toDouble() // если это число, возводим в квадрат
            is String -> {
                val squared = value.toDoubleOrNull() ?: 0.0
                squared * squared
            } // пробуем преобразовать строку в число и возвести в квадрат
            else -> 0.0 // если не число и не строка, возвращаем 0.0
        }
    }

    fun sumIntOrDoubleValues(values: List<Any?>): Double {
        return values.map {
            when (it) {
                is Double -> it
                is Int -> it.toDouble()
                else -> 0.0
            }
        }.sum()
    }

    fun tryCastToListAndPrint(value: Any) {
        (value as? List<*>)?.forEach {
            val result = (it as? String) ?: "Элемент не является строкой: $it"
            println(result)
        } ?: println("Ошибка: Значение не является списком.")
    }
}