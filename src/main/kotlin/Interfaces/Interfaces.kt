package org.example.Interfaces

import org.example.classes.Course

interface CourseRepository {

    val isCoursePersisted : Boolean
    fun getById(id: Int) : Course

    fun save(course: Course) : Int {
        println("saving course : $course")
        return course.id
    }

}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository{
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id,"Learning Kotlin", "Jacob")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }

}

class NoSqlCourseRepository : CourseRepository{
    override val isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id,"Learning Kotlin", "Jacob")
    }

    override fun save(course: Course): Int {
        println("saving course in nosqlcourserepository : $course")
        return super.save(course)
    }

}

interface A{
    fun doSomething(){
        println("doSomething in A")
    }
}

interface B{
    fun doSomething(){
        println("doSomething in B")
    }
}

class AB: A, B{
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }

}

fun main(){
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("course is $course")
    val courseId = sqlCourseRepository.save(course)
    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")

    val nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = nosqlCourseRepository.getById(2)
    println("course is $course1")
    val course1Id = nosqlCourseRepository.save(course1)


    val ab = AB()
    ab.doSomething()

}