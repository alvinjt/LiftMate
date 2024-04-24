package com.example.LiftMate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.LiftMate.databinding.ActivityAccountPageBinding
import com.example.LiftMate.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

class AccountPageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_account_page)


    }
}