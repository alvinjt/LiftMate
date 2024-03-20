package com.example.LiftMate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickListener();
    }

    public fun clickListener(){
        var imageWorkout = findViewById<ImageView>(R.id.buttonWorkouts);

        imageWorkout.setOnClickListener{
            openWorkoutPageActivity()
        }

    }

    public fun openWorkoutPageActivity(){
        startActivity(Intent(this@MainActivity, WorkoutPageActivity::class.java))
    }

}