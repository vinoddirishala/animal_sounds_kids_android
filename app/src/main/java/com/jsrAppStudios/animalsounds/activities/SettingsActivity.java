package com.jsrAppStudios.animalsounds.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.jsrAppStudios.animalsounds.BuildConfig;
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
                shareApp();
                break;
            case R.id.rateUS:
                rateApp();
                break;
            case R.id.feedback:
                composeEmail("jsrappstudios@gmail.com\n","Feedback for Animal Tones & Wallpapers App");
                break;
            case R.id.moreApps:
                 moreApp();
                break;
        }
    }

    public void composeEmail(String email, String subject) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Feedback for Animal Tones & Wallpapers App \n\n\n");
        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void rateApp(){
        try{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+getPackageName())));
        }
        catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+getPackageName())));
        }
    }

    public void shareApp(){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,
                "Hey check out my app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void moreApp(){
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:7446766861106650979")));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=7446766861106650979")));
        }
    }
}