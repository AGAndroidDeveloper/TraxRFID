package com.guptajiankit.traxrfidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guptajiankit.traxrfidapp.R
import com.guptajiankit.traxrfidapp.adapter.PrinterRecyclerView
import com.guptajiankit.traxrfidapp.databinding.ActivityScanVinBinding
import com.guptajiankit.traxrfidapp.printer.printerList

class ScanVinActivity : AppCompatActivity() {
    private var binding : ActivityScanVinBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScanVinBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.locationToolbar?.setNavigationOnClickListener {
            onBackPressed()
        }

        val list :ArrayList<String> = printerList.returnPrinterList()
        val printerAdapter = PrinterRecyclerView(this,list)
        binding?.printerRecyclerView!!.adapter = printerAdapter

    }
}