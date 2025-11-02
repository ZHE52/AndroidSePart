package com.example.sestudy.kt.day1

import java.util.jar.Attributes.Name

data class Studentt(
    val age: String,
    val name: String
)

data class teacher(
    val name:String,
    val age:String
)
fun main() {

    val james = Studentt("12", "james")
    println(james)
    val zhang=teacher("zhang","12")
    println(zhang)
}





