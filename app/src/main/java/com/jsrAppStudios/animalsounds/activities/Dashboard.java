package com.jsrAppStudios.animalsounds.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.adapters.ViewPagerAdapter;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager2 viewPager2;
    ImageView dashboardMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        dashboardMenuButton = findViewById(R.id.dashboardMenuButton);
        dashboardMenuButton.setOnClickListener(this);
        init();
    }

    private void init() {
        viewPager2 = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(viewPagerAdapter);
        new TabLayoutMediator(tabLayout,
                viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText(getResources().getString(R.string.birds));
                        break;
                    case 1:
                        tab.setText(getResources().getString(R.string.dom_animals));
                        break;
                    case 2:
                        tab.setText(getResources().getString(R.string.insects));
                        break;
                    case 3:
                        tab.setText(getResources().getString(R.string.water_mammals));
                        break;
                    case 4:
                        tab.setText(getResources().getString(R.string.wild_animals));
                        break;
                }
            }
        }
        ).attach();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.dashboardMenuButton:
                startActivity(new Intent(this,SettingsActivity.class));
                break;
        }
    }
}