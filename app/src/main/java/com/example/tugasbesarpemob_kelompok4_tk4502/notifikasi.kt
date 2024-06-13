package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class notifikasi : AppCompatActivity() {

    private lateinit var arrownotif: ImageView
    private lateinit var logofanet1notif: ImageView

    private fun komponennotifpage(){
        arrownotif = findViewById(R.id.arrow_notif)
        logofanet1notif = findViewById(R.id.logo_fanet1notifikasi)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notifikasi)

        komponennotifpage()

        val notifpagetoaccountpage = Intent(this,account::class.java)

        arrownotif.setOnClickListener {
            finish()
        }
    }
}