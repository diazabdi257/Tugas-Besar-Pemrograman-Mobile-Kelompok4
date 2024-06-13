package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class jett_net : AppCompatActivity() {

    private lateinit var arrowjettnetpage: ImageView
    private lateinit var buttonorderjett : Button

    private fun komponenjettpage(){
        arrowjettnetpage = findViewById(R.id.arrow3)
        buttonorderjett = findViewById(R.id.btn_order)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.jett_net)

        komponenjettpage()


        arrowjettnetpage.setOnClickListener {
            finish()
        }
        buttonorderjett.setOnClickListener {
            val toconfirmjett = Intent(this,checkout_konfirmasi::class.java)
            startActivity(toconfirmjett)
        }
    }
}