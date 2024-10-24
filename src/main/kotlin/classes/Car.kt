package org.example.classes

// Класс Car
// Первичный конструктор класса - позволяют задать уникальные для каждого объекта значения свойств
class Car(val brand: String, val name: String) {
    // Блок init - вызывается при инициализации объекта класса
    init {
        println("Новая машина бренда $brand создана!")
    }

    // Блок companion object - позвоялет обращаться к методам и свойстам класса без создания объекта
    companion object {
        var androidAuto = false

        fun installAndroidAuto() {
            androidAuto = true
        }
    }

    // Свойства класса - переменные внутри класса - одинаковы для всех объектов класса
    var color: String = "White"

    // Приватное свойство
    private var wheels: Int = 4

    // Гетер - получение значения свойства
    fun getWheels(): Int = wheels

    // Сетер - изменение значения свойства
    fun setWheels(wheels: Int) {
        this.wheels = wheels
    }

    // Свойства с поздней инициализацией
    lateinit var camera: String

    // Блок init можно вызывать несколько раз
    // Отрабатывать он будет по очереди вызова
    init {
        println("Новая машина бренда $brand будет иметь цвет $color")
    }

    // Методы класа - функции внутри класса
    fun go() {
        println("Машина $name поехала")
    }

    // Переопределение метода toString()
    override fun toString(): String {
        return "Машина бренда $brand, с названием $name, цвета $color"
    }
}