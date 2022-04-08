package com.jsrAppStudios.animalsounds.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.models.SoundsBean;
import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {

    Context mContext;
    ArrayList<SoundsBean> listOfSoundsAndWallpapers;

    public DashboardAdapter(Context mContext,ArrayList<SoundsBean> beanArrayList) {
        this.mContext = mContext;
        this.listOfSoundsAndWallpapers = beanArrayList;
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
    }

    @Override
    public int getItemCount() {
        return listOfSoundsAndWallpapers.size() != 0 ? listOfSoundsAndWallpapers.size() : 0;
    }

    public class DashboardViewHolder extends RecyclerView.ViewHolder{

        ImageView wallpaper;
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

        }
    }

}
