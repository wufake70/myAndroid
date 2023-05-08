package com.wufake.app_001.kotlin_study

fun main() {
    // 数组
    // 创建一个数组
    // arrayof()    必须指定元素，可以是任意类型
    var a = arrayOf(1,2,2,3,"5",'9')
    println(a[6])

    // arrayObjects()   创建数组
    // 要求 指定大小，指定类型
    // Any 表示 Object
    var b = arrayOfNulls<Any>(5)
    b[0]=1
    b[2]='2'
    b[3]="hello world"
    b[4]=null

    // 5长度且初始值为100的整型数组
    var c = IntArray(5){100}
    // 6长度初始值为 ... 的整型数组
    c = IntArray(6){it*100}

}