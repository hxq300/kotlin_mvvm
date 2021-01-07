package com.wisdom.lsy.kotlin_bosic.constructor

/**
 *  Created by hxq on 2021/1/7
 *  describe :  TODO 实体类构造函数
 */
open class TestEntity(var name:String, var age:Int)// 主构造函数 (这里也相当于声明变量 可通过主构造直接赋值)
{
    constructor(age:Int):this("",age) //副构造函数 （随意传入 参数 this调用主构造函数）

}