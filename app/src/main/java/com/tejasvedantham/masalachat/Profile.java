package com.tejasvedantham.masalachat;

import android.location.Location;

import java.util.ArrayList;

public class Profile {

    private String name;
    private Location location;
    private int age;
    private Gender gender;
    private String introduction;
    private ArrayList[] resumeArray;

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Profile (String name, Location location, int age, Gender gender, String introduction, ArrayList[] resumeArray) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.gender = gender;
        this.introduction = introduction;
        this.resumeArray = new ArrayList[10];
        this.instantiateArrayList();
    }

    public void instantiateArrayList() {
        for (int i = 0; i < this.resumeArray.length; i++) {
            resumeArray[i] = new ArrayList<Boolean>();
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Location getLocation() {
        return location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getName() {
        return name;
    }
}
