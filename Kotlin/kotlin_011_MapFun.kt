package com.wufake.app_001.kotlin_study

fun main() {
    // 字典常用方法
    var a = mutableMapOf<Any,Any>(Pair(1,1), Pair('a',"a"),Pair("hello","world"))

    println(a.get('a'))
    a.put(999,999)
    println(a)

    // 是否包含 指定键名 key
    println(a.containsKey(1))
    // 是否包含 指定键值 value
    println(a.containsValue("world"))

    // keys 返回 所有键名的只读集合
    var b = a.keys
    println(b)
    // values 返回 所有键值的只读集合
    var c = a.values
    println(c)
    // entries  返回所有的键值对
    var d = a.entries
    println(d)  // [1=1, a=a, hello=world, 999=999]
    // 返回键值对序列
    var f = mutableListOf<Any>()
    var e = a.forEach{f.add(it.toPair())}
    println(f)

    // 遍历
    for (i in a){
        println(i.toPair())
    }


}