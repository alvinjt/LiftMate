package com.example.LiftMate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.LiftMate.databinding.ActivityAccountPageBinding
import com.google.firebase.auth.FirebaseAuth


class AccountPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountPageBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccountPageBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_account_page)


        firebaseAuth = FirebaseAuth.getInstance()

        if(firebaseAuth.currentUser != null){
            firebaseAuth.currentUser?.let {
                binding.emailView.text = it.email
            }
        }
        binding.signOutBtn.setOnClickListener {
            firebaseAuth.signOut()

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

        }

    }
}