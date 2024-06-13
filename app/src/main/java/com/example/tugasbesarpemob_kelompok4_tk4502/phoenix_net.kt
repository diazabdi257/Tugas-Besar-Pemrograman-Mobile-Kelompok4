package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class phoenix_net : AppCompatActivity() {

    private lateinit var arrowphoenixnetpage: ImageView
    private lateinit var buttonorderphoenix: Button
    private fun komponenphoenixpage(){
        arrowphoenixnetpage = findViewById(R.id.arrow5)
        buttonorderphoenix = findViewById(R.id.btn_order3)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.phoenix_net)

        komponenphoenixpage()


        arrowphoenixnetpage.setOnClickListener {
            finish()
        }
        buttonorderphoenix.setOnClickListener {
            val phoenixtoconfirmpage = Intent (this, checkout_konfirmasi_phoenix::class.java)
            startActivity(phoenixtoconfirmpage)
        }
    }
}