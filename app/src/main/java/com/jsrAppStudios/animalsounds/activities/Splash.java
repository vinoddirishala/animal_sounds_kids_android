package com.jsrAppStudios.animalsounds.activities;

import static com.jsrAppStudios.animalsounds.utils.Constants.SPLASH_TIMEOUT;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.jsrAppStudios.animalsounds.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       // runApp();
    }

    public void runApp(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,Dashboard.class));
            }
        },SPLASH_TIMEOUT);
    }


}