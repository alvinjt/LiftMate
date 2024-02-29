package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Sets the title
        getSupportActionBar().setTitle("LiftMate")

        //Opens login activity
        Button buttonLogin = findViewById(R.id.button_Login)
        buttonLogin.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View v){

                Intent intenet = new Intent(MainActivity.this, loginActivity.class)
                startActivity(intent)
            }
        });
    }
}