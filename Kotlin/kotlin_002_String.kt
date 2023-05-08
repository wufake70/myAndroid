package com.wufake.app_001.kotlin_study

fun main(){
    // 字符串
    var a = "hello world"

    // 支持索引取值
    println(a[0]+"\t${a.indexOf(a[0])}")
    //字符串模板
    println("${a}")
    println("$a")

    // 字符串长度
    a = " *hello world I am Kotlin. \thello android * "
    println(a.length)
    // 是否为空
    println(a.isEmpty())
    //plus() 方法：将字符串与另一个字符串连接起来。
    println(a.plus(" hello wufake"))

    //substring() 方法：截取字符串的,左闭右开 [0,4)
    println(a.substring(0,4))

    // indexOf(char,start+1) 方法：获取子串在字符串中的位置。
    println(a.indexOf('h',a.indexOf('h')+1))
    // lastIndexOf()

    //replace() 方法：将字符串中的指定字符或子串替换为另一个字符或子串。
    println(a.replace("\t",""))

    //split() 方法：将字符串分割为子字符串，并返回一个字符串数组。
    println(a.split(' '))

    //trim() 方法：删除字符串开头和结尾的空格。
    println(a.trim().trim('*'))

    //isNullOrEmpty() 方法：检查字符串是否为 null 或为空。
    println("".isNullOrEmpty())
    //isNullOrBlank() 方法：检查字符串是否为 null 或只包含空格。
    println("".isNullOrBlank())
    //plus() 方法：将字符串与另一个字符串连接起来。

}