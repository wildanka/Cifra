package com.example.dan.myapplication.kotabesar.model;

/**
 * Created by DAN on 11/7/2017.
 */

public class Ville {
    private String villeName;
    private int villeID;
    private int imageVille;
    private String villeMateri;
    private int imageDetailVilla1;
    private int imageDetailVilla2;
    private int imageDetailVilla3;
    private String statusMateri;

    public Ville(String villeName, int villeID, int imageVille,
                 int imageDetailVilla1, int imageDetailVilla2, int imageDetailVilla3,
                 String villeMateri, String statusMateri) {
        this.villeName = villeName;
        this.villeID = villeID;
        this.imageVille = imageVille;
        this.villeMateri = villeMateri;
        this.imageDetailVilla1 = imageDetailVilla1;
        this.imageDetailVilla2 = imageDetailVilla2;
        this.imageDetailVilla3 = imageDetailVilla3;
        this.statusMateri = statusMateri;
    }

    public String getVilleName() {
        return villeName;
    }

    public void setVilleName(String villeName) {
        this.villeName = villeName;
    }

    public int getVilleID() {
        return villeID;
    }

    public void setVilleID(int villeID) {
        this.villeID = villeID;
    }

    public int getImageVille() {
        return imageVille;
    }

    public void setImageVille(int imageVille) {
        this.imageVille = imageVille;
    }

    public String getVilleMateri() {
        return villeMateri;
    }

    public void setVilleMateri(String villeMateri) {
        this.villeMateri = villeMateri;
    }

    public int getImageDetailVilla1() {
        return imageDetailVilla1;
    }

    public void setImageDetailVilla1(int imageDetailVilla1) {
        this.imageDetailVilla1 = imageDetailVilla1;
    }

    public int getImageDetailVilla2() {
        return imageDetailVilla2;
    }

    public void setImageDetailVilla2(int imageDetailVilla2) {
        this.imageDetailVilla2 = imageDetailVilla2;
    }

    public String getStatusMateri() {
        return statusMateri;
    }

    public void setStatusMateri(String statusMateri) {
        this.statusMateri = statusMateri;
    }

    public int getImageDetailVilla3() {
        return imageDetailVilla3;
    }

    public void setImageDetailVilla3(int imageDetailVilla3) {
        this.imageDetailVilla3 = imageDetailVilla3;
    }
}
