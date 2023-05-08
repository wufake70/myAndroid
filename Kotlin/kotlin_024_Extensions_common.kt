package com.wufake.app_001.kotlin_study

fun main(){
    // kotlin中常用内置扩展函数,let
    // null是一个字面值，它表示一个没有任何值的引用。
    // 您可以将null赋值给可空类型的变量，但不能赋值给非空类型的变量。
    println("-----------1,let-----------")
    var a: String? = null
    a = "jdfalk"
    test(a)
    println("-----------2,run-----------")
    test1("999")
    println("-----------3,apply-----------")
    test2()
}

// let扩展函数,
// String? 表示 可以接收 String类型或 可空类型 null
fun test(a:String?){
    // ?. 安全操作符，a 不为null时才会执行调用，否则返回null
    a?.let {
        var b = "android"
        println(b+"\t"+a)
    }
//    println(b) 无法访问 let作用域中 b
}

// run方法内，可以直接访问实例共有属性和方法,
// 有返回值，默认 最后一行(可不写 return)
fun test1(a:String){
    a.run{
        println(a === this)
        println(a.toString())
    }
}

// apply方法,同run，只是返回值 为 调用对象本身
fun test2(){
    var a = mutableListOf(1,"")
    var b = a.apply {
        this.add("helloworld")
    }
    // 判断 a、b 是否保存同一个对象
    println("a==b: ${a === b}")
}
