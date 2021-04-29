package com.avijitmondal.practice.scala

class Application {
  def sayHello(): String = {
    "Hello World from Scala"
  }
}

object Application {
  def main(args: Array[String]): Unit = {
    val application = new Application
    println(application.sayHello())
  }
}
