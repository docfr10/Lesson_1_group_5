package org.example

import kotlin.math.pow

fun main() {
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
    val (q, w, i) = readln().split(" ")
    println("q = ${q.toInt()}, w = ${w.toInt()}, i = ${i.toInt()}")
}