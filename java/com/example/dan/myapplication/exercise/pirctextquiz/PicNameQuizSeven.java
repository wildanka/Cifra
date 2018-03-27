package com.example.dan.myapplication.exercise.pirctextquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dan.myapplication.ExerciseMenuList;
import com.example.dan.myapplication.R;

public class PicNameQuizSeven extends AppCompatActivity {

    private Button btnJawabanA,btnJawabanB,btnJawabanC,btnJawabanD;
    private TextView score, soal;
    private ImageView ivSoal;

    private ExerciseSevenQuestion mQuestionSeven = new ExerciseSevenQuestion();
    private String mKunciJawaban;
    private int mScore = 0;
    private int mJumlahSoal = mQuestionSeven.getJumlahSoal() - 1;

    private int indexSoal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_name_quiz_seven);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //binding view
        btnJawabanA = (Button) findViewById(R.id.btn_jawaban_a_seven);
        btnJawabanB = (Button) findViewById(R.id.btn_jawaban_b_seven);
        btnJawabanC = (Button) findViewById(R.id.btn_jawaban_c_seven);
        btnJawabanD = (Button) findViewById(R.id.btn_jawaban_d_seven);

        score = (TextView) findViewById(R.id.tv_scoreExercise_seven);
        soal = (TextView) findViewById(R.id.tv_soal_seven);
        ivSoal = (ImageView) findViewById(R.id.iv_gambar_kuis_pertanyaan_seven);

        //mulai dari sini
        score.setText("SCORE : " + mScore);
        updateQuestion(indexSoal); //pilih soal berdasarkan hasil bilangan random


        //onClickListener Jawaban
        btnJawabanA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnJawabanA.getText()== mKunciJawaban ){
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

        btnJawabanB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnJawabanB.getText()== mKunciJawaban ){
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

        btnJawabanC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnJawabanC.getText()== mKunciJawaban ){
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

        btnJawabanD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnJawabanD.getText()== mKunciJawaban ){
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
        soal.setText(mQuestionSeven.getSoal(noSoal));
        ivSoal.setImageResource(mQuestionSeven.getSoalImage(noSoal));
        btnJawabanA.setText(mQuestionSeven.getPilihan1(noSoal));
        btnJawabanB.setText(mQuestionSeven.getPilihan2(noSoal));
        btnJawabanC.setText(mQuestionSeven.getPilihan3(noSoal));
        btnJawabanD.setText(mQuestionSeven.getPilihan4(noSoal));
        mKunciJawaban = mQuestionSeven.getCorrectAnswer(noSoal);
    }

    private void tampilPesanAkhir(){
        //tampilkan jawaban yang benar
        AlertDialog.Builder builder = new AlertDialog.Builder(PicNameQuizSeven.this);
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
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(PicNameQuizSeven.this);
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


    private void updateScore(){
        score.setText(mScore);
    }

    private void newGame(){
        mScore = 0;
        indexSoal = 0;
        updateQuestion(indexSoal);
        score.setText("SCORE : " + mScore);
    }
}
