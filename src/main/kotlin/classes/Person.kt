package org.example.classes

class Person(val name : String = "", val age: Int = 0) {

    var email: String = ""
    var nameLength: Int = 0
    init {
        println("inside init block")
        nameLength = name.length
    }
    constructor(_email:String, _name: String="", _age: Int=0) : this(_name,_age){
        email = _email
    }

    fun action(){
        println("Person walks")
    }
}

fun main(){
//    val person = Person("Jacob",37)
//    person.action()
//    println("Name : ${person.name} and the age is ${person.age}")
//
//    val person2 = Person()
//    person2.action()
//    println("Name : ${person2.name} and the age is ${person2.age}")

    val person3 = Person(_email = "woot@gmail.com", _name = "Bob", _age = 25)
    println("Name : ${person3.name} and the age is ${person3.age} and the email is ${person3.email} and namelength is ${person3.nameLength}")
}