package org.martikhora.kotlincourse.lesson14

class Homework {

    //    Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
//    Определите среднее время выполнения теста.
    fun averageTestTime(test: Map<String, Int>) {
        println("Среднее время выполнения теста: ${test.values.average()}")
    }

    //    Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов
//    а значения - строка с метаданными.
//    Выведите список всех тестовых методов.
    fun listAllTheMethods(metaData: Map<String, String>) {
        println(metaData.keys.toList())
    }

    //    В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    fun addTestResult(results: MutableMap<String, Boolean>, testName: String, result: Boolean) {
        results[testName] = result
    }

    //    Посчитайте количество успешных тестов в словаре с результатами.
    fun successfulTests(tests: Map<String, Boolean>) {
        val success = tests.values.count { it }
    }

    //    Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    fun removeFixedBug(bug: MutableMap<String, String>, bugId: String) {
        bug.remove(bugId)
    }

    //    Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
//    выведите сообщение о странице и статусе её проверки.
    fun printPageStatus(pageStatus: Map<String, String>) {
        for ((url, status) in pageStatus) {
            println("Страница: $url, Статус: $status")
        }
    }

    //    Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    fun responseTimeExceed(responseTime: Map<String, Int>, threshold: Int): Map<String, Int> {
        return responseTime.filter { it.value > threshold }
    }

    //    В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке).
//    Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    fun apiResponseStatus(apiResult: Map<String, String>, endpoint: String): String {
        return apiResult[endpoint] ?: "Эндпоинт протестирован"
    }

    //    Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
//    получите значение для "browserType". Ответ не может быть null.
    fun getBrowserType(config: Map<String, String>): String {
        return config["browserType"] ?: error("Значение не может быть null")

    }

    //    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    fun copySoftwareTestVersions(version: Map<String, String>): Map<String, String> {
        return version.toMap()
    }

    //    Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
//    получите настройки для конкретной модели или верните настройки по умолчанию.
    fun mobileTesting(setting: Map<String, String>) {
        setting.forEach { (device, config) ->
            println("Настройки для $device: $config")
        }
    }

    //    Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    fun containsErrorCodes(errors: Map<String, String>, errorCode: String): Boolean {
        return errors.keys.any { it == errorCode }
    }

    //    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
//    а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
//    Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    fun filterTestsByVersions(tests: Map<String, String>, version: String): Map<String, String> {
        return tests.filterKeys { it.endsWith("_$version") }
    }

    //    У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//    а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    fun hasFailedModules(module: Map<String, String>): Boolean {
        return module.values.any { it == "Failed" }
    }

    //    Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    fun addNewSettings(destinationMap: MutableMap<String, String>, sourceMap: Map<String, String>) {
        destinationMap.putAll(sourceMap)
    }

    //    Объедините два неизменяемых словаря с данными о багах.
    fun mergeMaps(bugs1: Map<String, String>, bugs2: Map<String, String>): Map<String, String> {
        return bugs1 + bugs2
    }

    //    Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    fun clearTemporaryData(temporaryData: MutableMap<String, String>) {
        temporaryData.clear()
    }

    //    Исключите из отчета по автоматизированному тестированию те случаи,
//    где тесты были пропущены (имеют статус “skipped”)
    fun filterSkipped(report: Map<String, String>): Map<String, String> {
        return report.filter { it.value != "Skipped" }
    }

    //    Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    fun deleteOldConfig(config: MutableMap<String, String>, oldConfig: Set<String>) {
        oldConfig.forEach { config.remove(it) }
    }

    //    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//    (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    fun testReport(testResult: Map<String, String>): List<String> {
        return testResult.map { "Test ID: ${it.key}: ${it.value}" }
    }

    //    Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    fun archieveTestResults(results: MutableMap<String, String>): Map<String, String> {
        return results.toMap()
    }

    //    Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
//    заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод,
//    например getNameById(id: String))
    fun renameTestID(testTime: Map<String, Long>): Map<String, Long> {
        return testTime.mapKeys { getNameById(it.key) }
    }

    fun getNameById(id: String): String {
        return "TestName_$id"
    }

    //    Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
//    чтобы учесть новые условия тестирования.
    fun increasePerformance(performance: MutableMap<String, Double>) {
        performance.keys.forEach { key -> performance[key] = performance[key]!! * 1.10 }
    }

    //    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    fun isCompilationMapEmpty(compilationErrors: Map<String, String>): Boolean {
        return compilationErrors.isEmpty()
    }

    //    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    fun isLoadTestResultsNotEmpty(loadTestResults: Map<String, String>): Boolean {
        return loadTestResults.isNotEmpty()
    }

    //    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    fun areAllAutomatedTestsDone(testResults: Map<String, String>): Boolean {
        return testResults.values.all { it == "Passed" }
    }

    //    Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    fun hasErrors(testResults: Map<String, String>): Boolean {
        return testResults.values.any { it == "Failed" }
    }

    //    Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
//    которые не прошли успешно и содержат в названии “optional”.
    fun filterTestResults(results: Map<String, String>): Map<String, String> {
        return results.filter { (key, value) -> value == "Failed" && key.contains("optional") }
    }
}