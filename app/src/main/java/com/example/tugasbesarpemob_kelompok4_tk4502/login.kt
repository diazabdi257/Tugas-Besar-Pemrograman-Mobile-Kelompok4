package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasbesarpemob_kelompok4_tk4502.databinding.LoginBinding
import com.google.firebase.auth.FirebaseAuth
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class login : AppCompatActivity() {

    private lateinit var binding: LoginBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private lateinit var usersRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        usersRef = database.getReference("users")

        var arrowlogin: ImageView = findViewById(R.id.arrow)
        var buatakundisini : TextView = findViewById(R.id.buat_akun_disini)
        arrowlogin.setOnClickListener {
            finish()
        }
        buatakundisini.setOnClickListener {
            val toregisterpage = Intent(this,create_account::class.java)
            startActivity(toregisterpage)
        }

        binding.btnMasuklogin.setOnClickListener {
            val email = binding.email2.text.toString()
            val password = binding.pw.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Tolong isi dulu bang", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            loginUser(email, password)
        }
    }

    private fun loginUser(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(baseContext, "Login berhasil COY", Toast.LENGTH_SHORT).show()
                    val user = auth.currentUser
                    val userId = user?.uid
                    userId?.let {
                        usersRef.child(it).addListenerForSingleValueEvent(object : ValueEventListener {
                            override fun onDataChange(snapshot: DataSnapshot) {
                                val username = snapshot.child("username").getValue(String::class.java) ?: "Default Username"
                                Log.d("LoginActivity", "Username retrieved: $username")
                                loginpagetomainmenu(username)
                            }

                            override fun onCancelled(error: DatabaseError) {
                                Toast.makeText(baseContext, "Gagal mengambil data pengguna", Toast.LENGTH_SHORT).show()
                                Log.e("LoginActivity", "Database error: ${error.message}")
                            }
                        })
                    }
                } else {
                    Toast.makeText(baseContext, "LOGIN GAGAL NGAB: Email atau Password ga cocok </3 ", Toast.LENGTH_SHORT).show()
                    Log.e("LoginActivity", "Login failed: ${task.exception?.message}")
                }
            }
    }

    private fun loginpagetomainmenu(usernamedisplay: String) {
        val Intentlogintomainmenu = Intent(this, main_menu::class.java).apply {
            putExtra("Username", usernamedisplay)
        }
        startActivity(Intentlogintomainmenu)
        finish()
    }
}
