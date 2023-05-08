package com.wufake.app_001.kotlin_study

import org.json.JSONObject

fun main(){
    // 泛型约束,传入的类型必须是 JSONObject类 或 其子类
    fun <T: JSONObject> fromjson(a:String,b:Class<T>):T?{
        var c:T? = b.newInstance()
        return c

    }
    fromjson<JSONObject>("{}",JSONObject::class.java)


}