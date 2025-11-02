package com.example.sestudy.kt.day1

fun main() {
    listOfDemo()
}

fun listOfDemo() {
    var list = mutableListOf("red", "blue")//这里list是不可以变得
    println(list)

    //访问list
    println(list)
    //修改值
    list[0] = "Pink"//需要将list属性改为可以修改值得内容
//list[0]="yellow"
    println(list)
    //遍历
    for (item in list){
        println(item)
    }
    //添加
    list.add("我是白色")
    println(list)
    //修改
    list[0]="我是你大爷"
    println(list)
    //删除,通过下标
    list.removeAt(0)
    println(list)
    //删除，通过值
    list.remove("我是白色")
    println(list)


}




