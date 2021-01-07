package com.wisdom.lsy.kotlin_bosic.constructor

import com.wisdom.lsy.kotlin_bosic.constructor.TestEntity

/**
 *  Created by hxq on 2021/1/7
 *  describe :  TODO
 */
class Test : TestEntity {
    // 可以没有主构造函数 只有副构造函数 super只能调用父类的主构造函数
    constructor() : super("",1)
}