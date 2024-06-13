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
import com.google.firebase.auth.FirebaseAuth

class main_menu : AppCompatActivity() {

    private lateinit var logoutmainmenu: ImageView
    private lateinit var kotakprofilemainmenu: ImageView
    private lateinit var buletanbookmark: ImageView
    private lateinit var buletansetting: ImageView
    private lateinit var buletanakun:ImageView
    private lateinit var searchbarmainmenuedittext: EditText
    private lateinit var kotakjettnetmainmenu: ImageView
    private lateinit var kotakvipernetmainmenu: ImageView
    private lateinit var kotakphoenixnetmainmenu: ImageView
    private lateinit var namadisplaymainmenu: TextView

    private fun komponenmainmenupage(){
        logoutmainmenu = findViewById(R.id.logout)
        kotakprofilemainmenu =findViewById(R.id.kotakprofilemainmenu)
        buletanbookmark = findViewById(R.id.buletan_bookmark)
        buletansetting = findViewById(R.id.buletan_setting)
        buletanakun = findViewById(R.id.buletan_akun)
        searchbarmainmenuedittext = findViewById(R.id.search)
        kotakjettnetmainmenu = findViewById(R.id.box_warnet1)
        kotakvipernetmainmenu = findViewById(R.id.box_warnet2)
        kotakphoenixnetmainmenu = findViewById(R.id.box_warnet3)
        namadisplaymainmenu = findViewById(R.id.nama)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menumain)

        komponenmainmenupage()
        val usernamedisplay = intent.getStringExtra("Username")
        val mainmenutojettnet = Intent(this,jett_net::class.java)
        val mainmenutovipernet = Intent(this, viper_net::class.java)
        val mainmenutophoenixnet = Intent(this, phoenix_net::class.java)
        val mainmenutobookmark = Intent(this, bookmark::class.java)

        val mainmenutonotifikasi = Intent(this,notifikasi::class.java)
        val mainmenutologinchoice = Intent (this,login_choice::class.java)
        namadisplaymainmenu.text = usernamedisplay
        kotakjettnetmainmenu.setOnClickListener {
            startActivity(mainmenutojettnet)
        }
        kotakvipernetmainmenu.setOnClickListener {
            startActivity(mainmenutovipernet)
        }
        kotakphoenixnetmainmenu.setOnClickListener {
            startActivity(mainmenutophoenixnet)
        }
        buletanbookmark.setOnClickListener {
            startActivity(mainmenutobookmark)
        }
        kotakprofilemainmenu.setOnClickListener {
            val intentToAccount = Intent(this, account::class.java)
            intentToAccount.putExtra("Username", usernamedisplay)
            startActivity(intentToAccount)
        }
        buletanakun.setOnClickListener {
            val intentToAccount = Intent(this, account::class.java)
            intentToAccount.putExtra("Username", usernamedisplay)
            startActivity(intentToAccount)
        }
        buletansetting.setOnClickListener {
            startActivity(mainmenutonotifikasi)
        }
        logoutmainmenu.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(mainmenutologinchoice)
        }



    }
}