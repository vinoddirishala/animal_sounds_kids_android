package com.jsrAppStudios.animalsounds.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.activities.Wallpaper;
import com.jsrAppStudios.animalsounds.models.SoundsBean;
import com.jsrAppStudios.animalsounds.utils.Constants;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    Context mContext;
    ArrayList<SoundsBean> listOfSoundsAndWallpapers;
    MediaPlayer mediaPlayer;
    int selectedTabPosition = 0;

    public DashboardAdapter(Context mContext,ArrayList<SoundsBean> beanArrayList, int tabPos) {
        this.mContext = mContext;
        this.listOfSoundsAndWallpapers = beanArrayList;
        this.selectedTabPosition = tabPos;
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dashboardAdapterView = LayoutInflater.from(mContext).inflate(R.layout.adapter_dashboard,parent,false);
        return new DashboardViewHolder(dashboardAdapterView);
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        SoundsBean soundsBean  = listOfSoundsAndWallpapers.get(position);
        holder.wallpaperTitle.setText(soundsBean.getName());
        holder.wallpaper.setImageResource(soundsBean.getWallpaper());
        holder.playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mediaPlayer != null){
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                    }
                }
                mediaPlayer = MediaPlayer.create(mContext,soundsBean.getSound());
                mediaPlayer.start();

            }
        });

        holder.wallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer !=null){
                    if (mediaPlayer.isPlaying()){
                        mediaPlayer.stop();
                    }
                    mediaPlayer.release();
                }

                Toast.makeText(mContext, "Pos "+holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
                mContext.startActivity(new Intent(mContext, Wallpaper.class)
                        .putExtra(Constants.SELECTED_WALLPAPER,holder.getAdapterPosition())
                        .putExtra(Constants.SELECTED_TAB,selectedTabPosition));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listOfSoundsAndWallpapers.size() != 0 ? listOfSoundsAndWallpapers.size() : 0;
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder{

        ImageView wallpaper,playSound;
        ImageView shareIcon,downloadIcon;
        TextView wallpaperTitle;
        LinearLayout wallpaperCard;

        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);
            wallpaperCard = itemView.findViewById(R.id.card);
            wallpaperTitle = itemView.findViewById(R.id.title);
            shareIcon = itemView.findViewById(R.id.shareSoundAndWallpaper);
            downloadIcon = itemView.findViewById(R.id.downloadSoundAndWallPaper);
            wallpaper = itemView.findViewById(R.id.wallpaperImage);
            playSound = itemView.findViewById(R.id.playSound);

        }
    }

}
