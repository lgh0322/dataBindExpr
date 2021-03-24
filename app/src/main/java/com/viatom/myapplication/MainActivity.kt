package com.viatom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.viatom.myapplication.databinding.ActivityMainBinding
import com.viatom.myapplication.databinding.FuckBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var bb:FuckBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val b=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        b.ga=Wa(100.toString())
  

    }
}