package com.viatom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.viatom.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val goods = M("55", 6)
        b.lm=goods
    }
}