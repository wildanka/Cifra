package com.example.dan.myapplication.exercise.truefalse;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/12/2017.
 */

public class ExerciseEightQuestion {

    private String mQuestion[] = {
            "1.\t“En France, on va à l’école de lundi à vendredi”",
            "2.\t“Selon Jules Ferry, l’Église est exclue de l’organisation de l’enseignement, c’est qu’on dit laïcité”",
            "3.\t“Depuis la Révolution Française (1789), il y a quatre degrés de l’enseignement en France”",
            "4.\tL’école maternelle est obligatoire ",
            "5.\tL’école maternelle est concerne les enfants de 3 à 5 ans ",
            "6.\tEn France, on reste à l’école primaire pendant six ans",
            "7.\tL’école primaire est concerne les enfants de 6 à 12 ans",
            "8.\t“C’est la façon du college, 1 an de cours preparation; 2 ans de cours élémentaire; et 2 ans de cours moyen”",
            "9.\t“Les élèves passent le brevet des collèges”",
            "10.\tAprès avoir fini ses études, les lycéens obtiendront le Bac"

    };

    private String mChoices[][] = {
            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"},

            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"},
            {"Vrai","Faux"}
    };

    private String mCorrectAnswer[] = {
            "Faux",
            "Vrai",
            "Faux",
            "Faux",
            "Vrai",

            "Faux",
            "Faux",
            "Faux",
            "Vrai",
            "Vrai",
    };

    // dapatkan soal
    public String getSoal(int noSoal){
        String soal = mQuestion[noSoal];
        return soal;
    }

    //dapatkan kunci jawaban
    public String getKunciJawaban(int noSoal){
        String kunciJawaban = mCorrectAnswer[noSoal];
        return kunciJawaban;
    }

    // dapatkan daftar jawaban
    public String getPilihanTrue(int noSoal){
        String pilihan1 = mChoices[noSoal][0];
        return pilihan1;
    }

    public String getPilihanFalse(int noSoal){
        String pilihan2 = mChoices[noSoal][1];
        return pilihan2;
    }

    public int getJumlahSoal(){
        return mQuestion.length;
    }
}
