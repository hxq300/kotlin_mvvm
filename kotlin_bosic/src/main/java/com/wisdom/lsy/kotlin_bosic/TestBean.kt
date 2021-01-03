package com.wisdom.lsy.kotlin_bosic

import java.io.Serializable

/**
 *  Created by hxq on 2021/1/3
 *  describe :  TODO
 */
class TestBean (
    var name:String? = null,
    var sex:String? = null,
    var age:Int? = 0,
    var isJob:Boolean? = null
) : Serializable