package com.wisdom.lsy.kotlin_bosic

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
 * 单例 和 伴生对象
 * 伴生对象相当于Java中的static静态方法  @JvmFields修饰属性 @JvmStatic修饰方法
 *  object修饰的类 是单例
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

        }
    }


}
