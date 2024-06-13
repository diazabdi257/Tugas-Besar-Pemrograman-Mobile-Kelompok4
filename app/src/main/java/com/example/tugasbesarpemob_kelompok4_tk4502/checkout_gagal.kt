package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class checkout_gagal : AppCompatActivity() {

    private lateinit var arrowgagal : ImageView
    private lateinit var buttoncontinuegagalco : Button

    private fun komponengagalco (){
        arrowgagal = findViewById(R.id.arrow_gagal)
        buttoncontinuegagalco = findViewById(R.id.button_continue_gagaal)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_gagal)
        komponengagalco()
        arrowgagal.setOnClickListener {
            finish()
        }
        buttoncontinuegagalco.setOnClickListener {
            val intentomainmenu = Intent (this,main_menu::class.java)
            startActivity(intentomainmenu)
        }
    }
}