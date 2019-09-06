package com.example.dekotappication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class    MainActivity extends AppCompatActivity {


    private ViewFlipper viewFlipper;
    private Animation fadeIn, fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        fadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        viewFlipper.setInAnimation(fadeIn);
        viewFlipper.setOutAnimation(fadeOut);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
}
