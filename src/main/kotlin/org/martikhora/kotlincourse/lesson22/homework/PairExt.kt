package org.martikhora.kotlincourse.lesson22.homework

fun <A, B> Pair<A, B>.revert(): Pair<B, A> {
    return Pair(this.second, this.first)
}

//    val pair1 = Pair(1, "one")
//    val reversedPair1 = pair1.revert()
//    println("Исходная пара: $pair1, Перевернутая пара: $reversedPair1")

//    val pair2 = Pair(null, "empty")
//    val reversedPair2 = pair2.revert()
//    println("Исходная пара: $pair2, Перевернутая пара: $reversedPair2")

//    val pair3 = Pair(3.14, "PI")
//    val reversedPair3 = pair3.revert()
//    println("Исходная пара: $pair3, Перевернутая пара: $reversedPair3")