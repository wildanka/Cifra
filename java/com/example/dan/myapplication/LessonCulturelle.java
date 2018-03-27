package com.example.dan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class LessonCulturelle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_culturelle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_materi_culturelle);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String judul = String.valueOf(getIntent().getSerializableExtra("lessonTitle"));

        Toast.makeText(this,judul,Toast.LENGTH_SHORT).show();

        //media
        LinearLayout linLayMedia = (LinearLayout) findViewById(R.id.layoutBtnMedia);
        linLayMedia.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent in = new Intent(LessonCulturelle.this, LessonCulturelleMedia.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });

        //musik
        LinearLayout linLayMusik = (LinearLayout) findViewById(R.id.layoutBtnMusik);
        linLayMusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonCulturelle.this, LessonCulturelleMusic.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });

        //film
        LinearLayout linLayFilm = (LinearLayout) findViewById(R.id.layoutBtnFilm);
        linLayFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonCulturelle.this, LessonCulturelleFilm.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
    }

}
