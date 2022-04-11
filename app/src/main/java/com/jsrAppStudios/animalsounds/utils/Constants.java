package com.jsrAppStudios.animalsounds.utils;

import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.models.SoundsBean;

import java.util.ArrayList;

public class Constants {

    public static int SPLASH_TIMEOUT = 1500;


    String[] insects = {""};
    String[] domesticAnimals = {""};
    String[] waterMammals = {""};
    String[] wildAnimals = {""};



    int[] insectSounds = {};
    int[] domesticAnimalSounds = {};
    int[] waterMammalSounds = {};
    int[] wildAnimalSounds = {};


    int[] insectWallpapers = {};
    int[] domesticAnimalWallpapers = {};
    int[] waterMammalWallpapers = {};
    int[] wildAnimalWallpapers = {};


    public static ArrayList<SoundsBean> getBirdsBean(){
        ArrayList<SoundsBean> birdsArray = new ArrayList<>();
        birdsArray.add(new SoundsBean("Cockatoo",R.raw.cockatoo,R.drawable.cockatoo));
        birdsArray.add(new SoundsBean("Crow",R.raw.crow,R.drawable.crow));
        birdsArray.add(new SoundsBean("Dove",R.raw.dove,R.drawable.dove));
        birdsArray.add(new SoundsBean("Eagle",R.raw.eagle,R.drawable.eagle));
        birdsArray.add(new SoundsBean("Finch",R.raw.finch,R.drawable.finch));
        birdsArray.add(new SoundsBean("Flamingo",R.raw.flamingo,R.drawable.flamingo));
        birdsArray.add(new SoundsBean("Goose",R.raw.goose,R.drawable.goose));
        birdsArray.add(new SoundsBean("Hummingbird",R.raw.hummingbird,R.drawable.humming_bird));
        birdsArray.add(new SoundsBean("Kingfisher",R.raw.kingfisher_bird,R.drawable.kingfisher));
        birdsArray.add(new SoundsBean("Macaw",R.raw.macao,R.drawable.macaw));
        birdsArray.add(new SoundsBean("Owl",R.raw.owl,R.drawable.owl));
        birdsArray.add(new SoundsBean("Parrot",R.raw.parrot,R.drawable.parrot));
        birdsArray.add(new SoundsBean("Peacock",R.raw.peacock,R.drawable.peacock));
        birdsArray.add(new SoundsBean("Rooster",R.raw.rooster,R.drawable.rooster));
        birdsArray.add(new SoundsBean("Seagull",R.raw.seagull,R.drawable.seagul));
        birdsArray.add(new SoundsBean("Sparrow",R.raw.sparrow,R.drawable.sparrow));
        birdsArray.add(new SoundsBean("Toucan",R.raw.toucan,R.drawable.toucan));
        birdsArray.add(new SoundsBean("Turkey",R.raw.turkey,R.drawable.turkeybird));
        birdsArray.add(new SoundsBean("Woodpecker",R.raw.woodpecker,R.drawable.woodpecker));
        return birdsArray;
    }


}
