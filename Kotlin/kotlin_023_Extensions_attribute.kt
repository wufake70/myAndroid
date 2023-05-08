package com.wufake.app_001.kotlin_study

fun main(){
    var a = "Android"
    println(a.test)

}
// 拓展属性,必须 val 关键字声明，
val String.test:String get() = this.get(length-1).toString()
// 注意: 扩展属性必须在顶层定义，也就是说它们不能嵌套在其他函数或类中