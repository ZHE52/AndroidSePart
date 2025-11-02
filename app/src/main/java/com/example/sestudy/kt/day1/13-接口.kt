package com.example.sestudy.kt.day1

fun main() {
val student = Student("18","张三")
student.introduce()
}

interface person {
     val age: String
    val name:String
   // val age:Int
    fun introduce(){
        println("我的名字是$name,今年$age")
    }
    fun eat(){
        println("吃吃吃")
    }
}
class Student(override val age: String, override val name: String):person{
    override fun introduce() {
        super.introduce()
    }
}




