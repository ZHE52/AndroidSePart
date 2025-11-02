package com.example.sestudy.kt.day2

fun main() {
    listLambda()

    commonLambda()
}

fun listLambda() {
    var aa = listOf(1, 2, 3, 4, 5)
    val list = listOf(11, 22, 33, -4, 88, 3, -5, 18)

    // 1. 找出最大值
    println(aa.max())
    println("---------------------")
    val max = list.max()
    println("max = $max")

    // 2. 找出最小值
    println(aa.min())
    println("---------------------")


    val min = list.min()
    println("min = $min")

    // 3. 找出所有的正数
    for (item in aa) {
        if (item > 0) {
            print("$item ")
        }

    }
    println("---------------------")



    val positive = list.filter { it > 0 }
    for (item in positive) {
        print("$item ")
    }
    println()

    // 4. 升序排列
    val sort = list.sorted()
    for (item in sort) {
        print("$item")
    }
    println()

    // 5. 降序排列
    val sortDescending = list.sortedDescending()
    for (item in sortDescending) {
        print("$item")
    }
    println()

    // 6. 求和
    val sum = list.sum()
    println("sum = $sum")

    // 7. 求平均值
    val average = list.average()
    println("average = $average")

    // 8. 将所有的数字拼接一个逗号
    val joinToString = list.joinToString(",")
    println("joinToString = $joinToString")

    // 9. 是否有一个负数
    val any = list.any { it < 0 }
    println("是否有一个负数 = $any")

    // 10. 是否全部是负数
    val all = list.all { it < 0 }
    println("是否全部是负数 = $all")
}


fun commonLambda() {
    // 1. 将元素转换为另一种形式
    val names = listOf("ZhangSan", "LiSi", "WangWu")
    val lengths = names.map { it.length }
    println(lengths)


    // 2. 筛选符合条件的元素
    val numbers = listOf(1, 2, 3, 4, 5)
    val evens = numbers.filter { it % 2 == 0 }
    println(evens)  // [2, 4]


    // 3. forEach - 遍历元素
    // 替代传统 for 循环
    listOf("A", "B", "C").forEach {
        print("$it ") // A B C
    }

    println()

    // 带索引遍历
    listOf("Apple", "Banana").forEachIndexed { index, item ->
        println("$index: $item")
    }

    // 4. find/firstOrNull - 查找元素
    // 查找符合条件的第一个元素
    data class User(val name: String, val age: Int)

    val users = listOf(User("Alice", 25), User("Bob", 17))
    println(users.find { it.age < 18 })  // User("Bob", 17)

    // 安全查找（找不到返回 null）
    val user = users.firstOrNull { it.name == "ZhangSan" }
    println(user)


    // 5. 安全处理可空对象
    val name: String? = ""
    name?.let {
        println(it.uppercase()) // 仅在非空时执行
    }

    // 6. takeIf/takeUnless - 条件检查
    // 根据条件获取或排除对象
    val input = "kotlin"
    val result = input.takeIf { it.length > 3 }?.uppercase() // "KOTLIN"
    println(result)

    // 实际应用：验证检查
    val email = "user#example.com"
    val validEmail = email.takeIf { it.contains("@") } ?: throw Error("错误的邮箱地址")
    println(validEmail)
}