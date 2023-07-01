package com.guptajiankit.traxrfidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.guptajiankit.traxrfidapp.databinding.ActivityInventoryBinding

class Inventory : AppCompatActivity() {
    private var binding : ActivityInventoryBinding? = null
    // In your activity or fragment
    var startLayout: LinearLayout? = null
    var stopReaderLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInventoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        startLayout = binding?.readerLayout
        stopReaderLayout = binding?.stopReaderLayout
  startLayout!!.setOnClickListener {
            // Toggle visibility of stopReaderLayout
            if (stopReaderLayout!!.visibility == View.VISIBLE) {
                stopReaderLayout!!.visibility = View.GONE
            } else {
                stopReaderLayout!!.visibility = View.VISIBLE
                startLayout!!.visibility = View.GONE
            }
        }

        stopReaderLayout!!.setOnClickListener {
            // Toggle visibility of readerLayout
            if (startLayout!!.visibility == View.VISIBLE) {
                startLayout!!.visibility = View.GONE
            } else {
                startLayout!!.visibility = View.VISIBLE
                stopReaderLayout!!.visibility = View.GONE
            }
        }


        binding?.uploadToolbar!!.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}