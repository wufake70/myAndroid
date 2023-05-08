package com.wufake.app_001.kotlin_study

fun main(){
    // for、while、do-while
    println("-----------1------------")
    for (i in 1 .. 100){    // 区间迭代器 1 .. 100 [1,100]
        print(i.toString()+"\t")
        if (i==100) println()
    }
    println("-----------1.1------------")
    for (i in 1 until 10){  // until 左闭右开
        print(i.toString()+"\t")
    }

    println("\n-----------1.2------------")
    for (i in 10 downTo 1){     // downTo 反转
        print(i.toString()+' ')
    }

    println("\n-----------1.3------------")
    for (i in 1..10 step 2){    // step步长
        print(i.toString()+' ')
    }

    println("\n-----------2------------")
    var a = "0123456789"
    for (i in a){
//        print(i+" ")
        print(a[i.toString().toInt()]+" ")
    }

    println("\n-----------3------------")
    // while
    var b = a.toList()
    println(b[0])
    var c = 0
    while (b[c].toString().toInt()<=7){
        print(b[c])
        c += 1
    }

    println("\n-----------4------------")
    // do while
    c = 0
    do{
        print(b[c])
        c += 1
    } while (c <6)

    // break,continue
}