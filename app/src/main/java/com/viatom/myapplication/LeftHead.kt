package com.viatom.myapplication

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LeftHead : ViewModel() {
    val headIcon: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val headName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val name: ObservableField<String> = ObservableField()
    val yes=headName.value



}