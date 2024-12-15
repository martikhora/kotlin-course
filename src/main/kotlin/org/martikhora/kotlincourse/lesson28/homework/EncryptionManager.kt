package org.martikhora.kotlincourse.lesson28.homework

import java.io.File

class EncryptionManager (private val fileProcessor: FileProcessor, private val encryptor: Encryptor) {

    fun encryptFilesInDirectory(directory: File, backupDir: File, extension: String) {
        val filesToEncrypt = fileProcessor.findFilesByExtension(extension, directory)
        if (filesToEncrypt.isEmpty()) {
            println("No files with the extension '$extension' found in directory: ${directory.absolutePath}")
            return
        }

        fileProcessor.encryptFiles(filesToEncrypt, encryptor)
        fileProcessor.moveToBackup(filesToEncrypt, backupDir, directory)
        println("Encryption completed for ${filesToEncrypt.size} file(s).")
    }


}