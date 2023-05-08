package com.wufake.app_001.kotlin_study

fun main(){
    // 泛型 泛型接口/类、泛型字段、泛型方法、泛型约束、泛型中out与in
    var box1:Box<Int> = Box(1)
    // Box 类就可以用于存储不同类型的数据。

    // 泛型函数
    // 泛型函数使用了类型参数 <T>，可以适用于多种不同的数据类型。
    // 这样可以提高代码的复用性和可读性，减少重复代码。
    fun <T> test(a:T,vararg b:T):Unit{  // a:T 泛型字段(即泛型参数)
        println("params a: $a")
        println("params vararg b: ${b.contentToString()}")
    }
    //可以传入 任意类型参数
    test(1, *listOf(1,2).toTypedArray())

    // 处理json类型的函数，通常他的类型是不确定，使用泛型很好解决
    // T?  表示类型 T 是可空的，也就是说它可以为 null
    fun <T> FromJson(json:String,b:Class<T>):T?{
        var a:T? = b.newInstance()
        return a
    }

}
// 定义泛型类，
class Box<T>(t:T){
    var value = t
}
