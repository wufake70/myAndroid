package com.wufake.app_001.kotlin_study

fun main(){
    // 列表常用方法:
    var a = mutableListOf<Int>(1,2,3,4,2,2,2,2,7,8,9,5)
    // add
    a.add(1)
    a.add(0,22)
    a.addAll(listOf(1,2))           // 添加 新列表
    // remove()
    a.remove(22)            // 移除 全部22
    a.removeAt(0)             // 索引
    a.removeAll(listOf(1,2))        // 删除 列表中的元素
    println(a)

    // 判断元素是否存在
    println( a.contains(4))

    // sort()       排序
    a.sort()
    println(a)

    // 反转
    a.reverse()                     // 不产生新数组
    println(a)

    // indexof()        返回指定元素的第一个索引

    // 转其他集合
    var b = a.toSet()                           // 集合
    var c = a.associateWith { a.indexOf(it) }   // 字典
    println(c)

    // 遍历
    for (i in a){
        println(i)
    }
}