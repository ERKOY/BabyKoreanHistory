package org.minifleet.babykoreanhistory2_minifleet.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = MutableLiveData<Int>()
    var ttt = MutableLiveData<String>()

    init {
        count.value = 0
        ttt.value = ""
    }

    fun increase() {
        count.value = count.value?.plus(1)
    }

    fun decrease() {
        count.value = count.value?.minus(1)
    }

    fun setName() {
        ttt.value = "samuel"
    }

    fun setName2() {
        ttt.value = "ki"
    }

}