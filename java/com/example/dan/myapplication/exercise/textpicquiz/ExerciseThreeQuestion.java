package com.example.dan.myapplication.exercise.textpicquiz;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/13/2017.
 */

public class ExerciseThreeQuestion {
    private String mQuestion[] = {
            "1.\tVous êtes invite dans un dîner. Choisissez deux cadeaux entre les jeunes!",
            "2.\tVous êtes invite dans un dîner. Choisissez deux cadeaux entre les adultes! ",
            "3.\tVous êtes inviter dans un dîner. Choisissez deux cadeaux dans certains milieu!"
    };

    private int mChoices[][] = {
            {
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
            },
            {
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
            },
            {
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
                    R.drawable.avion,
            }
    };

    private String mChoicesText[][] = {
            {
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F"
            },
            {
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F"
            },
            {
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F"
            }
    };

    private String mCorrectAnswer[][] = {
            {"A","D"},
            {"C","F"},
            {"B","E"}
    };

    public String getJawaban1(int noSoal){
        String jawaban1 = mCorrectAnswer[noSoal][0];
        return jawaban1;
    }

    public String getJawaban2(int noSoal){
        String jawaban2 = mCorrectAnswer[noSoal][1];
        return jawaban2;
    }

    public int getJumlahSoal(){
        return mQuestion.length;
    }

    public String getSoal(int noSoal){
        return mQuestion[noSoal];
    }


}
