package com.wisdom.lsy.kotlin_bosic

import android.util.Log
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 *  Created by hxq on 2021/1/4
 *  describe :  TODO
 */
class TestBeanAdapter(data: MutableList<TestBean>?) :
    BaseQuickAdapter<TestBean, BaseViewHolder>(R.layout.view_item,data) {
    override fun convert(helper: BaseViewHolder?, item: TestBean?) {
        helper?.setText(R.id.tv_item, "姓名：${item?.name}-性别：${item?.sex}-年龄：${item?.age} ")
    }

}