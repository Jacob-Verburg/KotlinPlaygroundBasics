package org.example.basics

fun main(){
    //if-else
    //when

    var name = "Bob"
    name="Alex"
    val result = if(name.length==3){
        println("Name is Three characters")
        name.length
    }else{
        println("Name is NOT Three characters")
        name.length
    }

    println("result : $result")

    //1 -> gold, 2 -> silver, 3 -> bronze

    /*var position = 1
    position=2
    val medal = if(position==1) {
        "GOLD"
    } else if(position==2){
        "SILVER"
    } else if(position==3){
        "BRONZE"
    } else {
        "NO MEDAL"
    }
    println(medal)
*/

    //1 -> gold, 2 -> silver, 3 -> bronze

    var position = 1
    position=3
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)


}