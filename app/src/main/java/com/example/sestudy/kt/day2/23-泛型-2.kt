package com.example.sestudy.kt.day2

//盒子
class userBox<T> (
    val name: String,
    val code: Int,
    val data:T

    )

// 用户数据模型
        data class user(val id:String,val name:String)

// 商品数据模型
        data class product(val id:String,val name:String)
fun main() {
    // 用户API响应
val userResponse=userBox<user>(
    name="张三",
    code = 200,
    data = user("1","张三")
)

    // 商品API响应
  val productResponse=  userBox<product>(
        name="商品列表",
       code=900,
     data=product("1","商品1")
    )

    // 直接访问特定类型数据（无需类型转换！）
println(userResponse.data.id)
println(userResponse.data.name)
println(productResponse.data.name)
println(productResponse.data.id)
}