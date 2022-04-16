package com.jsrAppStudios.animalsounds.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.adapters.DashboardAdapter;
import com.jsrAppStudios.animalsounds.models.SoundsBean;
import com.jsrAppStudios.animalsounds.utils.Constants;

import java.util.ArrayList;

public class Home extends Fragment {

    RecyclerView listOfSoundsAndWallpapers;
    GridLayoutManager linearLayoutManager;
    DashboardAdapter dashboardAdapter;
    ArrayList<SoundsBean> bean;

    public static Home getInstance(int param){
        Bundle bundle = new Bundle();
        bundle.putInt("position",param);
        Home home = new Home();
        home.setArguments(bundle);
        return home;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home,container,false);
        listOfSoundsAndWallpapers = view.findViewById(R.id.listOfSoundsAndWallpapers);
        if (getArguments().getInt("position") != 0){
            int pos = getArguments().getInt("position");
            bean = getSoundsAndWallpapers(pos);
            linearLayoutManager = new GridLayoutManager(getActivity(),2);
            listOfSoundsAndWallpapers.setLayoutManager(linearLayoutManager);
            dashboardAdapter = new DashboardAdapter(getActivity(),bean,pos);
            listOfSoundsAndWallpapers.setAdapter(dashboardAdapter);
        }

        return view;

    }


    private ArrayList<SoundsBean> getSoundsAndWallpapers(int pos){
        switch (pos){
            case 1:
                return Constants.getBirdsBean();
            case 2:
                return Constants.getDomAnimalsBean();
            case 3:
                return Constants.getInsectsBean();
            case 4:
                return Constants.getWaterMammalsBean();
            case 5:
                return Constants.getWildAnimalsBean();
        }
        return null;
    }

}
