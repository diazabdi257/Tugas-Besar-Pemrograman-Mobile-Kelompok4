package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class checkout_berhasil : AppCompatActivity() {

    private lateinit var arrowberhasilco : ImageView
    private lateinit var buttoncountinueberhasilco: Button

    private fun kompononberhasilco (){
        arrowberhasilco = findViewById(R.id.arrow_berhasil)
        buttoncountinueberhasilco = findViewById(R.id.button_continue_berhasil)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_berhasil)
        kompononberhasilco()
        val intenttomainmenupage = Intent(this,main_menu::class.java)
        arrowberhasilco.setOnClickListener {
            startActivity(intenttomainmenupage)
        }
        buttoncountinueberhasilco.setOnClickListener {
            startActivity(intenttomainmenupage)
        }

    }
}