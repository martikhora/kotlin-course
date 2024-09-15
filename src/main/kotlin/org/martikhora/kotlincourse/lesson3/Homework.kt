package org.martikhora.kotlincourse.lesson3


class Homework {
    //Для каждого из полей подбери наилучший способ хранения из известных тебе. Учитывай такие факторы,
    // как изменяемость, обязательность, возможность начальной установки, ресурсоёмкие вычисления значения, необходимость
    // проверки устанавливаемого значения на валидность или запрет доступа на установку при возможности чтения,
    // публичность и приватность данных.


    //Название мероприятия
    val name: String = "Hackathon Survival"
    //Дата проведения
    var date: String = "01/01/2025"
    //Место проведения
    var place: String = "place"
    //Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы
    private val budget: String = "напишем сюда что-нибудь"
    //Количество участников
    var member: Int = 0
        get() = field
        set(value) {
          field = value
        }
    //Длительность хакатона
    var duration: Int = 5 * 60 * 60
    //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг
    private lateinit var info: String
    //Текущее состояние хакатона (статус)
    var status: String = "not started"
    //Список спонсоров
    val sponsors: String = "sponsors"
    //Бюджет мероприятия
    var finalBudget: Int = 100000
    //Текущий уровень доступа к интернету
    var internet: String = "done"
    //Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    var transport: String = "transport"
    //Количество команд
    var teams: Int = 0
        get() = field
        set(value) {
            field = value
        }
    //Перечень задач
    val tasks: String = "tasks"
    //План эвакуации
    val evacuation: String = "evacuation"
    //Список доступного оборудования
    val equipment: String = "equipment"
    //Список свободного оборудования
    val freeEquipment: String = "freeEquipment"
    //График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    val lunch: String = "lunchList"
    //План мероприятий на случай сбоев
    val planB: String = "planB"
    //Список экспертов и жюри
    val experts: String = "experts"
    //Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
    val methods: String = "methods"
    //Политика конфиденциальности
    val policy: String = "policy"
    //Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    val feedback: String = "feedback"
    //Текущая температура в помещении
    var temperature: Double = 23.0
    //Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
    val monitor: String = "monitor"
    //Уровень освещения
    var light: Int = 5
    //Лог событий мероприятия
    val log: String = "log"
    //Доступность медицинской помощи
    var medicine: Boolean = true
    //Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    val security: String = "security"
    //Регистрационный номер мероприятия
    val registryNumber: Int = 123456789
    //Максимально допустимый уровень шума в помещении хакатона.
    var noise: Double = 10.0
    //Индикатор превышения уровня шума в помещениях
    val maxNoise: Double = 20.0
    //Формат мероприятия (зависит от геополитической обстановки)
    var format: String = "normal"
    //Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
    var restPlaces: Int = 20
    //План взаимодействия с прессой
    val press: String = "press"
    //Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    val projects: String = "projects"
    //Статус получения всех необходимых разрешений
    val permission: String = "permission"
    //Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
    var access: Boolean = true
    //Список партнеров мероприятия
    val listOfPartners: String = "listOfPartners"
    //Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    val report: String by lazy {
        ""
    }
    //План распределения призов
    val prizePlan: String = "prizePlan"
    //Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
    val emergencyInfo: String = "emergencyInfo"
    //Особые условия для участников с ограниченными возможностями
    val special: String = "special"
    //Общее настроение участников (определяется опросами)
    lateinit var mood: String
    //Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
    val planOfHackathon: String = "planOfHackathon"
    //Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
    val specialGuest: String = "specialGuest"
    //Максимальное количество людей, которое может вместить место проведения.
    var maxPeople: Int = 5000
    //Стандартное количество часов, отведенное каждой команде для работы над проектом.

}