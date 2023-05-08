package com.wufake.app_001.kotlin_study

fun main(){
    // 扩展函数
    // 格式: 类名.新方法名()
    // 拓展函数在 main中定义，其作用域只在 main内

    // 扩展String类方法 ，lastChar() 原先没有
//    fun String.lastChar():Char = this.get(this.length-1)
    fun String.lastChar():Char  {return this.get(this.length-1)} // 同上
    var a = "hello world"
    println(a.lastChar())


}
