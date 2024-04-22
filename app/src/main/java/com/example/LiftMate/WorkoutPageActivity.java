package com.example.LiftMate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_page);
    }

    public void navigateToChestPage (View view){
        Intent intent = new Intent (this, ChestWorkoutActivity.class);
        startActivity(intent);
    }

    public void navigateToLegsPage (View view){
        Intent intent = new Intent (this, LegsWorkoutActivity.class);
        startActivity(intent);
    }

    public void navigateToBackPage (View view){
        Intent intent = new Intent (this, BackWorkoutActivity.class);
        startActivity(intent);
    }
    public void navigateToArmsPage (View view){
        Intent intent = new Intent (this, ArmsWorkoutActivity.class);
        startActivity(intent);
    }

    public void navigateToCorePage (View view){
        Intent intent = new Intent (this, CoreWorkoutActivity.class);
        startActivity(intent);
    }

}