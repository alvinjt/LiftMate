package com.example.LiftMate

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class AccountPageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_page)

        val userEmailInfoPlacehold = findViewById<TextView>(R.id.emailView)

        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val userEmail = user.email
            userEmailInfoPlacehold.text = userEmail
        } else {
            // No user is signed in
        }
    }
}