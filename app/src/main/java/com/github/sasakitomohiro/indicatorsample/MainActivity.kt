package com.github.sasakitomohiro.indicatorsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.sasakitomohiro.indicatorsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(binding) {
            start.setOnClickListener {
                indicator.setProgressWithAnimation(100f)
            }
            reset.setOnClickListener {
                indicator.setProgressWithAnimation(0f)
            }
        }
    }
}
