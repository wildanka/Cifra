package com.example.dan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.dan.myapplication.quotidienne.LeCalendrier;
import com.example.dan.myapplication.quotidienne.Quotidienne2;
import com.example.dan.myapplication.quotidienne.Quotidienne3;
import com.example.dan.myapplication.quotidienne.Quotidienne4;
import com.example.dan.myapplication.quotidienne.Quotidienne5;
import com.example.dan.myapplication.quotidienne.Quotidienne6;

public class LessonQuotidienneList extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_quotidienne_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn1 = (Button) findViewById(R.id.btnQuotidienne1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,LeCalendrier.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
        btn2 = (Button) findViewById(R.id.btnQuotidienne2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,Quotidienne2.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
        btn3 = (Button) findViewById(R.id.btnQuotidienne3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,Quotidienne3.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
        btn4 = (Button) findViewById(R.id.btnQuotidienne4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,Quotidienne4.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
        btn5 = (Button) findViewById(R.id.btnQuotidienne5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,Quotidienne5.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });
        btn6 = (Button) findViewById(R.id.btnQuotidienne6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LessonQuotidienneList.this,Quotidienne6.class);
                in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
            }
        });

    }

}
