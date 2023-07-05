package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplachActivity2 extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=10000;
    Animation topAmin;
    TextView welcometxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach2);


            new Handler().postDelayed(()->{
            Intent i =new Intent(SplachActivity2.this,MainActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_TIME_OUT);

       welcometxt=findViewById(R.id.textView);
       topAmin= AnimationUtils.loadAnimation(this,R.anim.top_animation);
       welcometxt.setAnimation(topAmin);



        }



    }
