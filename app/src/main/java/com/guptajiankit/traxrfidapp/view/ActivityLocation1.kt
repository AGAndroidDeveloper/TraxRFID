package com.guptajiankit.traxrfidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guptajiankit.traxrfidapp.R
import com.guptajiankit.traxrfidapp.databinding.ActivityLocation1Binding

class ActivityLocation1 : AppCompatActivity() {
    private var binding :ActivityLocation1Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocation1Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.locationToolbar!!.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}