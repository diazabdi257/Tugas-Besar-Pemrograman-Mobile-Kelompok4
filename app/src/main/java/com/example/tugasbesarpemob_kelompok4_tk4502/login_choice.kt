package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login_choice : AppCompatActivity() {

    private lateinit var buttonloginchoice : Button
    private lateinit var buttonregisterchoice : Button

    private fun komponenchoicepage(){
        buttonloginchoice = findViewById(R.id.btn_login)
        buttonregisterchoice = findViewById(R.id.btn_signin)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choice)

        komponenchoicepage()

        val choicetologin = Intent(this,login::class.java)
        val choicetoregister = Intent(this,create_account::class.java)
        buttonloginchoice.setOnClickListener {
            startActivity(choicetologin)
        }
        buttonregisterchoice.setOnClickListener {
            startActivity(choicetoregister)
        }
    }
}