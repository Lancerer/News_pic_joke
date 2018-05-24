package com.example.lancer.mvp_news;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


public class SplashActivity extends AppCompatActivity {
    private ImageView ivsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ivsplash = findViewById(R.id.iv_splash);
        TranslateAnimation translateAnimation = new TranslateAnimation(-ivsplash.getWidth(),450,600,600);
        translateAnimation.setDuration(2500);
        translateAnimation.setFillAfter(true);
        AnimationSet set=new AnimationSet(true);
        set.addAnimation(translateAnimation);
        set.setInterpolator(new BounceInterpolator());
        set.setFillAfter(true);
        ivsplash.startAnimation(set);

        set.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
