package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class checkout_konfirmasi : AppCompatActivity() {

    private lateinit var arrowkonfirmasijett : ImageView
    private lateinit var durasitextviewjett : TextView
    private lateinit var totalhargadurasijett : TextView
    private lateinit var banyakdurasijett : EditText
    private lateinit var buttonplusjett : Button
    private lateinit var totalhargadurasijett2: TextView
    private lateinit var subtotalsemuajett: TextView
    private lateinit var buttonconfirmjett: Button
    val hargajetnet = 15000
    val feebooking = 5000
    private fun komponencokonfirmasijett (){
        arrowkonfirmasijett = findViewById(R.id.arrow_konfirmasi)
        durasitextviewjett = findViewById(R.id.durasi_checkoutlist_konfirmasi)
        totalhargadurasijett = findViewById(R.id.harga_checkoutlist_konfirmasi)
        totalhargadurasijett2 = findViewById(R.id.jumlahtotal_checkout_konfirmasi)
        buttonplusjett = findViewById(R.id.button_plus_konfirmasi)
        subtotalsemuajett = findViewById(R.id.jumlahsubtotal_checkout_konfirmasi)
        buttonconfirmjett = findViewById(R.id.button_checkout_konfirmasi)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_konfirmasi)
        komponencokonfirmasijett()
        banyakdurasijett = findViewById(R.id.banyak_checkoutlist_konfirmasi)
        buttonplusjett.setOnClickListener {
            val banyakjamjettstring = banyakdurasijett.text.toString()
            val banyakjamjett = if(banyakjamjettstring.isNotEmpty()) banyakjamjettstring.toInt() else 0

            val banyakjamdikalihargajett = banyakjamjett * hargajetnet
            val subtotaljett = banyakjamdikalihargajett + feebooking
            totalhargadurasijett.text = "Rp $banyakjamdikalihargajett"
            totalhargadurasijett2.text = "Rp $banyakjamdikalihargajett"
            subtotalsemuajett.text = "Rp. $subtotaljett"
        }

        arrowkonfirmasijett.setOnClickListener {
            finish()
        }
        buttonconfirmjett.setOnClickListener {
            val intenttopembayaran = Intent(this,checkout_pembayaran::class.java)
            startActivity(intenttopembayaran)
        }
    }



}