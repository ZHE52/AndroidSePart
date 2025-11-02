package com.example.sestudy.kt.day1


object SettingsManager{
    //单例属性
    var darkModeEnabled11=false//为什么这就是单例模式？

    fun toggleDarkMode(){
        darkModeEnabled11=darkModeEnabled11
        println("暗黑模式 ${if (darkModeEnabled11) "已开启" else "已关闭"}")
    }
}


fun main() {

    SettingsManager.toggleDarkMode()

}




