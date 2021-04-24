package com.example.libferiprostori;

import java.util.ArrayList;

public class Building {

    public Building(String name, String key){
        this.name=name;
        this.key=key;
    }
    public void addFloor(String image, String name){
        floor_images.add(image);
        floor_images.add(name);
    }
    ArrayList<String> floor_images;
    ArrayList<String> floor_names;
    String name;
    String key;
}
