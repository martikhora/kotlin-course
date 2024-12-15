package org.martikhora.kotlincourse.lesson28.homework

import java.io.File

fun main() {

    val testDirectory = File("test_dir")
    val backupDirectory = File("backup_dir")
    testDirectory.mkdirs() // Создаем тестовую директорию
    listOf("data1.txt", "data2.txt", "data3.txt").forEach { fileName ->
        File(testDirectory, fileName).writeText("This is the content of $fileName.")
    }

    val fileProcessor = FileProcessorImpl()
    val encryptor = EncryptorImpl(3) // Сдвиг на 3 позиции
    val encryptionManager = EncryptionManager(fileProcessor, encryptor)

    encryptionManager.encryptFilesInDirectory(testDirectory, backupDirectory, "txt")

}