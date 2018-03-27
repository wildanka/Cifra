package com.example.dan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LessonMenuList extends AppCompatActivity {
    RecyclerView recyclerView;
    LessonMenuAdapter lessonMenuAdapter;
    List<LessonMenu> lessonMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_list);

        recyclerView = (RecyclerView) findViewById(R.id.rv_lessons_menu);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        generateLessonMenuData();

        //creating recycleView adapter
        LessonMenuAdapter adapter = new LessonMenuAdapter(this,lessonMenuList);

        //setting adapter in recycleView
        recyclerView.setAdapter(adapter);
    }

    private void generateLessonMenuData(){
        //initializing the lesson list
        lessonMenuList = new ArrayList<>();

        //adding some items into our lesson menu list

        lessonMenuList.add(
                new LessonMenu("Lesson 1","Présentation",R.drawable.exercise_presentation)
        );
        lessonMenuList.add(
                new LessonMenu("Lesson 2","Vie culturelle",R.drawable.exercise_culturelle)
        );
        lessonMenuList.add(
                new LessonMenu("Lesson 3","Vie économique",R.drawable.exercise_economic)
        );
        lessonMenuList.add(
                new LessonMenu("Lesson 4","Vie familiale",R.drawable.exercise_famille)
        );
        /*lessonMenuList.add(
                new LessonMenu("Lesson 5","Les Grandes Villes",R.drawable.exercise8eiffel_tower)
        );*/
        lessonMenuList.add(
                new LessonMenu("Lesson 5","Vie politique",R.drawable.exercise_politique)
        );
        lessonMenuList.add(
                new LessonMenu("Lesson 6","Vie quotidienne",R.drawable.exercise_quotidienne)
        );
        lessonMenuList.add(
                new LessonMenu("Lesson 7","Vie scolaire",R.drawable.exercise_scolaire)
        );
    }
}
