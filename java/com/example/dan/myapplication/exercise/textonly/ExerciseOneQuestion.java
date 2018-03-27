package com.example.dan.myapplication.exercise.textonly;

/**
 * Created by DAN on 11/9/2017.
 */

public class ExerciseOneQuestion {
    private String mQuestion[] = {
      "1.\tUn adult qui vit seul avec ses enfants",
      "2.\tLes couples qui faire le contrat pour organizer leur vie commune ",
      "3.\tLes couples se marie à l’église et faire la fête",
      "4.\tLes couples qui vivent en cohabitation ",
      "5.\tLes enfants du nouveau marriage vivent avec leurs demi-frères et demi-sœurs "
    };

    private String mChoices[][] = {
            {
                "a. Monoparentales",
                "b. Le Marriage",
                "c. Recomposes",
                "d. L’Union Libre"
            },
            {
                "a. Recomposes",
                "b. Le Pacs",
                "c. Monoparentales",
                "d. L’Union Libre"
            },
            {
                "a. L’Union Libre",
                "b. Recomposes",
                "c. Le Pacs",
                "d. Le Marriage"
            },
            {
                "a. Le Pacs",
                "b. Recomposes",
                "c. L’Union Libre",
                "d. Monoparentales"
            },
            {
                "a. Le Pacs",
                "b. Recomposes",
                "c. Monoparentales",
                "d. Le Divorce"
            }
    };

    private String mCorrectAnswer[] = {
            "a. Monoparentales",
            "b. Le Pacs",
            "d. Le Marriage",
            "c. L’Union Libre",
            "b. Recomposes"
    };

    // dapatkan soal
    public String getSoal(int noSoal){
        String soal = mQuestion[noSoal];
        return soal;
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