package org.example.classes

import kotlin.math.pow

// Абстрактный класс Shape - класс, не имеющий реализации, нужен для наследования другими классами
// Нельзя наследовать больше одного абстрактного класса
abstract class Shape {
    // Абстрактный метод - метод, который нужно переопределять в дочерних классах
    abstract fun area(): Double

    // Обычный метод - может быть переопределен
    fun describe() {
        println("Площадь данной фигуры ${area()}")
    }
}

// Класс Circle, наследник абстрактного класса Shape
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius.pow(2)
    }
}

// Класс Rectangle, наследник абстрактного класса Shape
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}