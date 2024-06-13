package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class checkout_pembayaran : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var textViewselected: TextView
    private lateinit var buttonconfirmpembayaran: Button
    private lateinit var namapembayar : EditText
    private lateinit var arrowpembayaran : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_pembayaran)
        radioGroup = findViewById(R.id.radioGroup)
        textViewselected = findViewById(R.id.metode_checkout_pembayaran)
        buttonconfirmpembayaran = findViewById(R.id.button_checkout_pembayaran)
        namapembayar = findViewById(R.id.edit_nama_pembayaran)
        arrowpembayaran = findViewById(R.id.arrow_pembayaran)

        arrowpembayaran.setOnClickListener {
            finish()
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton = findViewById<RadioButton>(checkedId)
            val selectedText = selectedRadioButton.text.toString()
            textViewselected.text = "Selected: $selectedText"
        }
        buttonconfirmpembayaran.setOnClickListener {
            val radiobuttonpilih = radioGroup.checkedRadioButtonId
            if (radiobuttonpilih != -1) {
                val intenttocheckoutberhasil = Intent(this,checkout_berhasil::class.java)
                startActivity(intenttocheckoutberhasil)
            }
            else {
                val intenttocheckoutgagal = Intent(this,checkout_gagal::class.java)
                startActivity(intenttocheckoutgagal)
            }
        }


    }
}