package com.guptajiankit.traxrfidapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guptajiankit.traxrfidapp.R
import com.guptajiankit.traxrfidapp.databinding.ActivityMainBinding
import com.guptajiankit.traxrfidapp.view.PrinterActivity

class PrinterRecyclerView(private val context : Context,private val list:ArrayList<String>) :
      RecyclerView.Adapter<PrinterRecyclerView.printerViewHolder>() {




    class printerViewHolder(view: View)  :RecyclerView.ViewHolder(view){
        val printerTextView : TextView = view.findViewById(R.id.printerName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): printerViewHolder {
            val inflater = LayoutInflater.from(context)
            val view = inflater.inflate(R.layout.printer_format, parent, false)
            return printerViewHolder(view)
        }

      override fun getItemCount(): Int {
      return   list.size
      }

      override fun onBindViewHolder(holder: printerViewHolder, position: Int) {
          val data = list[position]
         holder.printerTextView.text = data

          holder.itemView.setOnClickListener {
              val intent = Intent(context,PrinterActivity::class.java)
              intent.putExtra(PRINTERNAME,data)
              context.startActivity(intent)
          }

      }
    companion object{
        const val PRINTERNAME = "printerName"
    }
  }







