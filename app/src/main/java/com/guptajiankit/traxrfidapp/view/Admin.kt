package com.guptajiankit.traxrfidapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.guptajiankit.traxrfidapp.R
import com.guptajiankit.traxrfidapp.databinding.ActivityAdminBinding
import com.guptajiankit.traxrfidapp.databinding.LocationLayoutBinding

class Admin : AppCompatActivity() {
    private var binding : ActivityAdminBinding? = null
    private var name  :String = ""
    private var password : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding?.root)



        binding?.homeToolbar!!.setNavigationOnClickListener {
            onBackPressed()
        }
        binding?.submitBtn?.setOnClickListener {
            createAccount()

        }


    }

    private fun createAccount() {
        name = binding?.userName!!.text.toString()
        password = binding?.userPassword!!.text.toString()
        if (name.isNotEmpty()&&password.isNotEmpty()){
            Toast.makeText(this,"name = $name and password = $password",Toast.LENGTH_SHORT).show()
val intent = Intent(this,ActivityLocation1::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"name & password cannot be empty",Toast.LENGTH_SHORT).show()

        }
    }
}