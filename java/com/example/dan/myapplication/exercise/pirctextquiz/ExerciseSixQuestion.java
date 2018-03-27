package com.example.dan.myapplication.exercise.pirctextquiz;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/12/2017.
 */

public class ExerciseSixQuestion {
    private int mQuestionImage[] = {
            R.drawable.exercise6_1,
            R.drawable.exercise6_2,
            R.drawable.exercise6_3,
            R.drawable.exercise6_4,
            R.drawable.exercise6_5,

            R.drawable.exercise6_6,
            R.drawable.exercise6_7,
            R.drawable.exercise6_8,
            R.drawable.exercise6_9,
            R.drawable.exercise6_10,
    };

    private String mQuestion[] = {
            "1. Quelle est leur profession?",
            "2. Quelle est sa profession?",
            "3. Quelle est sa profession?",
            "4. Quelle est sa profession?",
            "5. Quelle est sa profession?",
            "6. Quelle est sa profession?",
            "7. Quelle est sa profession?",
            "8. Quelle est sa profession?",
            "9. Quelle est sa profession?",
            "10. Quelle est sa profession?"
    };


    private String mChoices[][] = {
            { //1
                    "a.\tLes pêchers",
                    "b.\tLes forgerons",
                    "c.\tLes bouchers",
                    "d.\tLes peintres"
            },
            { //2
                    "a.\tLe boucher",
                    "b.\tLe cuisine",
                    "c.\tLe médecin",
                    "d.\tLe pêcher"
            },
            { //3
                    "a.\tLa coiffeur",
                    "b.\tL’électricien",
                    "c.\tLe juge",
                    "d.\tLe médecin"
            },
            { //4
                    "a.\tLe forgeron",
                    "b.\tLe boucher",
                    "c.\tLa coiffeur",
                    "d.\tL’électricien"
            },
            { //5
                    "a.\tLe cuisine",
                    "b.\tLe médecin",
                    "c.\tLe peintre",
                    "d.\tLa serveuse"
            },
            { //6
                    "a.\tLe boucher",
                    "b.\tLe cuisine",
                    "c.\tLe médecin",
                    "d.\tLe pêcher"
            },
            { //7
                    "a.\tLe boucher",
                    "b.\tLe cuisine",
                    "c.\tLa serveuse",
                    "d.\tLa coiffeur"
            },
            { //8
                    "a.\tLa coiffeur",
                    "b.\tL’électricien",
                    "c.\tLe juge",
                    "d.\tLe peintre"
            },
            { //9
                    "a.\tLe peintre",
                    "b.\tLa serveuse",
                    "c.\tLa coiffeur",
                    "d.\tL’électricien"
            },
            { //10
                    "a.\tLe pêcher",
                    "b.\tLe juge",
                    "c.\tLa peintre",
                    "d.\tLa serveuse"
            }
    };

    private String mCorrectAnswer[] = {
            "a.\tLes pêchers",
            "c.\tLe médecin",
            "c.\tLe juge",
            "a.\tLe forgeron",
            "a.\tLe cuisine",

            "a.\tLe boucher",
            "c.\tLa serveuse",
            "a.\tLa coiffeur",
            "d.\tL’électricien",
            "c.\tLa peintre"
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
