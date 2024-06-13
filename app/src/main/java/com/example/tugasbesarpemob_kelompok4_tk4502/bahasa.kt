package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class bahasa : AppCompatActivity() {

    private lateinit var arrowbahasa : ImageView
    private lateinit var logofanet1bahasa: ImageView

    private fun komponenbahasapage(){
        arrowbahasa = findViewById(R.id.arrow_bahasa)
        logofanet1bahasa = findViewById(R.id.logo_fanet1bahasa)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bahasa)

        komponenbahasapage()

        val bahasapagetoaccountpage = Intent(this, account::class.java)

        arrowbahasa.setOnClickListener {
            finish()
        }
    }
}
