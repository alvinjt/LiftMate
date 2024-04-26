package com.example.LiftMate

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Progress bar
        val percentageText = findViewById<TextView>(R.id.percentText)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressBtn = findViewById<Button>(R.id.testProgressBtn)
        var percent = 0
        percentageText.text = "$percent%"

        progressBtn.setOnClickListener {
            progressBar.incrementProgressBy(10)
            if (percent < 100) {
                percent += 10
            }
            percentageText.text = "$percent%"
        }

        clickListener()
    }

    fun clickListener() {
        val imageWorkout = findViewById<ImageView>(R.id.buttonWorkouts)
        val imageSettings = findViewById<ImageView>(R.id.buttonSettings)
        val imageAccount = findViewById<ImageView>(R.id.buttonAccount)
        val imageCalender = findViewById<ImageView>(R.id.buttonCalender)


        imageWorkout.setOnClickListener {
            openWorkoutPageActivity()
        }

        imageSettings.setOnClickListener {
            openSettingsPageActivity()
        }

        imageAccount.setOnClickListener {
            openAccountPageActivity()
        }

        imageCalender.setOnClickListener {
            openCalenderPageActivity()
        }

    }

    fun openWorkoutPageActivity() {
        startActivity(Intent(this@MainActivity, WorkoutPageActivity::class.java))
    }

    fun openSettingsPageActivity() {
        startActivity(Intent(this@MainActivity, SettingsPageActivity::class.java))
    }

    fun openAccountPageActivity() {
        startActivity(Intent(this@MainActivity, AccountPageActivity::class.java))
    }

    fun openCalenderPageActivity() {
        startActivity(Intent(this@MainActivity, CalenderPageActivity::class.java))
    }

}

