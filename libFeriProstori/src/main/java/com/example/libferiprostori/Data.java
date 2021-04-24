package com.example.libferiprostori;

import java.util.ArrayList;
import java.util.HashMap;

public class Data {

    private static Data data;

    private HashMap<String,Building> buildings;
    private HashMap<String,Classroom> classrooms;
    private ArrayList<Professor> professors;

    private Data(){
       this.buildings=new HashMap<String, Building>();
       this.classrooms=new HashMap<String, Classroom>();
       this.professors = new ArrayList<Professor>();
    }

    private static Data getData(){
        if(data==null){
            initData();
        }
        return data;
    }

    public static Building getBuilding(String key){
        return getData().buildings.get(key);
    }
    public static Classroom getClassroom(String key){
        return getData().classrooms.get(key);
    }

    private static void initData(){
       data = new Data();
        // Buildings
       data.buildings.put("g3", new Building("G3", "g3"));
       data.buildings.put("g2", new Building("G2", "g2"));
       //getBuilding("g2").addFloor("g2firstfloor","g2firstfloor"); // Tudi tukaj sem probal da dodam nadstropja ker v aktivitiju kličem data class
       //getBuilding("g2").addFloor("g2secondfloor","g2secondfloor");
        // Classrooms
        data.classrooms.put("g2-neki",new Classroom("G2 Neki kabinet", "g2-neki", "g2",1));
        data.classrooms.put("g3-neki",new Classroom("G3 Neki kabinet", "g3-neki", "g3",1));
        // Professors
        data.professors.add(new Professor("Peterin","g2-neki"));
        data.professors.add(new Professor("Peterin2","g3-neki"));
    }
}