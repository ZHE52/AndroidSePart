package com.example.sestudy.kt.day1

fun main() {
  //pensen1("张三",88)//这里为什么不能直接这样写
   // var a =pensen1("张三",88)//而要这样写
    pensen1("钉钉",77).intro1()
   // a.intro1()//为什么只有这样才能使用intro1
}


//主构造函数
class pensen1 constructor(var name:String,var age:Int){//为什么这里不加var就不能通过编译呢
    init {
        println("初始化")
        require(name.isNotEmpty()){ "姓名不能为空" }
        require(age>0){"年龄不能小于0"}
    }
    fun intro1(){
       // print("我的名字是$name,今年$age 岁")
        println("我的名字叫$name,今年${age}岁")

    }
}
//隐构造函数


