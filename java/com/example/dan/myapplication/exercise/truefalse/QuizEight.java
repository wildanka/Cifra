package com.example.dan.myapplication.exercise.truefalse;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dan.myapplication.ExerciseMenuList;
import com.example.dan.myapplication.R;
import com.example.dan.myapplication.exercise.pirctextquiz.PicNameQuizTwo;

public class QuizEight extends AppCompatActivity {

    private TextView soal, score;
    private Button btnTrue, btnFalse;

    private ExerciseEightQuestion mQuestionEight = new ExerciseEightQuestion();
    private String mKunciJawaban;
    private int mScore = 0;
    private int mJumlahSoal = mQuestionEight.getJumlahSoal() - 1;

    private int indexSoal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_eight);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        score = (TextView) findViewById(R.id.tv_scoreExerciseEight);
        soal = (TextView) findViewById(R.id.tv_soal_eight);
        btnTrue = (Button) findViewById(R.id.btn_jawaban_true);
        btnFalse = (Button) findViewById(R.id.btn_jawaban_false);

        //mulai dari sini
        score.setText("SCORE : " + mScore);
        updateQuestion(indexSoal); //pilih soal berdasarkan hasil bilangan random

        //onClickListener Jawaban
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("Vrai"== mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        score.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        score.setText("SCORE : " + mScore);
                        indexSoal++;
                        updateQuestion(indexSoal);
                    }
                }else{
                    if (indexSoal == mJumlahSoal){
                        tampilPesanAkhir();
                    }else{
                        tampilkanSalah();
                    }
                }
                System.out.println("Index Soal = "+indexSoal+", Total Soal = "+mJumlahSoal);
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("Faux"== mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        score.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        score.setText("SCORE : " + mScore);
                        indexSoal++;
                        updateQuestion(indexSoal);
                    }
                }else{
                    if (indexSoal == mJumlahSoal){
                        tampilPesanAkhir();
                    }else{
                        tampilkanSalah();
                    }
                }
                System.out.println("Index Soal = "+indexSoal+", Total Soal = "+mJumlahSoal);
            }
        });


    }

    public void updateQuestion(int noSoal){
        soal.setText(mQuestionEight.getSoal(noSoal));
        mKunciJawaban = mQuestionEight.getKunciJawaban(noSoal);
    }

    private void tampilPesanAkhir(){
        //tampilkan jawaban yang benar
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizEight.this);
        builder.setMessage("Game Over, Your Score : "+mScore+" / "+(mJumlahSoal+1))
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

    private void tampilkanSalah(){
        //tampilkan jawaban yang benar
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(QuizEight.this);
        alertBuilder
                .setMessage("The Right Answer Is "+mKunciJawaban)
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

    private void newGame(){
        mScore = 0;
        indexSoal = 0;
        updateQuestion(indexSoal);
        score.setText("SCORE : " + mScore);

    }
}
