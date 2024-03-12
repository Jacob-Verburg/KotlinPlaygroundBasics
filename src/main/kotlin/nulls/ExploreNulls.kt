package org.example.nulls

data class Movie(
    val id : Int?,
    val name : String
)

fun printName(name: String){
    println("Name is : $name")
}

fun printName1(name: String?){
    println("Name is : $name")
}

fun main(){

    var nameNullable : String? = null
    //printName(nameNullable!!)

    nameNullable?.run {
        printName(this)
    }
    printName1(nameNullable)

    println("Value is: ${nameNullable?.length}") //safe operator, ?
    println("Value is: ${nameNullable?.length?.toLong()}")
    nameNullable  = "Jacob"
    printName1(nameNullable)
    println("Value is: ${nameNullable.length.toLong()}")
    println("Value is: $nameNullable")

    var name : String = "daName"

    val movie = Movie(null, "A cool movie name")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) //non null asserts !!
    println("Saved Movie: $savedMovie")

}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id=1)
    //return movie
}
