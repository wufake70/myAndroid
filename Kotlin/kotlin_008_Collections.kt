package com.wufake.app_001.kotlin_study

fun main(){
    // 集合
    /*
    list    有序集合
    set     无重复集合
    Map     字典
     */

    // 创建 可变列表
    var a = mutableListOf<Any>(1,'2',"hello world")
    println(a.size)
    // 添加元素
    a.add(886)
    println("添加'886'后: $a")

    //不可变列表,必须初始化赋值，后面无法修改
    var b = listOf<Any>(1,3,4)
    println(b)

    // 可变集合 set
    var e = mutableSetOf<Int>(1,2,2)
    e.add(4)
    println("可变集合: $e")

    // 不可变集合
    var f = setOf<Int>(1,1,3,4)
    println("不可变集合: $f")

    // 可变字典
    // 需要通过 Pair() 函数初始化赋值
    var c = mutableMapOf<Int,Int>(Pair(1,1), Pair(2,2))
    c.put(4,4)
    c[3] = 3
    println("可变字典: $c")

    // 不可变字典
    var d = mapOf<Int,Int>(Pair(1,1), Pair(2,2))
    println("不可变字典: $d")

}