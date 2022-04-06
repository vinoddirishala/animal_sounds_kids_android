package com.jsrAppStudios.animalsounds;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home extends Fragment {

    public static Home getInstance(int param){
        Bundle bundle = new Bundle();
        bundle.putInt("position",param);
        Home home = new Home();
        home.setArguments(bundle);
        return home;
    }

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home,container,false);
        textView = view.findViewById(R.id.TE);
        if (getArguments() != null){
            Log.d("Position",getArguments().getInt("position")+" ");
            textView.setText("abc "+getArguments().getInt("position"));
        }
        return view;

    }
}
