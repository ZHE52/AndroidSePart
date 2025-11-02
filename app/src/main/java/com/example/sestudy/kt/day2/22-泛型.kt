package com.example.sestudy.kt.day2

//通用盒子
class box<T>(private val item: T) {
    fun getItem(): T = item
}

fun main() {
    val stringBox =box("hello world")
    // 1. 传字符串
    println(stringBox.getItem().uppercase())//自动识别为String类型
    println()
    // 2. 传整数
    val numberBox =box(666)
    println(numberBox.getItem())

}