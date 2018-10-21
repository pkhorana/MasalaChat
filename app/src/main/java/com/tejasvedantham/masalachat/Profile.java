package com.tejasvedantham.masalachat;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;


import java.util.ArrayList;

public class Profile extends Activity {

    private String name;
    private Location location;
    private int age;
    private Gender gender;
    private String introduction;
    public static boolean[][] resumeArray;



    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Profile(String name, Location location, int age, Gender gender, String introduction, boolean[][] resumeArray) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.gender = gender;
        this.introduction = introduction;
        this.resumeArray = new boolean[10][];
//        this.instantiateArrayList();
    }


//    public void instantiateArrayList() {
//        for (int i = 0; i < this.resumeArray.length; i++) {
//            resumeArray[i] = new ArrayList<Boolean>();
//        }
//    }


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

    public void setResumeArray(int index, boolean[] array) {
        this.resumeArray[index] = array;
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

    public boolean[][] getResumeArray() {
        return resumeArray;
    }


}
