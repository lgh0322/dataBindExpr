package com.viatom.myapplication

import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat

class M(name: String,d:Int) {
    val name: ObservableField<String> = ObservableField(name)
    val name2: ObservableField<Int> = ObservableField(d)

}