package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ExerciseMenuList extends AppCompatActivity {

    RecyclerView recyclerView;

    List<ExerciseMenu> exerciseMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_menu_listbaru);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //invoking the recycleView for rv_exercise_menu
        recyclerView = (RecyclerView) findViewById(R.id.rv_exercise_menu);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        generateExerciseMenuData();

        //creating recycleView adapter
        ExerciseMenuAdapter adapter = new ExerciseMenuAdapter(this, exerciseMenuList);

        //setting adapter in recycleView
        recyclerView.setAdapter(adapter);
    }

    private void generateExerciseMenuData(){
        //initializing the exercise list
        exerciseMenuList = new ArrayList<>();

        //adding some items into our exercises list
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 1",R.drawable.exercise1)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 2",R.drawable.exercise2food)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 3",R.drawable.exercise3occupation)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 4",R.drawable.exercise4places)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 5",R.drawable.exercise5scolaire)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 6",R.drawable.exercise6things)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 7",R.drawable.exercise7transportation)
        );
        exerciseMenuList.add(
                new ExerciseMenu("Exercise 8",R.drawable.exercise8)
        );
    }

}
