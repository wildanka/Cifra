package com.example.dan.myapplication.model;

/**
 * Created by DAN on 11/6/2017.
 */

public class MusisiPerGenre {
    private String genre;
    private String name1;
    private String name2;
    private String name3;
    private int image1;
    private int image2;
    private int image3;

    public MusisiPerGenre(String genre,String name1, String name2, String name3, int image1, int image2, int image3) {
        this.genre = genre;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }
}
