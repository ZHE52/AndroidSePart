package com.example.sestudy.kt.day2

fun main() {
    // 1. 创建列表（允许重复元素）
    val fruitList = listOf("🍎", "🍌", "🍊", "🍎", "🍌")
    val fruitSet = setOf("🍎", "🍌", "🍊", "🍎", "🍌")
    println(fruitList)
    println(fruitSet)  // 输出: [🍎, 🍌, 🍊] (去重，但保留插入顺序)

    // 输出: [🍎, 🍌, 🍊, 🍎, 🍌] (保留顺序和重复)

    // 2. 创建集合（自动去重）

    // 输出: [🍎, 🍌, 🍊] (去重，但保留插入顺序)

    // 3. 索引访问对比
    println(fruitList[0])
    println(fruitSet.elementAt(0))
    println(fruitSet.first())






    // 集合不支持索引访问
    // fruitSet[0] // 编译错误！

}