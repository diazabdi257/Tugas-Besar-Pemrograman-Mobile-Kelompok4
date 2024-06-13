package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bookmark : AppCompatActivity() {

    private lateinit var arrowbookmark : ImageView
    private lateinit var cartbookmark : ImageView
    private lateinit var logofanetbookmark : ImageView
    private lateinit var searchbookmark_edittext : EditText
    private lateinit var kotakbookmark1 : ImageView
    private lateinit var kotakbookmark2 : ImageView
    private lateinit var kotakbookmark3 : ImageView
    private lateinit var iconwarnetbookmark1 : ImageView
    private lateinit var iconwarnetbookmark2 : ImageView
    private lateinit var iconwarnetbookmark3 : ImageView
    private lateinit var namawarnetbookmark1 : TextView
    private lateinit var namawarnetbookmark2 : TextView
    private lateinit var namawarnetbookmark3 : TextView

    private fun komponenbookmarkpage(){
        arrowbookmark = findViewById(R.id.arrow)
        logofanetbookmark = findViewById(R.id.logo_book)
        searchbookmark_edittext = findViewById(R.id.search3)
        kotakbookmark1 = findViewById(R.id.kotak_bookmark)
        kotakbookmark2 = findViewById(R.id.kotak_bookmark2)
        kotakbookmark3 = findViewById(R.id.kotak_bookmark3)
        iconwarnetbookmark1 = findViewById(R.id.icon_warnet)
        iconwarnetbookmark2 = findViewById(R.id.icon_warnet2)
        iconwarnetbookmark3 = findViewById(R.id.icon_warnet3)
        namawarnetbookmark1 = findViewById(R.id.nama_warnet_book)
        namawarnetbookmark2 = findViewById(R.id.nama_warnet_book2)
        namawarnetbookmark3 = findViewById(R.id.nama_warnet_book3)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.bookmark)

        komponenbookmarkpage()

        val bookmarkpagetojettnetpage = Intent(this,jett_net::class.java)
        val bookmarkpagetovipernetpage = Intent(this,viper_net::class.java)
        val bookmarkpagetophoenixnetpage = Intent(this,phoenix_net::class.java)

        kotakbookmark1.setOnClickListener {
            startActivity(bookmarkpagetojettnetpage)
        }
        kotakbookmark2.setOnClickListener {
            startActivity(bookmarkpagetovipernetpage)
        }
        kotakbookmark3.setOnClickListener {
            startActivity(bookmarkpagetophoenixnetpage)
        }
        arrowbookmark.setOnClickListener {
            finish()
        }
    }
}