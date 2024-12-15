package org.martikhora.kotlincourse.lesson28.homework

class EncryptorImpl(private val shift: Int) : Encryptor {

    override fun encrypt(content: String): String {
        return content.map { it + shift }.joinToString("")
    }
}
