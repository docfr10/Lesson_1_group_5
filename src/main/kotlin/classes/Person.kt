package org.example.classes

// Класс Person открыт для наследования при помощи модификатора open
open class Person {
    // Public - модификатор доступа по умполчанию, делает доступным свойство или метод доступным везде
    public var id: Int = 0

    // Private - модификатор доступа, делает свойство или метод недоступным нигде кроме самого класса
    private var name: String = ""

    // Protected - модификатор доступа,
    // делает свойство или метод недоступным нигде кроме самого класса или подкласса
    protected var age: Int = 0

    // Internal - модификатор доступа,
    // делает свойство или метод недоступным нигде кроме одного и того же модуля с классом
    internal var address: String = ""

    open fun someFun() {
        println("Some Fun")
    }

    init {
        name = "New name"
    }
}

// Дочерний класс Man, наследует класс Person
class Man : Person() {
    override fun someFun() {
        println("Some man")
    }
}