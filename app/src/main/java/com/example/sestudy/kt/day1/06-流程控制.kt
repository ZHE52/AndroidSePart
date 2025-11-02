package com.example.sestudy.kt.day1

fun main() {
println(whenFun(6))


}
//if
fun ifFun(num1:Int,num2:Int):Int{
    return if (num1>num2)num1 else num2
}
//when-进数字，出中文
fun whenFun(num1:Int):String{
    return when(num1){
        1->"一"
        2->"一er"
        3->"一ersan"
        else -> {
            "other"
        }
    }
}



