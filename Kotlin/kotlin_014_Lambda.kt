package com.wufake.app_001.kotlin_study

fun main(){
    // Lambda 表达式（一种匿名函数）
    // 语法糖 指计算机语言中添加的某种语法，这种语法对语言的功能并没有影响，但是更方便程序员使用

    // 定义一个 函数类型变量，
    // 类型 (Int, Int) -> Int
    // 等号右边 为lambda表达式
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    // 如果有返回值 方法的最后一行，可以不用return
    //
    println(sum(1, 2)) // 输出 3

    // lambda隐形参数 it(当lambda表达式 只有一个参数时)
    var a = mutableListOf(1,2,3,4,5)
    a.forEach(){ print(it.toString()+"\t") }
    println("\n-------------------------")
    a.forEachIndexed({it,a -> println("$a 的索引为 $it")})
    println("-------------------------")
//    a.forEachIndexed{it,a ->  println("$a 的索引为 $it") }

}