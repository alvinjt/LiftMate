package com.example.LiftMate

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class BackWorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_workout)
    }

    fun navigateToCalendarPage(view: View?) {
        val intent = Intent(this, CalenderPageActivity::class.java)
        startActivity(intent)
    }
}