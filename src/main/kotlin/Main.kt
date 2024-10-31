package org.example

import org.example.classes.*
import kotlin.math.pow

fun main() {
    // ЗАНЯТИЕ 1
    // Вывод в консоль с новой строки
    println("Hi! ")
    println("Hello World!")
    println("Hi again! ")
    // Вывод с командой переноса строк
    print("Some text!\nAgain text...\nNew text\n")
    // Изменяемые переменные
    var a: Int = 10
    a = 20
    a = 30
    var e = 50
    println(a)
    // Неизменяемые переменные
    val b = 30
    // Явное указание типа данных
    val int: Int
    var string: String = "122"
    val char: Char
    var boolean: Boolean
    // Неявное указаие типа данных
    val int1 = 10
    var float1 = 10.4f
    var string1 = "String"
    val char1 = 'q'
    var boolean1 = false
    /*
       ТИПЫ ДАННЫХ В KOTLIN
       Числовые типы данных:
        Целочисленные:
            1) Byte
            2) Short
            3) Int
            4) Long
        С плавающей точкой
            1) Float
            2) Double
       Символьные типы данных: Char
       Строковые тип данных: String
       Логический тип данных: Boolean
     */
    // Арифметические операторы
    println("Арифметические операторы")
    println(e + b)
    println(e - b)
    println(e * b)
    println(e / b)
    println(e % b)
    println(float1.pow(2)) // Возведение в степень числа с плавающей точкой
    println(int1.toDouble().pow(2)) // Возведение в степень целочисленной переменной
    // Операторы сравнения
    println("Операторы сравнения")
    println(e > b)
    println(e < b)
    println(e == b)
    println(e != b)
    println(e >= b)
    println(e <= b)
    println(string == string1)
    // Строковая интерполяция
    println("Строковая интерполяция")
    println("e = " + (e + 10))
    println("e = ${e + 20}")
    // Ввод с консоли
    println("Ввод с консоли")
    val r = readln()
    println(r)
    println("Ввод нескольких чисел через пробел")
    val (q, w, i) = readln().split(" ").map { it.toInt() }
    println("q = ${q}, w = ${w}, i = ${i}")

    // ЗАНЯТИЕ 2
    // Условные операторы
    if (e > b) {
        println(e)
    } else if (e == b)
        println("e==b")
    else
        println(b)
    // Использование if для присвоения значения переменной
    val max = if (e > b) e else b
    // When
    val day = 6
    val dayName = when (day) {
        1 -> "Пн"
        2 -> "Вт"
        3 -> "Ср"
        4 -> "Чт"
        5 -> "Пт"
        6, 7 -> "Выходной день"
        in 6..7 -> "Выход за пределы"
        else -> "Некорректный день"
    }
    println(dayName)
    // Логические операторы
    if (true || false)
        println(true)

    if (true && !false)
        println(true)
    else
        println(false)
    // Циклы
    println("ЦИКЛ FOR")
    for (l in 1 until 101 step 50) {
        println(l)
    }
    println("РАЗВОРОТ")
    for (l in 100 downTo 1 step 10) {
        if (l == 60) continue
        if (l == 20) break
        println(l)
    }
    println("ЦИКЛ WHILE")
    var num1 = 5
    while (num1 > 0) {
        println(num1)
        num1--
    }
    println("ЦИКЛ DO-WHILE")
    var num2 = 0
    do {
        println(num2)
        num2++
    } while (num2 < 5)
    // Коллекции
    println("МАССИВ")
    val array = arrayOf(1, 2, 3, 4, 10, 50, 12, 50, 50)
    val emptyArray = emptyArray<String>()
    val intArray = intArrayOf()
    val doubleArray = doubleArrayOf()
    val booleanArray = booleanArrayOf(false, true, false)
    array[0] = 23
    println(array[0])
    println(array.indexOf(50))
    println(array.indexOf(156))
    println(array.contains(100))
    println(array.first())
    println(array.last())
    println("Размер массива ${array.size}")

    array.forEach {
        println(it)
    }
    println("СПИСКИ")
    val list = listOf(1, 2, 3)
    val mutableList = mutableListOf("Asfasf", "sfafas", "sfasf")
    mutableList.add("New str")
    mutableList.add(2, "New str2")
    mutableList.addAll(1, listOf("Afsaf", "fsafas", "fsaf"))

    println(mutableList.subList(0, 5))

    mutableList.remove("New str")
    mutableList.removeAt(3)
    mutableList.clear()

    mutableList.forEach {
        println(it)
    }
    println("МНОЖЕСТВО")
    val mutableSet1 = mutableSetOf(1, 2, 3)
    val mutableSet2 = mutableSetOf(3, 4, 5)
    println(mutableSet1.intersect(mutableSet2))
    println(mutableSet1.union(mutableSet2))
    println(mutableSet1.subtract(mutableSet2))
    println("АССОЦИАТИВНЫЙ МАССИВ")
    val map = mutableMapOf(0 to "afsasf", "asdfsda" to 2, false to 5.6, 0 to 9)
    map.forEach {
        println("Key ${it.key} = value ${it.value}")
    }

    // Null безопастность
    println("NULL БЕЗОПАСТНОСТЬ")
    val n = null
    var str: String? = "Hello"
    str = null

    val h = listOf("Hello", "fdass", null, "fsadfsa")

    try {
        h.forEach {
            println(it!!.length)
        }
    } catch (e: Exception) {
        println("Error $e")
    }

    // ЗАНЯТИЕ 3
    // Вызов функции
    println("ФУНКЦИИ")
    // Неявная передача параметра
    greet("World!")
    // Явная передача параметра
    greet(name = "everyone!")
    // Запись в переменную значения функции
    val sum = sum(b = 10, a = 5)
    println(sum)
    // Вызов функции с таким же названием, но с другими типами данных
    println(sum(13.4, 11.8))
    // Вызов функции с параметром по умолчанию
    println(pro(2, 2))
    println(pro(5, 6))
    // Замена параметра по умолчанию
    println(pro(5, 6, 10))
    // Лямба функция
    val square = { number: Int -> number * number }
    println(square(4))
    // Вызов функции высшего порядка
    val sumResult = operate(a = 4, b = 5, operation = { x, y -> x + y })
    val proResult = operate(a = 4, b = 5) { x, y -> x * y }
    println(sumResult)
    println(proResult)
    // ООП
    println("ООП")
    // Создание объекта класса car
    val toyota = Car("Toyota", "Rav4")
    val bmw = Car("BMW", "X5")
    val nissan = Car("Nissan", "Tida")
    // Изменение свойства класса Car
    toyota.color = "Black"
    // Обращение к свойствам класса Car
    println("Машина бренда ${toyota.brand}, с названием ${toyota.name}, цвета ${toyota.color}")
    println("Машина бренда ${bmw.brand}, с названием ${bmw.name}, цвета ${bmw.color}")
    println("Машина бренда ${nissan.brand}, с названием ${nissan.name}, цвета ${nissan.color}")
    // Создание объекта класса Moto
    val moto = Moto("Honda", "Some name")
    moto.name = "New name"
    println("Мотоцикл бренда ${moto.brand}, с названием ${moto.name}")
    // Изменение значения свойства с поздней инициализацией
    toyota.camera = "Yes"
    println(toyota.camera)
    // Вызов метода класса Car
    toyota.go()
    bmw.go()
    nissan.go()
    // Работа с приватными свойствами
    toyota.setWheels(wheels = 5)
    println(toyota.getWheels())
    // Обращение к свойствам и методам класса без создания объекта
    println(Car.androidAuto)
    Car.installAndroidAuto()
    println(Car.androidAuto)
    // Создание объекта дата класса
    val user1 = User("John", 25)
    val user2 = user1.copy(age = 30)
    println(user1)
    println(user2)
    // Создание объекта перечисления
    val direction = Direction.NORTH
    println(direction)
    // Вызов toString()
    println(toyota.toString())
    println(bmw.toString())
    println(nissan.toString())

    // ЗАНЯТИЕ 4
    val person = Person()
    person.address
    val man = Man()
    man.someFun()

    val circle = Circle(5.0)
    circle.describe()
    val rectangle = Rectangle(4.0, 3.0)
    rectangle.describe()

    val button = Button()
    button.click()
    button.focus()
    button.showOff()
}

// Объявление функции c параметрами
fun greet(name: String) {
    println("Hello, $name!")
}

// Объявление функции с возвращаемым значением
fun sum(a: Int, b: Int): Int {
    println(a)
    println(b)
    return a + b
}

// Перегрузка функции
// Однострочная функция
fun sum(a: Double, b: Double): Double = a + b

// Функция с параметром по умолчанию
fun pro(a: Int, b: Int, c: Int = 4): Int = (a * b) - c

// Функция высшего порядка
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
