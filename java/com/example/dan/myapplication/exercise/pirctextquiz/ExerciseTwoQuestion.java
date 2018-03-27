package com.example.dan.myapplication.exercise.pirctextquiz;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/12/2017.
 */

public class ExerciseTwoQuestion {
    private int mQuestionImage[] = {
            R.drawable.exercise2_1,
            R.drawable.exercise2_2,
            R.drawable.exercise2_3,
            R.drawable.exercise2_4,
            R.drawable.exercise2_5,
            R.drawable.exercise2_6
    };

    private String mQuestion[] = {
            "1. c’est quoi?",
            "2. c’est quoi?",
            "3. c’est quoi?",
            "4. c’est quoi?",
            "5. c’est quoi?",
            "6. c’est quoi?"
    };

    private String mChoices[][] = {
            {
                    "a.\tGâteau",
                    "b.\tVin",
                    "c.\tCéréals",
                    "d.\tSalade"
            },
            {
                    "a.\tVin",
                    "b.\tCéréals",
                    "c.\tSalade",
                    "d.\tFromage"
            },
            {
                    "a.\tCroque-Monsieur",
                    "b.\tGâteau",
                    "c.\tVin",
                    "d.\tCéréals"
            },
            {
                    "a.\tGâteau",
                    "b.\tVin",
                    "c.\tCéréals",
                    "d.\tSalade"
            },
            {
                    "a.\tVin",
                    "b.\tCéréals",
                    "c.\tSalade",
                    "d.\tFromage"
            },
            {
                    "a.\tGâteau",
                    "b.\tVin",
                    "c.\tCéréals",
                    "d.\tSalade"
            }
    };

    private String mCorrectAnswer[] = {
            "c.\tCéréals",
            "d.\tFromage",
            "a.\tCroque-Monsieur",
            "a.\tGâteau",
            "c.\tSalade",
            "b.\tVin"

    };

    // dapatkan soal
    public String getSoal(int noSoal){
        String soal = mQuestion[noSoal];
        return soal;
    }
    //dapatkan gambar soal
    public int getSoalImage(int noSoal){
        int idImage = mQuestionImage[noSoal];
        return idImage;
    }

    //dapatkan daftar jawaban untuk jawaban A sampai D (4 button jawaban)
    public String getPilihan1(int noSoal){
        String pilihan1 = mChoices[noSoal][0];
        return pilihan1;
    }

    public String getPilihan2(int noSoal){
        String pilihan2 = mChoices[noSoal][1];
        return pilihan2;
    }

    public String getPilihan3(int noSoal){
        String pilihan3 = mChoices[noSoal][2];
        return pilihan3;
    }

    public String getPilihan4(int noSoal){
        String pilihan4 = mChoices[noSoal][3];
        return pilihan4;
    }

    public String getCorrectAnswer(int noSoal){
        String kunciJawaban = mCorrectAnswer[noSoal];
        return kunciJawaban;
    }

    public int getJumlahSoal(){
        return mQuestion.length;
    }
}
