package com.example.sestudy.kt.day1

fun main() {

    val people1=people()
    people1.name="张三"
    people1.age=33
    people1.introduce()


}

class people {
    var name: String = ""
    var age: Int =0

    fun introduce(){
        println("我的名字是$name 我今年是$age 岁")
    }
}



