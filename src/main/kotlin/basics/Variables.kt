package org.example.basics

fun main(){
    val name = "Jacob"
    println(name)

    //name = "Jacob1" //throws error due to val vs var

    var age = 37
    println(age)
    age = 38
    println(age)


    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course : $course and the course length is ${course.length}")


    val multiLine = "ABC\nDEF"
    println(multiLine)

    val multLine1 = """
        ABC
        DEF
    """.trimIndent()
    println(multLine1)

}