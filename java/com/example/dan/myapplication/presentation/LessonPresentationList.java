package com.example.dan.myapplication.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.dan.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class LessonPresentationList extends AppCompatActivity {

    RecyclerView recyclerView;
    LessonPresentationAdapter mAdapter;
    List<LessonPresentationModel> lessonPresentationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_presentation_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.rv_presentation);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        generatePresentationMenu();

        //creating recycleView adapter
        mAdapter = new LessonPresentationAdapter(this, lessonPresentationList);

        //setting adapter in recycleView
        recyclerView.setAdapter(mAdapter);
    }

    private void generatePresentationMenu(){
        lessonPresentationList = new ArrayList<>();

        lessonPresentationList.add(
                new LessonPresentationModel("Presentation 1","La Géographie",R.drawable.geografi)
        );
        lessonPresentationList.add(
                new LessonPresentationModel("Presentation 2","Le Rélief",R.drawable.relief)
        );
        lessonPresentationList.add(
                new LessonPresentationModel("Presentation 3","Le Climat",R.drawable.climat)
        );
        lessonPresentationList.add(
                new LessonPresentationModel("Presentation 4","Les Paysages",R.drawable.paysages)
        );
        lessonPresentationList.add(
                new LessonPresentationModel("Presentation 5","Les Grandes Villes",R.drawable.grande_ville)
        );
    }
}
