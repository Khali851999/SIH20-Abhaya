package com.akshat.abhayasih20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation bounce_anim;
    ImageView  logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView img1, img2;
        Button btn1, btn2;

        logo = findViewById(R.id.logo);

        bounce_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce_anim);
        logo.startAnimation(bounce_anim);
        logo.setVisibility(View.VISIBLE);

        bounce_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, HomeScreenActivity.class));
                        finish();
                    }
                }, 3000);
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
