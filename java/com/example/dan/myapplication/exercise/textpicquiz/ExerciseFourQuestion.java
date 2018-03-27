package com.example.dan.myapplication.exercise.textpicquiz;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/13/2017.
 */

public class ExerciseFourQuestion {
    private String mQuestion[] = {
            "1.\tIl est situé dans des centres commerciaux. De plus en plus nombreux à la " +
                    "périphérie des grandes villes. Qu’est-ce que c’est?s",
            "2.\tIl est le grand magasins traditionnels, par examples le Printemps et les " +
                    "tourists viennent y chercher des produits de luxe. Qu’est-ce que c’est?",
            "3.\tOn peut faire les courses alimentaires aux supermarchés ou encore au marché. Qu’est-ce que c’est?",
            "4.\tUOn utilise le server pour faire leurs achats. Qu’est-ce que c’est? "
    };

    private int mChoicesPic[][] = {
            {
                    R.drawable.exercise4_a,
                    R.drawable.exercise4_b,
                    R.drawable.exercise4_c,
                    R.drawable.exercise4_d
            },
            {
                    R.drawable.exercise4_a,
                    R.drawable.exercise4_b,
                    R.drawable.exercise4_c,
                    R.drawable.exercise4_d
            },
            {
                    R.drawable.exercise4_a,
                    R.drawable.exercise4_b,
                    R.drawable.exercise4_c,
                    R.drawable.exercise4_d
            },
            {
                    R.drawable.exercise4_a,
                    R.drawable.exercise4_b,
                    R.drawable.exercise4_c,
                    R.drawable.exercise4_d
            }
    };

    private String mChoicesText[][] = {
            {
                    "A",
                    "B",
                    "C",
                    "D"
            },
            {
                    "A",
                    "B",
                    "C",
                    "D"
            },
            {
                    "A",
                    "B",
                    "C",
                    "D"
            },
            {
                    "A",
                    "B",
                    "C",
                    "D"
            }
    };

    private String mCorrectAnswer[] = {
            "D",
            "C",
            "B",
            "A"
    };

    public int getJumlahSoal(){
        return mQuestion.length;
    }

    public String getSoal(int noSoal){
        String soal = mQuestion[noSoal];
        return soal;
    }

    public int getImagePilihanA(int noSoal){
        int image = mChoicesPic[noSoal][0];
        return image;
    }
    public int getImagePilihanB(int noSoal){
        return mChoicesPic[noSoal][1];
    }
    public int getImagePilihanC(int noSoal){
        return mChoicesPic[noSoal][2];
    }
    public int getImagePilihanD(int noSoal){
        return mChoicesPic[noSoal][3];
    }

    public String getCorrectAnswer(int noSoal){
        String jawaban = mCorrectAnswer[noSoal];
        return jawaban;
    }
}
