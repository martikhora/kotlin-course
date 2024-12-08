package org.martikhora.kotlincourse.lesson26.homework

//Напишите функцию combineAndTransform, которая принимает две коллекции одного типа и функцию для их объединения и
// преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)


fun <T, K> combineAndTransform(
    collection1: List<T>,
    collection2: List<T>,
    union: (List<T>, List<T>) -> List<K>
): List<K> {
    return union(collection1, collection2)
}

fun <T, K, L : Collection<T>, M : Collection<K>> combineAndTransform1(
    collection1: L,
    collection2: L,
    union: (L, L) -> M
): M {
    return union(collection1, collection2)
}

fun main() {
    val numbers1 = listOf(1, 2, 3)
    val numbers2 = listOf(4, 5, 6)

    val combinedSum = combineAndTransform1(numbers1, numbers2) { a, b -> a + b }
    println(combinedSum) // Вывод: [5, 7, 9]

    val combinedList = combineAndTransform1(numbers1, numbers2) { c1, c2 ->
        (c1 + c2).map { it * 2 }
    }
    println(combinedList)

}