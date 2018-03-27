package com.example.dan.myapplication;

/**
 * Created by DAN on 11/4/2017.
 */

public class ExerciseMenu {
    private int image;
    private String exerciseTitle;

    public ExerciseMenu(String exerciseTitle, int image){
        this.exerciseTitle = exerciseTitle;
        this.image = image;
    }

    public String getExerciseTitle() {
        return exerciseTitle;
    }

    public int getImage() {
        return image;
    }
}
