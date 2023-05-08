package com.wufake.app_001.kotlin_study

fun main(){
    // 协变,指在泛型类型中，子类型之间的继承关系。
    /*
    kotlin中泛型是不可变的，
    如：ArrayList是泛型类(不支持协变)，List(是协变的)
    若 A 是 B 的子类
    这意味着即使A是B的子类型，ArrayList<A>也不是 ArrayList<B>的子类型，
    此时 需要使用 out 关键字 使ArrayList来支持 协变
     */

    open class Animal
    open class Dog:Animal()
    open class Cat:Animal()
    fun test01(){
        var a:ArrayList<Animal> = ArrayList<Dog>()
        /* 报错
        这是因为Kotlin中的泛型是不可变的，这意味着即使Dog是Animal的子类型，
        ArrayList<Dog>也不是ArrayList<Animal>的子类型。
        如果你想让这行代码能够编译通过，可以使用 out 关键字来支持 协变：
        var a:ArrayList<out Animal> = ArrayList<Dog>()
        或者
        重新定义 ArrayList 类
        class ArrayList<out T>{
        }
         */
        // List是协变，不用 out
        var b:List<Animal> = mutableListOf<Dog>()

    }
}
// 重新定义 ArrayList 泛型类，使他支持 协变
class ArrayList<out T>{

}