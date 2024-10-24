package org.example.classes

class Moto {
    var brand: String
    var name: String

    // Вторичный констркутор класса
    constructor(brand: String, name: String) {
        this.brand = brand + " some string"
        this.name = name
    }
}