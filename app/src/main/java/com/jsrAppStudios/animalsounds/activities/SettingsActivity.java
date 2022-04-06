package com.jsrAppStudios.animalsounds.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jsrAppStudios.animalsounds.R;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView goBack;
    LinearLayout rateUS,shareUS,giveFeedback,moreApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(this);
        rateUS = findViewById(R.id.rateUS);
        shareUS = findViewById(R.id.shareUS);
        giveFeedback = findViewById(R.id.feedback);
        moreApps = findViewById(R.id.moreApps);

        rateUS.setOnClickListener(this);
        shareUS.setOnClickListener(this);
        giveFeedback.setOnClickListener(this);
        moreApps.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.goBack:
                finish();
                break;
            case R.id.shareUS:
                startActivity(new Intent());
                break;
            case R.id.rateUS:

                break;
            case R.id.feedback:
                break;
            case R.id.moreApps:

                break;
        }
    }
}