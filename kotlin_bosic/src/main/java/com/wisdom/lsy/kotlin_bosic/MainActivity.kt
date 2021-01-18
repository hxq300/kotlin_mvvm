package com.wisdom.lsy.kotlin_bosic

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.wisdom.lsy.kotlin_bosic.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

/**
 * TODO 笔记：
 * 循环语句 until 到...为止 step相当于i++的效果
 * downTo 降序 downTo 0 表示到0为止
 */
@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    var mTestBean: TestBean? = null
    var mDataBinding: ActivityMainBinding? = null
    var mDataList: MutableList<TestBean>? = null
    var mTestBeanAdapter: TestBeanAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        btn.setOnClickListener(this)
        btn2.setOnClickListener(this)

        mTestBean = TestBean("避尘大王", "妖", 500, true)
        mDataBinding?.testBean = mTestBean

        mDataList = mutableListOf<TestBean>();
        mTestBeanAdapter = TestBeanAdapter(mDataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = mTestBeanAdapter

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn -> {
                // 填充适配器
                for (i in 0 until 5) {
                    mDataList!!.add(TestBean("避寒大王", "妖", 500, true))
                    mDataList!!.add(TestBean("避尘大王", "妖", 500, true))
                    mDataList!!.add(TestBean("避暑大王", "妖", 500, true))
                }
                mTestBeanAdapter?.notifyDataSetChanged()
            }
            R.id.btn2 -> {
                for (i in 0..10)
                    println(i)

                for (i in 10 downTo 0)
                    println(i)

                for (i in 0 until 10 step 3)
                    println(i)
            }

        }
    }


}
