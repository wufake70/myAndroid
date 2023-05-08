package com.wufake.app_001.kotlin_study

fun main() {
    // 参数类型
    // 默认参数
    fun test(a:Int=0){
        print(a.toString()+"\t")
    }
    // 具名参数,无默认值
    fun test01(a:Int=0,b:Int){
        print("a=$a,b=$b\n")
    }
    // f:()->Unit 是指将一个方法传入,Unit表示没有返回值
    fun test03(f:()->Unit){
        f()     // 执行该方法
    }

    // 可变数量参数 varary关键字
    fun test02(vararg more:Any){
        for (i in more){
            print(i.toString()+"\t")
        }
    }

    // 方法调用
    test()
    test(1)
    println("\n==============")
    test01(99,9)
    test01(b=9)
    // 传入 函数
    test03(f={
        test(9999)
        // 如果有返回值 方法的最后一行，可以不用return
    })
    // 括号外传入 函数参数
//    test03(){test(999)} 同上
    println("\n==============")
//    test02(1,2,3,4,5, listOf(1,2,3,4),"hello world")
//    var b = arrayOf(1,2,3,4,5,6)
//    test02(*b.toTypedArray())  // 将 一个数组中元素 拆开传入 ，使用 伸展操作符 *

    // 如果是集合 需转为数组
    var b = mutableListOf(1,2,3,4,"e")
    test02(*b.toTypedArray())  // 将 一个数组中元素 拆开传入 ，使用 伸展操作符 *

}