package org.example.classes

data class Employee(
    val id: Int = 0,
    val name: String = ""
)


fun main(){
    val employee = Employee(1, "Jacob")
    println(employee)

    val employee2 = employee.copy()

    println("Checking Object Equality: ${employee == employee2}")

    val employee3 = employee.copy(
        id=3
    )
    println(employee3)

}