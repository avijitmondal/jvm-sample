package com.avijitmondal.practice.kotlin

class Application {
    fun sayHello(): String {
        return "Hello World from Kotlin"
    }
}

fun main() {
    val application = Application()
    println(application.sayHello())
}