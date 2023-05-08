package com.wufake.app_001.kotlin_study

fun main() {
    // 条件控制
    // if 表达式，有返回值(即可以使用 return语句)，默认 为 Unit
    println("输入一个数")
    var a = readln()
    var b = if (a.toInt()<10){
        println("小于10")
    }else if (a.toInt()==10){
        println("等于10")
    }else{
        println("大于10")
    }
    println(b)  // kotlin.Unit
                // kotlin中 if表达式 有返回值的

    // if (xxx) a else b    三木运算

    // when 表达式(类似 switch语句),同样带有返回值
    // 类型判断函数
    var test:(Any) -> String = {
        when (it){
            is Byte -> "kotlin.Byte"
            is Short -> "kotlin.Short"
            is Int -> "kotlin.Int"
            is Long -> "kotlin.Long"
            is Boolean -> "kotlin.Boolean"
            is Float -> "kotlin.Float"
            is Double -> "kotlin.Double"
            is Char -> "kotlin.Char"
            is String -> "kotlin.String"
            else -> {"kotlin.Error"}
        }
    }
    println("类型判断测试")
    println(test(9))
    println(test('c'))
}