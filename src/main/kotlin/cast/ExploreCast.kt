package org.example.cast

import org.example.classes.Course

fun checkType(type: Any) {

    when(type){
        is Course -> {
            //val course = type as Course
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }

}


fun castNumber(any: Any) {

    when(any){
        any as Double -> println("value is Double")
    }

}



fun main(){
    val course = Course(1,"Learning Kotlin", "Jacob")


    checkType(course)
    checkType("BOB")

    castNumber(1.0)
   // castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)

}



