package com.example.sestudy.kt.day1

fun main() {
val cat=cat("小猫")//这个val是不是new一对象
    cat.makeSound()
    val animal=animal("小猪")//这个val是不是new一对象
    animal.makeSound()
}

//父类-动物
open class  animal(val name:String){
    open fun makeSound(){
        println("$name 正在叫")
    }
}

//子类-猫
class cat(name:String):animal(name){
    override fun makeSound(){
        println("$name 喵喵喵")
    }
}



