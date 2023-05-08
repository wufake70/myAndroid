package com.wufake.app_001.kotlin_study

fun main(){
    var a = IntArray(10) {it*2}
    // 索引取值
    println(a[9])
    // 长度
    println(a.size)
    // indices,有效索引范围
    println(a.indices)
    // get 等效 a[x]
    // set 等效 a[x] = x

    // contentToString()    打印数组 内容，底层 遍历
    println(a.contentToString())

    // reverse()    反转
    a.reverse()

    //contains() 是否包含
    println( a.contains(0))
    println( a.contains(1))

    // 在数组后加入 元素，并生出新数组
    var b = a.plus(9)
    println("b的长度:${b.size},b最后一个值:${b.last()}")

    // 遍历
    for(i in a.indices){    // i为索引值
        print("$i\t")
    }
    println()

    // for in
    for (i in a){       // i 为a中对应元素
        print("$i\t")
    }
    println()
    // for in 同时获取 下标，元素
    for ((i,it) in a.withIndex()){
        println("${i}  ${it}")
    }
    println()

    // foreach
    a.forEach { print("$it\t") } // it为 a中元素
    // foreachindexed 下标，元素
    a.forEachIndexed({i,it->
        println("${i}  ${it}")
    })
}
