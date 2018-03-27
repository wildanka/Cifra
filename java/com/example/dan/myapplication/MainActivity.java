package com.example.dan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        //set intent untuk lihat mater pada btnLihatMateri
        ImageButton intentBtnLihatMateri = (ImageButton) findViewById(R.id.btnLihatMateri);
        intentBtnLihatMateri.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent IntentLesson1 = new Intent(v.getContext(), LessonMenuList.class);
                        startActivity(IntentLesson1);
                    }
                }
        );

        //set intent untuk membuka exercise
        ImageButton intentBtnLihatExercise = (ImageButton) findViewById(R.id.btnLatihanSoal);
        intentBtnLihatExercise.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent IntentLesson1 = new Intent(v.getContext(), ExerciseMenuList.class);
                        startActivity(IntentLesson1);
                    }
                }
        );
    }
}
