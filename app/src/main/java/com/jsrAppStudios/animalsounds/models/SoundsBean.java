package com.jsrAppStudios.animalsounds.models;

public class SoundsBean {

    String name;
    int sound;
    int wallpaper;

    public SoundsBean(String name, int sound, int wallpaper) {
        this.name = name;
        this.sound = sound;
        this.wallpaper = wallpaper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(int wallpaper) {
        this.wallpaper = wallpaper;
    }
}
