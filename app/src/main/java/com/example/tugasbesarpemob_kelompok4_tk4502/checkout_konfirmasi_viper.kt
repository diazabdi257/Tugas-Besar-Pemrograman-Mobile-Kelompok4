package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class checkout_konfirmasi_viper : AppCompatActivity() {

    private lateinit var arrowkonfirmasiviper : ImageView
    private lateinit var durasitextviewviper : TextView
    private lateinit var totalhargadurasiviper : TextView
    private lateinit var banyakdurasiviper : EditText
    private lateinit var buttonplusviper : Button
    private lateinit var totalhargadurasiviper2: TextView
    private lateinit var subtotalsemuaviper: TextView
    private lateinit var buttonconfirmviper: Button
    val hargavipernet = 17000
    val feebookingviper = 5000
    private fun komponencokonfirmasiviper (){
        arrowkonfirmasiviper = findViewById(R.id.arrow_konfirmasiviper)
        durasitextviewviper = findViewById(R.id.durasi_checkoutlist_konfirmasiviper)
        totalhargadurasiviper = findViewById(R.id.harga_checkoutlist_konfirmasiviper)
        totalhargadurasiviper2 = findViewById(R.id.jumlahtotal_checkout_konfirmasiviper)
        buttonplusviper = findViewById(R.id.button_plus_konfirmasiviper)
        subtotalsemuaviper = findViewById(R.id.jumlahsubtotal_checkout_konfirmasiviper)
        buttonconfirmviper = findViewById(R.id.button_checkout_konfirmasiviper)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_konfirmasi_vipernet)
        komponencokonfirmasiviper()
        banyakdurasiviper = findViewById(R.id.banyak_checkoutlist_konfirmasiviper)
        buttonplusviper.setOnClickListener {
            val banyakjamviperstring = banyakdurasiviper.text.toString()
            val banyakjamviper = if(banyakjamviperstring.isNotEmpty()) banyakjamviperstring.toInt() else 0

            val banyakjamdikalihargaviper = banyakjamviper * hargavipernet
            val subtotalviper = banyakjamdikalihargaviper + feebookingviper

            totalhargadurasiviper.text = "Rp $banyakjamdikalihargaviper"
            totalhargadurasiviper2.text = "Rp $banyakjamdikalihargaviper"
            subtotalsemuaviper.text = "Rp. $subtotalviper"
        }

        arrowkonfirmasiviper.setOnClickListener {
            finish()
        }
        buttonconfirmviper.setOnClickListener {
            val intenttopembayaran = Intent(this,checkout_pembayaran::class.java)
            startActivity(intenttopembayaran)
        }
    }



}