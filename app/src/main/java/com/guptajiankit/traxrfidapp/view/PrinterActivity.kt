package com.guptajiankit.traxrfidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guptajiankit.traxrfidapp.R
import com.guptajiankit.traxrfidapp.databinding.ActivityPrinterBinding

class PrinterActivity : AppCompatActivity() {
    private var binding :ActivityPrinterBinding? = null
    var printerName :String =  ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrinterBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.scanVinToolbar?.setNavigationOnClickListener {
            onBackPressed()
        }
        printerName = intent.getStringExtra("printerName")!!
       if (printerName.isNotEmpty()){
           binding?.printerName!!.text = printerName
       }

    }
}