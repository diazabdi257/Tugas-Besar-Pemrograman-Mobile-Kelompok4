package com.example.tugasbesarpemob_kelompok4_tk4502

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.tugasbesarpemob_kelompok4_tk4502.databinding.CreateAccountBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.w3c.dom.Text
import android.widget.Toast

class create_account : AppCompatActivity() {

    private lateinit var binding : CreateAccountBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private lateinit var usersRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Inisialisasi View Binding
        binding = CreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //inisialisasi FirebaseAuth
        auth  = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        usersRef = database.getReference("users")

        var arrowregister : ImageView = findViewById(R.id.arrowregister)
        var masuksiniregister : TextView = findViewById(R.id.masuk_sini)
        arrowregister.setOnClickListener {
            finish()
        }
        masuksiniregister.setOnClickListener {
            val tologinpage = Intent (this,login::class.java)
            startActivity(tologinpage)
        }

        binding.buttonregister2.setOnClickListener {
            val username = binding.uname2.text.toString()
            val email = binding.email.text.toString()
            val password = binding.pw2.text.toString()

            if(username.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Plis isi dulu bang", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            registerUser(username, email, password)
        }
    }

    private fun registerUser (username: String, email: String, password: String ) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful){
                    Toast.makeText(baseContext, "Akun Anda Telah Berhasil Didaftarkan", Toast.LENGTH_SHORT).show()
                    val user = auth.currentUser
                    val userId = user?.uid
                    val userMap = mapOf(
                        "username" to username,
                        "email" to email
                    )
                    val registertologinpage = Intent(this, login::class.java)
                    startActivity(registertologinpage)
                    finish()
                    if (userId !=null){
                        usersRef.child(userId).setValue(userMap)
                            .addOnCompleteListener {
                            }
                    }

                }else {
                    Toast.makeText(baseContext, "Pendaftaran Gagal : ${task. exception?.message}", Toast.LENGTH_SHORT).show()
                }

            }
    }
}