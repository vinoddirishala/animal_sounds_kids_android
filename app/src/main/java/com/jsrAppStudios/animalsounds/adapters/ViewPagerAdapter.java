package com.jsrAppStudios.animalsounds.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.jsrAppStudios.animalsounds.fragments.Home;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return Home.getInstance(position+1);
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
