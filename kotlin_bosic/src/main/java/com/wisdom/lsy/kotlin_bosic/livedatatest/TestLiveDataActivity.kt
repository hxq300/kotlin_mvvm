package com.wisdom.lsy.kotlin_bosic.livedatatest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.wisdom.lsy.kotlin_bosic.R
import com.wisdom.lsy.kotlin_bosic.databinding.ActivityTestLiveDataBinding

/**
 *  Created by hxq on 2021/1/18
 *  describe :  TODO
 *  注释 ：lateinit （延迟加载）
 */
class TestLiveDataActivity : AppCompatActivity() {
    lateinit var mDataBinding: ActivityTestLiveDataBinding
    lateinit var mTestViewModel: TestViewModel
    lateinit var mNameEvent: MutableLiveData<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        mDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_test_live_data)
        mTestViewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)
        mNameEvent = mTestViewModel.getNameEvent()

        mNameEvent.observe(this, Observer {
        })
    }
}