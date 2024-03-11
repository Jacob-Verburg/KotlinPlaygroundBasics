package org.example.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main(){
    val course = Course(1,"Learning Kotlin", "Jacob")

    val course1 = Course(2,"Learning Kotlin", "Jacob")

    println("Checking Object Equality: ${course == course1}")

    val course2 = course1.copy(
        id=3, author="Woo"
    )

    println(course2)

    val marketingCourse = Course(4,"Learning Marketing", "Jacob", CourseCategory.MARKETING)
    println(marketingCourse)

}