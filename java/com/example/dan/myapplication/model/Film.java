package com.example.dan.myapplication.model;

/**
 * Created by DAN on 11/6/2017.
 */

public class Film {
    private String judulFilm;
    private String tahun;


    public Film(String judulFilm, String tahun) {
        this.judulFilm = judulFilm;
        this.tahun = tahun;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

}
