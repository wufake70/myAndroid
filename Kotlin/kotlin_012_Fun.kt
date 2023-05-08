package com.wufake.app_001.kotlin_study

fun main(){
    // 调用方法
    // 普通类调用
    var a = Person().max(8,9)  // 通过该对象对用
    println(a)

    // 静态类调用,不需要构建 实例对象，通过 类名.函数名 直接调用
    var b = People.max(100,400)
    println(b)

    // 半生类调用
    Person.test()


}

// class 创建普通类，
class Person{

    // 方法和lambda 表达式
    // 声明格式:
    fun max(a:Int,b:Int): Int {     // 返回类型 Int,可以没有返回值
        return if (a>b) a else b
    }

    //半生类,由于Kotlin没有static关键字，
    //伴生对象是为弥补Kotlin没有static修饰的静态成员的不足
    companion object{
        fun test(){
            println("我是半生类里的 方法可以通过 类名.函数名 调用")
        }
    }
}

// object 创建静态类,用于 实现util工具类
object People{
    // 方法和lambda 表达式
    // 声明格式:
    fun max(a:Int,b:Int): Int {     // 返回类型 Int,可以没有返回值
        return if (a>b) a else b
    }

}
