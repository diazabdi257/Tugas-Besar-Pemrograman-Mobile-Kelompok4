package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class account : AppCompatActivity() {

    private lateinit var arrowprofil : ImageView
    private lateinit var notif_profil : ImageView
    private lateinit var cart_profil : ImageView
    private lateinit var history : ImageView
    private lateinit var avatar_profile : ImageView
    private lateinit var logo_fanet1profil: ImageView
    private lateinit var fanet1_textview: TextView
    private lateinit var ubahprofil_textview: TextView
    private lateinit var bahasa_profil_textview: TextView
    private lateinit var kondisinotifprofile_Textview : TextView
    private lateinit var notifikasiprofil_Textview : TextView
    private lateinit var kondisibahasaprofil_textview: TextView
    private lateinit var etcprofil: ImageView
    private lateinit var namaakun: TextView
    private lateinit var emailakun: TextView

    private fun komponenaccountpage(){
        arrowprofil = findViewById(R.id.arrow_profil)
        notif_profil = findViewById(R.id.notif_profil)
        avatar_profile = findViewById(R.id.avatar_profile)
        logo_fanet1profil = findViewById(R.id.logo_fanet1)
        fanet1_textview = findViewById(R.id.fanet1)
        ubahprofil_textview = findViewById(R.id.ubah_profil)
        bahasa_profil_textview = findViewById(R.id.bahasa_profil)
        kondisinotifprofile_Textview = findViewById(R.id.kondisi_notif_profil)
        notifikasiprofil_Textview = findViewById(R.id.notifikasi_profil)
        kondisibahasaprofil_textview = findViewById(R.id.kondisibahasa_profil)
        etcprofil = findViewById(R.id.etcprofil)
        namaakun = findViewById(R.id.nama_profile)
        emailakun = findViewById(R.id.email_telepon)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        komponenaccountpage()

        val accounttobahasapage = Intent(this,bahasa::class.java)
        val accounttonotifpage = Intent(this,notifikasi::class.java)
        val accountpagetoeditpage = Intent(this,editprofile::class.java)
        val namaakuntampil = intent.getStringExtra("Username")

        namaakun.text = namaakuntampil
        ubahprofil_textview.setOnClickListener {
            startActivity(accountpagetoeditpage)
        }

        bahasa_profil_textview.setOnClickListener {
            startActivity(accounttobahasapage)
        }
        notifikasiprofil_Textview.setOnClickListener {
            startActivity(accounttonotifpage)
        }
        notif_profil.setOnClickListener {
            startActivity(accounttonotifpage)
        }
        arrowprofil.setOnClickListener {
            finish()
        }


        }
    }
