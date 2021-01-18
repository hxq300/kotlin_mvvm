package com.wisdom.lsy.kotlin_bosic.livedatatest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 *  Created by hxq on 2021/1/18
 *  describe :  TODO
 */
class TestViewModel(var mKey : String) : ViewModel() {

    private val mNameEvent: MutableLiveData<String> = MutableLiveData()

    open fun getNameEvent(): MutableLiveData<String> {
        return mNameEvent
    }



    class Factory(var mKey : String) : ViewModelProvider.Factory {
        override fun <T :  ViewModel> create(modelClass: Class<T>):  T {
            return TestViewModel(mKey)
        }
    }
}