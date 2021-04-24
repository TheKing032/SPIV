package com.example.libferiprostori;

import java.util.Dictionary;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Building> buildings = new HashMap<String, Building>();
        HashMap<String,Classroom> classrooms = new HashMap<String, Classroom>();
        buildings.put("g3",new Building("G3","g3"));
        buildings.put("g2",new Building("G2","g2"));
        //buildings.get("g2").addFloor("g2firstfloor","g2firstfloor");
        //buildings.get("g2").addFloor("g2secondfloor","g2secondfloor"); //Tukaj sem probal da dodam nadstropje oz. ime slike iz drawable
    }
}
