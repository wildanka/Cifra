package com.example.dan.myapplication.scolaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.example.dan.myapplication.R;

public class LessonScolaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_scolaire);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //SD
        LinearLayout linLaySD = (LinearLayout) findViewById(R.id.layoutBtnSekolahSD);
        linLaySD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonScolaire.this, LessonScolaireSD.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });

        //SMP
        LinearLayout linLaySMP = (LinearLayout) findViewById(R.id.layoutBtnSekolahSMP);
        linLaySMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonScolaire.this, LessonScolaireSMP.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });

        //SMA
        LinearLayout linLaySMA = (LinearLayout) findViewById(R.id.layoutBtnSekolahSMA);
        linLaySMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonScolaire.this, LessonScolaireSMA.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
    }

}
