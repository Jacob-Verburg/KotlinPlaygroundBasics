package org.example.functions

import java.time.LocalDate

fun main() {

    printName("Bob")
    val result = addition(1,2)
    println(result)
    val result2 = addition_approach1(4,5)
    println(result2)

    printPersonDetails("john","abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Chris")
    printPersonDetails(name="Chris", dob= LocalDate.parse("2020-01-01"))
}

fun printName(name: String) {
    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}

fun addition_approach1(x: Int, y: Int) = x+y


fun printPersonDetails(
    name : String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
){
    println("Name is $name and the email is $email and the dob is $dob")
}