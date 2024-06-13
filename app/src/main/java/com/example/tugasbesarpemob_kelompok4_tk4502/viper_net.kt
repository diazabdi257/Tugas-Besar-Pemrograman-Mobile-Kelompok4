package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class viper_net : AppCompatActivity() {

    private lateinit var arrowvipernetpage: ImageView
    private lateinit var buttonorderviper: Button

    private fun komponenviperpage(){
        arrowvipernetpage = findViewById(R.id.arrow4)
        buttonorderviper = findViewById(R.id.btn_order2)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.viper_net)

        komponenviperpage()


        arrowvipernetpage.setOnClickListener {
            finish()
        }
        buttonorderviper.setOnClickListener {
            val toconfirmviperpage = Intent(this, checkout_konfirmasi_viper::class.java)
            startActivity(toconfirmviperpage)
        }
    }
}