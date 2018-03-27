package com.example.dan.myapplication.exercise.pirctextquiz;

import com.example.dan.myapplication.R;

/**
 * Created by DAN on 11/12/2017.
 */

public class ExerciseSevenQuestion {
    private int mQuestionImage[] = {
            R.drawable.exercise7_1,
            R.drawable.exercise7_2,
            R.drawable.exercise7_3,
            R.drawable.exercise7_4,
            R.drawable.exercise7_5,

            R.drawable.exercise7_6,
            R.drawable.exercise7_7,
            R.drawable.exercise7_8,
            R.drawable.exercise7_9,
            R.drawable.exercise7_10,
    };

    private String mQuestion[] = {
            "1. “Qu’est-ce que c’est?”",
            "2. “Qu’est-ce que c’est?”",
            "3. “Qu’est-ce que c’est?”",
            "4. “Qu’est-ce que c’est?”",
            "5. “Qu’est-ce que c’est?”",
            "6. “Qu’est-ce que c’est?”",
            "7. “Qu’est-ce que c’est?”",
            "8. “Qu’est-ce que c’est?”",
            "9. “Qu’est-ce que c’est?”",
            "10. “Qu’est-ce que c’est?”"

    };

    private String mChoices[][] = {
            { //1
                    "a.\tTramway",
                    "b.\tScooter",
                    "c.\tTGV",
                    "d.\tAvion"
            },
            { //2
                    "a.\tVoiture",
                    "b.\tRER",
                    "c.\tTGV",
                    "d.\tMoto"
            },
            { //3
                    "a.\tAvion",
                    "b.\tVélo",
                    "c.\tMobylette",
                    "d.\tScooter"
            },
            { //4
                    "a.\tRER",
                    "b.\tAvion",
                    "c.\tMétro",
                    "d.\tTGV"
            },
            { //5
                    "a.\tVoiture",
                    "b.\tMoto",
                    "c.\tScooter",
                    "d.\tVélo"
            },
            { //6
                    "a.\tMobylette",
                    "b.\tScooter",
                    "c.\tVélo",
                    "d.\tMoto"
            },
            { //7
                    "a.\tAvion",
                    "b.\tVoiture",
                    "c.\tTGV",
                    "d.\tTrain"
            },
            { //8
                    "a.\tVoiture",
                    "b.\tMoto",
                    "c.\tMétro",
                    "d.\tMobylette"
            },
            { //9
                    "a.\tVélo",
                    "b.\tRER",
                    "c.\tMobylette",
                    "d.\tScooter"
            },
            { //10
                    "a.\tMétro",
                    "b.\tTrolleybus",
                    "c.\tAvion",
                    "d.\tRER"
            }
    };

    private String mCorrectAnswer[] = {
            "a.\tTramway",
            "c.\tTGV",
            "d.\tScooter",
            "a.\tRER",
            "b.\tMoto",
            "a.\tMobylette",
            "a.\tAvion",
            "a.\tVoiture",
            "a.\tVélo",
            "b.\tTrolleybus"

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
