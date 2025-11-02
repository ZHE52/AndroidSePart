package com.example.sestudy.kt.day2

object Localization {
    // 不可变的多语言映射
    private val translations = mapOf(
        "en" to mapOf(
            "welcome" to "Welcome!",
            "goodbye" to "Goodbye!",
            "error" to "An error occurred"
        ),
        "zh" to mapOf(
            "welcome" to "欢迎！",
            "goodbye" to "再见！",
            "error" to "发生错误"
        ),
        "es" to mapOf(
            "welcome" to "¡Bienvenido!",
            "goodbye" to "¡Adiós!",
            "error" to "Se produjo un error"
        )
    )

    private var currentLang = "en"

    fun setLanguage(lang: String) {
        if (translations.containsKey(lang)) {
            currentLang = lang
            println("语言切换为: $lang")
        } else {
            println("不支持的语言: $lang")
        }
    }

    fun getString(key: String): String {
        val langMap = translations[currentLang] ?: translations["en"]!!
        return langMap[key] ?: "[$key]"
    }
}

fun main() {
    println("当前语言: ${Localization.getString("welcome")}")

    Localization.setLanguage("zh")
    println("中文: ${Localization.getString("welcome")}")
    println("中文: ${Localization.getString("goodbye")}")

    Localization.setLanguage("fr") // 不支持的语言
    println("法语(回退到英语): ${Localization.getString("error")}")
}