package org.martikhora.kotlincourse.lesson21.homework

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(input: String): List<String> {
        return input.split(" ").filter { it.isNotEmpty() }
    }

    override fun mapList(input: List<String>): List<List<String>> {
        return input.map { map(it) }
    }

}