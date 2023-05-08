package com.wufake.app_001.kotlin_study

fun main(){
    // 拓展泛型方法
    fun <T> MutableList<T>.test(a:Int,b:Int){
        var t = this[a]
        this[a] = this[b]
        this[b] = t
    }
    // 1,2,3,4
    var a = mutableListOf(1,2,3,4)
    a.test(3,2)
    println(a)

}
