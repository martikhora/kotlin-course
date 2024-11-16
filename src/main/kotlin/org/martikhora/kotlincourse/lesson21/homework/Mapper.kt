package org.martikhora.kotlincourse.lesson21.homework

interface Mapper <T, R> {

    fun map(input: T): R

    fun mapList(input: List<T>): List<R>

}