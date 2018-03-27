package com.example.dan.myapplication.exercise.textpicquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.dan.myapplication.ExerciseMenuList;
import com.example.dan.myapplication.R;

public class QuizThree extends AppCompatActivity {

    private TextView score, soal;
    private CheckBox cbA,cbB,cbC,cbD,cbE,cbF;
    private Button btnSubmit;

    private ExerciseThreeQuestion mQuestionThree = new ExerciseThreeQuestion();
    private String kunciJawaban1, kunciJawaban2;
    private int mScore = 0;
    private int mJumlahSoal = mQuestionThree.getJumlahSoal() - 1;

    private int indexSoal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //binding
        cbA = (CheckBox)  findViewById(R.id.checkBoxA);
        cbB = (CheckBox)  findViewById(R.id.checkBoxB);
        cbC = (CheckBox)  findViewById(R.id.checkBoxC);
        cbD = (CheckBox)  findViewById(R.id.checkBoxD);
        cbE = (CheckBox)  findViewById(R.id.checkBoxE);
        cbF = (CheckBox)  findViewById(R.id.checkBoxF);

        btnSubmit = (Button) findViewById(R.id.btn_submit);
        score = (TextView) findViewById(R.id.tv_scoreExercise);
        soal = (TextView) findViewById(R.id.tv_soal_three);

        //mulai darisini
        score.setText("SCORE : " + mScore);
        updateQuestion(indexSoal);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indexSoal==mJumlahSoal){
                    cekJawaban();
                    indexSoal++;
                    //tampil pesan akhir
                    tampilPesanAkhir();
                    //updateQuestion(indexSoal);
                }else{
                    cekJawaban();
                    tampilkanJawaban();
                    resetCheckBox();
                }

            }
        });
    }

    private void cekJawaban(){
        kunciJawaban1 = mQuestionThree.getJawaban1(indexSoal);
        kunciJawaban2 = mQuestionThree.getJawaban2(indexSoal);
        System.out.println(indexSoal+"Kunci jawaban : "+kunciJawaban1+", "+kunciJawaban2);

        if ( (cbA.isChecked()) ){
            if ("A"==kunciJawaban1 || "A"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("A"+cbA.isChecked()+" hasil getText : "+ cbA.getText());
            }
        }
        if ( (cbB.isChecked())){
            if ("B"==kunciJawaban1 || "B"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("B"+cbB.isChecked()+" hasil getText : "+ cbB.getText());
            }
        }
        if ( cbC.isChecked() ){
            if ("C"==kunciJawaban1 || "C"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("C"+cbC.isChecked()+" hasil getText : "+ cbC.getText());
            }
        }
        if ( cbD.isChecked() ){
            if ("D"==kunciJawaban1 || "D"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("D"+cbD.isChecked()+" hasil getText : "+ cbD.getText());
            }
        }
        if ( (cbE.isChecked()) ){
            if ("E"==kunciJawaban1 || "E"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("E"+cbE.isChecked()+" hasil getText : "+ cbE.getText());
            }
        }
        if ( cbF.isChecked()){
            if ("F"==kunciJawaban1 || "F"==kunciJawaban2){
                mScore++;
                tambahScore();
                System.out.println("F"+cbF.isChecked()+" hasil getText : "+ cbF.getText());
            }
        }

    }

    private void tampilkanJawaban(){
        //tampilkan jawaban yang benar
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(QuizThree.this);
        alertBuilder
                .setMessage("The Right Answer Is "+kunciJawaban1+" and "+ kunciJawaban2)
                .setCancelable(false)
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        indexSoal++;
                        updateQuestion(indexSoal);
                    }
                });
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }

    private void tampilPesanAkhir(){
        //tampilkan jawaban yang benar
        int totalPoint = (mJumlahSoal+1)*2;
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizThree.this);
        builder.setMessage("Game Over, Your Score : "+mScore+" / "+totalPoint)
                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        newGame();
                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), ExerciseMenuList.class));
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void updateQuestion(int indexSoal){
        soal.setText(mQuestionThree.getSoal(indexSoal));

    }
    private void tambahScore(){
//        mScore++;
        score.setText("SCORE : "+mScore);
    }

    private void newGame(){
        mScore = 0;
        indexSoal = 0;
        updateQuestion(indexSoal);
        score.setText("SCORE : " + mScore);
        resetCheckBox();
    }


    private void resetCheckBox(){
        cbA.setChecked(false);
        cbB.setChecked(false);
        cbC.setChecked(false);
        cbD.setChecked(false);
        cbE.setChecked(false);
        cbF.setChecked(false);
    }
}
