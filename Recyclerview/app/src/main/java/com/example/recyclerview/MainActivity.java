package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programminglist = findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] Data = {"Soap","Washing Powder","Shampoo","Maggie","ToothPast","Pan","Pulses","Maze","Kitchen Goods","Harpic","Dishwash Bar"};
        programminglist.setAdapter(new ProgrammingAdapter(Data));

    }
}