package com.example.libferiprostori;

import java.util.ArrayList;

public class Building {

    public String name;
    public String key;
    public ArrayList<String> floor_images;
    public ArrayList<String> floor_names;

    public Building(String name, String key){
        this.name=name;
        this.key=key;
    }
    public void addFloor(String image, String name){
        floor_images.add(image);
        floor_names.add(name);
    }
}
