package com.wufake.app_001.kotlin_study

fun  main(){
    // 逆变


    open class Animal
    open class Dog:Animal()
    open class Cat:Animal()
    fun test01(){
        // 协变
        var a:ArrayList<Animal> = ArrayList<Dog>()
        var b:List<Animal> = mutableListOf<Dog>()

        // 逆变
        val c:InArrayList<in Dog> = InArrayList<Animal>()

    }
}
// 定义一个泛型类，并使用 in关键字 来支持逆变，限定为 T或 T的父类
class InArrayList<in T>{

}