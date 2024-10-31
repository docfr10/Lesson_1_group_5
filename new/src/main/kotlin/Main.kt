package org.example

import org.example.classes.Person

// Файл Main из нового модуля
fun main() {
    println("Hello World!")
    val person = Person()
    // Из всех свойств будет доступен только id, так как все остальные private, protected или internal
    person.id
}