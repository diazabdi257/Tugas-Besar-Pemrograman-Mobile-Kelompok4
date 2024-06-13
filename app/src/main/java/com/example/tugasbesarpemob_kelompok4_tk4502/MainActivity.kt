package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay untuk splash screen, misalnya 3 detik
        Handler(Looper.getMainLooper()).postDelayed({
            val intent1 = Intent(this, login_choice::class.java)
            startActivity(intent1)
            finish()
        }, 3000) // 3000 milidetik = 3 detik
    }
}
