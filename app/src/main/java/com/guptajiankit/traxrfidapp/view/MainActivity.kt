package com.guptajiankit.traxrfidapp.view

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.annotation.RequiresApi
import com.guptajiankit.traxrfidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding :ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            binding!!.textView.breakStrategy = LineBreaker.BREAK_STRATEGY_SIMPLE;
//            binding!!.textView.hyphenationFrequency = Layout.HYPHENATION_FREQUENCY_NONE;
//        }

        binding?.adminLayout?.setOnClickListener {
            val intent  = Intent(this,Admin::class.java)
            startActivity(intent)
        }

        binding?.scanVin!!.setOnClickListener {
            val intent = Intent(this,ScanVinActivity::class.java)
            startActivity(intent)
        }
        binding?.unload!!.setOnClickListener {
            val intent = Intent(this,Unload::class.java)
            startActivity(intent)
        }

        binding?.inventory!!.setOnClickListener {
            val intent = Intent(this, Inventory::class.java)
            startActivity(intent)
        }

    }
}