package com.example.mobilevibrateapp;

//Shubh Bhatnagar....

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Initialize Variables
    Button btnvibrate;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnvibrate = findViewById(R.id.btn_vibrate);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        //Perform Onclick Event
        btnvibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set vibrate time in Milli Seconds
                vibrator.vibrate(1000);
            }
        });
    }
}