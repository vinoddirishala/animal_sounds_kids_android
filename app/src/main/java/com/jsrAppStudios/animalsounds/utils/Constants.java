package com.jsrAppStudios.animalsounds.utils;

import com.jsrAppStudios.animalsounds.R;
import com.jsrAppStudios.animalsounds.models.SoundsBean;

import java.util.ArrayList;

public class Constants {

    public static int SPLASH_TIMEOUT = 1500;
    public static String SELECTED_TAB = "selTab";
    public static String SELECTED_WALLPAPER = "selWal";

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

    public static ArrayList<SoundsBean> getDomAnimalsBean(){
        ArrayList<SoundsBean> birdsArray = new ArrayList<>();
        birdsArray.add(new SoundsBean("Buffalo",R.raw.buffalo,R.drawable.buffalo));
        birdsArray.add(new SoundsBean("Bull",R.raw.bull,R.drawable.bull));
        birdsArray.add(new SoundsBean("Camel",R.raw.camel,R.drawable.camel));
        birdsArray.add(new SoundsBean("Cat",R.raw.cat,R.drawable.cat));
        birdsArray.add(new SoundsBean("Cow",R.raw.cow,R.drawable.cow));
        birdsArray.add(new SoundsBean("Dog",R.raw.dog,R.drawable.dog));
        birdsArray.add(new SoundsBean("Donkey",R.raw.donkey,R.drawable.donkey));
        birdsArray.add(new SoundsBean("Elephant",R.raw.elephant,R.drawable.elephant));
        birdsArray.add(new SoundsBean("Goat",R.raw.goat,R.drawable.goat));
        birdsArray.add(new SoundsBean("Hamster",R.raw.hamster,R.drawable.hamster));
        birdsArray.add(new SoundsBean("Horse",R.raw.horse,R.drawable.horse));
        birdsArray.add(new SoundsBean("Rabbit",R.raw.rabbit,R.drawable.rabbit));
        birdsArray.add(new SoundsBean("Sheep",R.raw.sheep,R.drawable.sheep));
        birdsArray.add(new SoundsBean("Squirrel",R.raw.squirrel,R.drawable.squirrel));

        return birdsArray;
    }

    public static ArrayList<SoundsBean> getInsectsBean(){
        ArrayList<SoundsBean> birdsArray = new ArrayList<>();
        birdsArray.add(new SoundsBean("Bee",R.raw.bee,R.drawable.bee));
        birdsArray.add(new SoundsBean("Bees Beetle",R.raw.bees_beeties,R.drawable.bees_beetie));
        birdsArray.add(new SoundsBean("Cicada",R.raw.cicada,R.drawable.cicada));
        birdsArray.add(new SoundsBean("Crickets",R.raw.crickets,R.drawable.cricket));
        birdsArray.add(new SoundsBean("Frog",R.raw.frog,R.drawable.frog));
        birdsArray.add(new SoundsBean("Grasshopper",R.raw.grasshopper,R.drawable.grasshopper));
        birdsArray.add(new SoundsBean("Katydid",R.raw.katydid,R.drawable.katydid));
        birdsArray.add(new SoundsBean("Longhorn Beetles",R.raw.longhorn_beetles,R.drawable.longhorn_beetles));
        birdsArray.add(new SoundsBean("Mosquito",R.raw.mosquito,R.drawable.mosquito));
        birdsArray.add(new SoundsBean("Scorpion",R.raw.scorpion,R.drawable.scorpion));
        birdsArray.add(new SoundsBean("Spider",R.raw.spider,R.drawable.spider));
        birdsArray.add(new SoundsBean("Wasp",R.raw.wasp,R.drawable.wasp));

        return birdsArray;
    }

    public static ArrayList<SoundsBean> getWaterMammalsBean(){
        ArrayList<SoundsBean> birdsArray = new ArrayList<>();
        birdsArray.add(new SoundsBean("Blue Footed Booby",R.raw.blue_footed_booby,R.drawable.blue_footed_booby));
        birdsArray.add(new SoundsBean("Crocodile",R.raw.crocodile,R.drawable.crocodile));
        birdsArray.add(new SoundsBean("Dolphin",R.raw.dolphin,R.drawable.dolphin));
        birdsArray.add(new SoundsBean("Hippopotamus",R.raw.hippo,R.drawable.hippopotamus));
        birdsArray.add(new SoundsBean("Marine Iguana",R.raw.marine_iguana,R.drawable.marine_iguana));
        birdsArray.add(new SoundsBean("Penguin",R.raw.penguin,R.drawable.penguin));
        birdsArray.add(new SoundsBean("Sea Otter",R.raw.sea_otter,R.drawable.sea_otter));
        birdsArray.add(new SoundsBean("Sea Lion",R.raw.sea_lion,R.drawable.sea_lion));
        birdsArray.add(new SoundsBean("Tortoise",R.raw.tortoise,R.drawable.tortise));
        birdsArray.add(new SoundsBean("Walrus",R.raw.walrus,R.drawable.walrus));
        birdsArray.add(new SoundsBean("Whale",R.raw.whale,R.drawable.whale));

        return birdsArray;
    }

    public static ArrayList<SoundsBean> getWildAnimalsBean(){
        ArrayList<SoundsBean> birdsArray = new ArrayList<>();
        birdsArray.add(new SoundsBean("Bear",R.raw.bear,R.drawable.bear));
        birdsArray.add(new SoundsBean("Cheetah",R.raw.cheetah,R.drawable.cheetah));
        birdsArray.add(new SoundsBean("Deer",R.raw.deer,R.drawable.deer));
        birdsArray.add(new SoundsBean("Elephant",R.raw.elephant,R.drawable.elephant));
        birdsArray.add(new SoundsBean("Giraffe",R.raw.giraffe,R.drawable.giraffe));
        birdsArray.add(new SoundsBean("Gorilla",R.raw.gorilla,R.drawable.gorilla));
        birdsArray.add(new SoundsBean("Hyena",R.raw.hynea,R.drawable.hynea));
        birdsArray.add(new SoundsBean("Jackal",R.raw.jackall,R.drawable.jackall));
        birdsArray.add(new SoundsBean("Jaguar",R.raw.jaguar,R.drawable.jaguar));
        birdsArray.add(new SoundsBean("Kangaroo",R.raw.kangaroo,R.drawable.kangaroo));
        birdsArray.add(new SoundsBean("Koala",R.raw.koala,R.drawable.koala));
        birdsArray.add(new SoundsBean("Lion",R.raw.lion,R.drawable.lion));
        birdsArray.add(new SoundsBean("Puma",R.raw.puma,R.drawable.puma));
        birdsArray.add(new SoundsBean("Rhinoceros",R.raw.rhinocerus,R.drawable.rhinoceros));
        birdsArray.add(new SoundsBean("Tiger",R.raw.tiger,R.drawable.tiger));
        birdsArray.add(new SoundsBean("Wolf",R.raw.wolf,R.drawable.wolf));

        return birdsArray;
    }



}
