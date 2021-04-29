package com.avijitmondal.practice.kotlin

class Mammal(val name: String)                                                   // 1

object KotlinObject {
    @JvmStatic
    fun main(args: Array<String>) {
        println(Mammal("""Cow""").name)
    }
}