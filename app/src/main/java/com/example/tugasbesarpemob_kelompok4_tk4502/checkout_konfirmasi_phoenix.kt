package com.example.tugasbesarpemob_kelompok4_tk4502

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class checkout_konfirmasi_phoenix : AppCompatActivity() {

    private lateinit var arrowkonfirmasiphoenix : ImageView
    private lateinit var durasitextviewphoenix : TextView
    private lateinit var totalhargadurasiphoenix : TextView
    private lateinit var banyakdurasiphoenix : EditText
    private lateinit var buttonplusphoenix : Button
    private lateinit var totalhargadurasiphoenix2: TextView
    private lateinit var subtotalsemuaphoenix: TextView
    private lateinit var buttonconfirmphoenix: Button
    val hargaphoenixnet = 16000
    val feebookingphoenix = 5000
    private fun komponencokonfirmasiphoenix (){
        arrowkonfirmasiphoenix = findViewById(R.id.arrow_konfirmasiphoenix)
        durasitextviewphoenix = findViewById(R.id.durasi_checkoutlist_konfirmasiphoenix)
        totalhargadurasiphoenix = findViewById(R.id.harga_checkoutlist_konfirmasiphoenix)
        totalhargadurasiphoenix2 = findViewById(R.id.jumlahtotal_checkout_konfirmasiphoenix)
        buttonplusphoenix = findViewById(R.id.button_plus_konfirmasiphoenix)
        subtotalsemuaphoenix = findViewById(R.id.jumlahsubtotal_checkout_konfirmasiphoenix)
        buttonconfirmphoenix = findViewById(R.id.button_checkout_konfirmasiphoenix)

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_konfirmasi_phoenixnet)
        komponencokonfirmasiphoenix()
        banyakdurasiphoenix = findViewById(R.id.edittextbanyakjamphoenix)
        buttonplusphoenix.setOnClickListener {
            val banyakjamphoenixstring = banyakdurasiphoenix.text.toString()
            val banyakjamphoenix = if(banyakjamphoenixstring.isNotEmpty()) banyakjamphoenixstring.toInt() else 0

            val banyakjamdikalihargaphoenix = banyakjamphoenix * hargaphoenixnet
            val subtotalphoenix = banyakjamdikalihargaphoenix + feebookingphoenix

            totalhargadurasiphoenix.text = "Rp $banyakjamdikalihargaphoenix"
            totalhargadurasiphoenix2.text = "Rp $banyakjamdikalihargaphoenix"
            subtotalsemuaphoenix.text = "Rp. $subtotalphoenix"
        }

        arrowkonfirmasiphoenix.setOnClickListener {
            finish()
        }
        buttonconfirmphoenix.setOnClickListener {
            val intenttopembayaran = Intent(this,checkout_pembayaran::class.java)
            startActivity(intenttopembayaran)
        }
    }



}