package org.martikhora.kotlincourse.lesson28.homework

import java.io.File


fun main() {

    //Создайте текстовый файл workspace/task1/example.txt
    // и запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.
    val filePath = "workspace/task1/example.txt" //путь к файлу
    val file = File(filePath) //создаем файл
    file.parentFile.mkdirs() // создаем директории
    file.writeText("Hello, Kotlin!")

    if (file.exists()) {
        println("Файл существует: ${file.absolutePath}")
    } else {
        println("Файл не существует.")
    }

    //Создайте директорию workspace/task2/testDir,
    // проверьте, является ли она директорией, и выведите её абсолютный путь
    val dirPath = "workspace/task2/testDir" //определяем путь
    val directory = File(dirPath)// создаем папку
    directory.mkdirs()// создаем директорию, если она не существует
    if (directory.isDirectory) {
        println("Это директория: ${directory.absolutePath}")
    } else {
        println("Это не директория.")
    }

    //Создайте директорию workspace/task3/structure.
    //Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
    // Проверьте, что myDir действительно содержит эти поддиректории.
    val baseDirPath = "workspace/task3/structure"
    val myDirPath = "$baseDirPath/myDir"
    val subDir1Path = "$myDirPath/subDir1"
    val subDir2Path = "$myDirPath/subDir2"

    val baseDir = File(baseDirPath) //для основной директории
    baseDir.mkdirs() //создаем все нужные директории
    val myDir = File(myDirPath)
    myDir.mkdirs() //создаем myDir

    val subDir1 = File(subDir1Path)
    val subDir2 = File(subDir2Path)
    subDir1.mkdirs() // создает subDir1
    subDir2.mkdirs() // создает subDir2

    if (myDir.isDirectory) {
        val containsSubDir1 = subDir1.exists() && subDir1.isDirectory
        val containsSubDir2 = subDir2.exists() && subDir2.isDirectory

        if (containsSubDir1 && containsSubDir2) {
            println("Директория ${myDir.absolutePath} содержит поддиректории:")
            println(" - ${subDir1.absolutePath}")
            println(" - ${subDir2.absolutePath}")
        } else {
            println("Поддиректории не созданы должным образом.")
        }
    } else {
        println("${myDir.absolutePath} не является директорией.")
    }

    //Создайте директорию workspace/task4/temp.
    //Внутри директории temp создайте несколько вложенных файлов и директорий.
    //Удалите директорию workspace/task4 со всем содержимым
    val tempDirPath = "workspace/task4/temp"
    val dir1Path = "$tempDirPath/dir1"
    val dir2Path = "$tempDirPath/dir2"
    val file1Path = "$tempDirPath/file1.txt"
    val file2Path = "$tempDirPath/dir1/file2.txt"

    val tempDir = File(tempDirPath)
    tempDir.mkdirs()

    val dir1 = File(dir1Path)
    dir1.mkdirs()

    val dir2 = File(dir2Path)
    dir2.mkdirs()

    val file1 = File(file1Path)
    file1.createNewFile()

    val file2 = File(file2Path)
    file2.createNewFile()

    println("Созданы следующие файлы и директории:")
    println("- ${dir1.absolutePath}")
    println("- ${dir2.absolutePath}")
    println("- ${file1.absolutePath}")
    println("- ${file2.absolutePath}")

    val directoryToDelete = File("workspace/task4")
    if (directoryToDelete.exists() && directoryToDelete.isDirectory) {
        directoryToDelete.deleteRecursively() // удаляем директорию и все её содержимое
        println("Директория ${directoryToDelete.absolutePath} успешно удалена со всем содержимым.")
    } else {
        println("Директория ${directoryToDelete.absolutePath} не существует или не является директорией.")
    }

    //Создайте файл workspace/task5/config/config.txt
    //запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.
    val configFilePath = "workspace/task5/config/config.txt" //определяем путь
    val configDir = File(configFilePath).parentFile //создаем директорию
    configDir.mkdirs()

    val params = mapOf("1" to "Hello", "2" to "Kotlin")
    File(configFilePath).printWriter().use {
        out -> out.println(params)
    }

    println("Параметры успешно записаны в файл $configFilePath")


    //Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов
    val rootDir = File("workspace")
    if (rootDir.exists() && rootDir.isDirectory) {
        // проходим по всем файлам и директориям
        rootDir.walk().forEach { file ->
            if (file.isDirectory) {
                // выводим путь к директории
                println("Директория: ${file.absolutePath}")
            } else {
                // выводим путь к файлу
                println("Файл: ${file.absolutePath}")
            }
        }
    } else {
        println("Указанная директория не существует.")
    }

    //Создайте директорию workspace/task9/docs.
    //Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."
    val task9DirPath = "workspace/task9/docs"
    val dir = File(task9DirPath)

    if (!dir.exists()) {
        dir.mkdirs()
        println("Директория $task9DirPath создана.")
    } else {
        println("Директория $task9DirPath уже существует.")
    }

    val readMeFilePath = "${task9DirPath}/readme.md"
    val readMeFile = File(readMeFilePath)

    // проверяем, существует ли файл
    if (!readMeFile.exists()) {
        // создаем файл и записываем текст
        readMeFile.writeText("This is a README file.")
        println("Файл $readMeFilePath создан и текст записан.")
    } else {
        println("Файл $readMeFilePath уже существует.")
    }
}