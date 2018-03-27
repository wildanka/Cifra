package com.example.dan.myapplication.exercise.textonly;

/**
 * Created by DAN on 11/10/2017.
 */

public class ExerciseFiveQuestion {
    private String mQuestion[] = {
            "1.\tPour les étudiants et les enseignants, l’année commence au mois de Septembre, on parle alors…",
            "2.\tEn France on travaille…",
            "3.\t“En France, l’école commence au mois…et se termine au mois…”",
            "4.\t“les élèves ont deux mois de vacances par an. Quel mois?”",
            "5.\t“pendant l’année scolaire, les élèves ont la periode de vacances de 15 jours pour quelque vacances, sauf…”"
    };

    private String mChoices[][] = {
            {
                    "a.\tLa rentrée scolaire",
                    "b.\tLe travail",
                    "c.\tLa vie scolaire",
                    "d.\tLes nouvelles an"
            },
            {
                    "a.\tLundi à mercredi",
                    "b.\tMardi à jeudi",
                    "c.\tLundi à vendredi",
                    "d.\tMardi à vendredi"
            },
            {
                    "a.\tDe Julliet, de Decembre",
                    "b.\tDe Janvier, de Juin",
                    "c.\tDe Septembre, de Juin",
                    "d.\tDe Juin, de Decembre"
            },
            {
                    "a.\tJulliet et Août",
                    "b.\tJuin et Julliet",
                    "c.\tDecembre et Janvier",
                    "d.\tAoût et Septembre"
            },
            {
                    "a.\tPour les vacances d’été",
                    "b.\tPour les vacances de printemps en Avril",
                    "c.\tPour les vacances d’hiver en Février",
                    "d.\tPour Noël"
            }
    };

    private String mCorrectAnswer[] = {
            "a.\tDe rentrée scolaire",
            "b.\tLundi à vendredi",
            "c.\tDe Septembre, de Juin",
            "a.\tJulliet et Août",
            "a.\tPour les vacances d’été"
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
