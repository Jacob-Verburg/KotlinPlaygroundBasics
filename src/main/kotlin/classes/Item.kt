package org.example.classes

class Item() {

    var name : String = ""
    var price: Double = 0.0
        get() {
            println("inside getter")
            return field
        }
        set(value){
            println("inside setter")
            if(value >= 0.0){
                field = value
            }else{
                throw IllegalArgumentException("Negative price is not allowed")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }



}

fun main(){
    val item = Item("iPhone")
    println("Item name is ${item.name}")
    item.name="Android"
    println("Item name is ${item.name}")

    item.price = 10.0
    println(item.price)

    item.price= -7.0

}