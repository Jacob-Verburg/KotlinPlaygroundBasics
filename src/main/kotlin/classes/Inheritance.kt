package org.example.classes

open class User(val name: String) {

    open var isLoggedIn : Boolean = false
    open fun login(){
        println("Inside user Login")
    }

    private fun secret(){
        println("inside sercret")
    }

    protected open fun logout(){
        println("inside sercret")
    }

}

class Student(name: String) : User(name){
    override var isLoggedIn : Boolean = false

    companion object{
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }
    override fun login(){
        println("Inside Student Login")
        super.login()
    }

    public override fun logout(){
        super.logout()
        println("Inside Student Logout")
    }
}

class Instructor(name: String) : User(name){

    override fun login(){
        println("Inside Instructor Login")
        super.login()
    }

}


fun main(){
    val student = Student("Jacob")
    println("name is ${student.name}")
    student.login()
    student.logout()

    val country = Student.country()
    println("country is: $country")


    println("number of enrolled courses is: ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("bob")
    println("name is ${instructor.name}")
    instructor.login()

    val user = User("daName")


}