package com.example.LiftMate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.result.contract.ActivityResultContracts
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Progress bar
        val progressBar = findViewById<ProgressBar>(R.id.progressBar);

        val progressBtn = findViewById<Button>(R.id.testProgressBtn)

        progressBtn.setOnClickListener{
            progressBar.incrementProgressBy(10)
        }


        clickListener();




    }

    public fun clickListener(){
        var imageWorkout = findViewById<ImageView>(R.id.buttonWorkouts);
        var imageSettings = findViewById<ImageView>(R.id.buttonSettings);
        var imageAccount = findViewById<ImageView>(R.id.buttonAccount);
        var imageCalender = findViewById<ImageView>(R.id.buttonCalender);


        imageWorkout.setOnClickListener{
            openWorkoutPageActivity()
        }

        imageSettings.setOnClickListener {
            openSettingsPageActivity()
        }

        imageAccount.setOnClickListener{
            openAccountPageActivity()
        }

        imageCalender.setOnClickListener{
            openCalenderPageActivity()
        }

    }

    public fun openWorkoutPageActivity(){
        startActivity(Intent(this@MainActivity, WorkoutPageActivity::class.java))
    }

    public fun openSettingsPageActivity(){
        startActivity(Intent(this@MainActivity, SettingsPageActivity::class.java))
    }

    public fun openAccountPageActivity(){
        startActivity(Intent(this@MainActivity, AccountPageActivity::class.java))
    }

    public fun openCalenderPageActivity(){
        startActivity(Intent(this@MainActivity, CalenderPageActivity::class.java))
    }

}