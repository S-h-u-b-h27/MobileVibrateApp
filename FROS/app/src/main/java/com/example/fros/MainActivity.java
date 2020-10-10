package com.example.fros;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASHSCREEN = 5000;

    //variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation( this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation( this,R.anim.bottom_animation);

        //Hooks
        image = findViewById(R.id.shubh);
        slogan = findViewById(R.id.textView2);


        image.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);


        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Login.class);

                Pair[]  pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(image, "logo_imageview3");
                pairs[1] = new Pair<View,String>(slogan, "logo_textview2");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());
                }
            }
        },SPLASHSCREEN);

    }
}