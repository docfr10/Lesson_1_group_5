package org.example

// Интерфейс Clickable - нужен для наследования классами, можно унаслежовать больше одного интерфейса
interface Clickable {
    fun click()

    fun showOff() {
        println("Кнопка была нажата")
    }
}

interface Focusable {
    fun focus()

    fun showOff() {
        println("На кнопке сфокусировались")
    }
}

class Button : Clickable, Focusable {
    override fun click() {
        println("Клик")
    }

    override fun focus() {
        println("Фокус")
    }

    override fun showOff() {
        // Super - вызов родительского метода
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}