package com.example.dan.myapplication.exercise.textpicquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dan.myapplication.ExerciseMenuList;
import com.example.dan.myapplication.R;

public class QuizFour extends AppCompatActivity {

    LinearLayout linLayA,linLayB,linLayC,linLayD;
    TextView soal, scoreView;
    TextView tvPilihanA,tvPilihanB,tvPilihanC,tvPilihanD;
    ImageView ivPilihanA,ivPilihanB,ivPilihanC,ivPilihanD;

    private ExerciseFourQuestion mQuestionFour = new ExerciseFourQuestion();
    private String mKunciJawaban;
    private int mScore = 0;
    private int mJumlahSoal = mQuestionFour.getJumlahSoal() - 1;
    private int indexSoal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //bind
        linLayA = (LinearLayout) findViewById(R.id.linlay_a_four);
        linLayB = (LinearLayout) findViewById(R.id.linlay_b_four);
        linLayC = (LinearLayout) findViewById(R.id.linlay_c_four);
        linLayD = (LinearLayout) findViewById(R.id.linlay_d_four);

        //bind data Pilihan
        tvPilihanA = (TextView) findViewById(R.id.tv_pilihan_a_four);
        tvPilihanB = (TextView) findViewById(R.id.tv_pilihan_b_four);
        tvPilihanC = (TextView) findViewById(R.id.tv_pilihan_c_four);
        tvPilihanD = (TextView) findViewById(R.id.tv_pilihan_d_four);

        ivPilihanA = (ImageView) findViewById(R.id.iv_pilihan_a_four);
        ivPilihanB = (ImageView) findViewById(R.id.iv_pilihan_b_four);
        ivPilihanC = (ImageView) findViewById(R.id.iv_pilihan_c_four);
        ivPilihanD = (ImageView) findViewById(R.id.iv_pilihan_d_four);

        soal = (TextView) findViewById(R.id.tv_soal_four);
        scoreView = (TextView) findViewById(R.id.tv_scoreExercise);

        //mulai dari sini
        scoreView.setText("SCORE : " + mScore);
        updateQuestion(indexSoal); //pilih soal berdasarkan hasil bilangan random

        //onClickListener Jawaban
        linLayA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("A"== mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
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

        linLayB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("B"== mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
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

        linLayC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("C" == mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
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
                System.out.println("Index Soal = "+indexSoal+", Total Soal = "+mJumlahSoal+" Jawaban : "+tvPilihanC.getText());
            }
        });

        linLayD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ("D"== mKunciJawaban ){
                    if (indexSoal == mJumlahSoal){
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
                        tampilPesanAkhir();
                    }else{
                        mScore++;
                        scoreView.setText("SCORE : " + mScore);
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
        soal.setText(mQuestionFour.getSoal(noSoal));
//        tvPilihanA.setText(mQuestionFour.getPilihan1(noSoal));
//        tvPilihanB.setText(mQuestionFour.getPilihan2(noSoal));
//        tvPilihanC.setText(mQuestionFour.getPilihan3(noSoal));
//        tvPilihanD.setText(mQuestionFour.getPilihan4(noSoal));
        ivPilihanA.setImageResource(mQuestionFour.getImagePilihanA(noSoal));
        ivPilihanB.setImageResource(mQuestionFour.getImagePilihanB(noSoal));
        ivPilihanC.setImageResource(mQuestionFour.getImagePilihanC(noSoal));
        ivPilihanD.setImageResource(mQuestionFour.getImagePilihanD(noSoal));
        mKunciJawaban = mQuestionFour.getCorrectAnswer(noSoal);
    }

    private void tampilPesanAkhir(){
        //tampilkan jawaban yang benar
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizFour.this);
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
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(QuizFour.this);
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
        scoreView.setText("SCORE : " + mScore);

    }
}
