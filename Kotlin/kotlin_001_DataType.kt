package com.wufake.app_001.kotlin_study

// 基本数据类型
fun main() {
    // 声明一个基本数据类型

    // 没有指定基本数据类型
    // 基本数据类型的整型默认数据类型 均为 int，若超过 int 范围，则会推断 为Long
    // val --> value
    val a = 100                 // Int
    val b = 10000000000000000   // Long
    val c = 100L                // Long

    // 指定基本数据类型
    val d:Byte = 20             // Byte
    val e:Short = 10            // Short

    val f = 9.1415926           // 默认 double
    val g = 9.894729845f        // float,只保存小数点后五位
    println("g= "+g)

    // 字符类型 chat
    val aa = 'a'                // a
    println(aa)

    // 布尔类型
    val bb:Boolean = true
    val cc = false
    println(bb.toString()+"\n"+cc.toString())

    // 字符串类型
    val name = "wufake"     // 单行字符串
    var ee = """
        多行字符串
        hello world
    """.trimIndent()
    println(ee)

    // 字符串模板表达式
    println("hello world i`m $name")
}