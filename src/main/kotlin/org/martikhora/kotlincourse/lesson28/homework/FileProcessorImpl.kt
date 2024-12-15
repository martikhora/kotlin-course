package org.martikhora.kotlincourse.lesson28.homework

import java.io.File

class FileProcessorImpl: FileProcessor {

    override fun findFilesByExtension(extension: String, directory: File): List<File> {
        return directory.walk().filter {
            it.isFile && it.extension == extension }.toList()
    }

    override fun encryptFiles(files: List<File>, encryptor: Encryptor) {
        for (file in files) {
            val content = file.readText()
            val encryptedContent = encryptor.encrypt(content)
            val encryptedFile = File(file.parent, "${file.nameWithoutExtension}_encrypted.${file.extension}")
            encryptedFile.writeText(encryptedContent)
        }
    }

    override fun moveToBackup(files: List<File>, backupDir: File, base: File) {
        for (file in files) {
            val relativePath = base.toPath().relativize(file.toPath())
            val backupFile = File(backupDir, relativePath.toString())
            backupFile.parentFile.mkdirs() // создаем директории, если они не существуют
            file.copyTo(backupFile, overwrite = true)
            file.delete() // удаляем оригинальный файл
        }
    }
}