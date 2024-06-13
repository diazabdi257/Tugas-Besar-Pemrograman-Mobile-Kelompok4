package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Nickname
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class editprofile : AppCompatActivity() {

    private lateinit var arrowedit : ImageView
    private lateinit var avataredit : ImageView
    private lateinit var namaedit_edittext : EditText
    private lateinit var nicknameedit_edittext: EditText
    private lateinit var emailedit_edittext: EditText
    private lateinit var passwordedit_edittext: EditText
    private lateinit var passwordlagiedit_edittext: EditText
    private lateinit var nomortelp: EditText
    private lateinit var kelaminedit: EditText
    private lateinit var alamatedit: EditText
    private lateinit var submitedit: Button

    private fun komponeneditpage(){
        arrowedit = findViewById(R.id.arrow_edit)
        avataredit = findViewById(R.id.avatar_edit)
        namaedit_edittext = findViewById(R.id.edit_nama)
        nicknameedit_edittext = findViewById(R.id.edit_nickname)
        emailedit_edittext = findViewById(R.id.edit_email)
        passwordedit_edittext = findViewById(R.id.edit_password)
        passwordlagiedit_edittext = findViewById(R.id.edit_tulispass)
        nomortelp = findViewById(R.id.edit_nomor)
        kelaminedit = findViewById(R.id.edit_kelamin)
        alamatedit = findViewById(R.id.edit_alamat)
        submitedit = findViewById(R.id.submit_edit)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile)

        komponeneditpage()

        val nama = namaedit_edittext.text.toString()
        val nickname = nicknameedit_edittext.text.toString()
        val email = emailedit_edittext.text.toString()
        val password = passwordedit_edittext.text.toString()
        val passwordkonfirm2 = passwordlagiedit_edittext.text.toString()
        val jeniskelamin = kelaminedit.text.toString()
        val alamat = alamatedit.text.toString()

        val editpagetoaccountpage = Intent(this,account::class.java)
        submitedit.setOnClickListener {
            startActivity(editpagetoaccountpage)
        }
        arrowedit.setOnClickListener {
            finish()
        }


    }
}