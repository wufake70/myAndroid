package com.wufake.app_001.kotlin_study

fun main(){
    // Set 分为 HashSet、LinkedHashSet
    // 集合常用方法
    var a = mutableSetOf<Int>(1,2,3,4,4)
    a.add(9)
    a.remove(4)
    a.contains(9)
    // 集合不支持 a[0],
    println( a)
}