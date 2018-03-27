package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.adapter.ChannelTVAdapater;
import com.example.dan.myapplication.model.ChannelTV;

import java.util.ArrayList;
import java.util.List;

public class LessonCulturelleMediaTV extends AppCompatActivity {

    RecyclerView recyclerView;
    ChannelTVAdapater mChannelTVAdapter;
    List<ChannelTV> mChannelTVList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_culturelle_media_tv);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.rv_media_tv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        generateData(); //generating data

        //create recycleview adapter
        ChannelTVAdapater adapter = new ChannelTVAdapater(this,mChannelTVList);

        //setting up the recycleview from adapter
        recyclerView.setAdapter(adapter);

    }

    private void generateData(){
        //initializing the exercise list
        mChannelTVList = new ArrayList<>();

        //adding some items into our exercises list
        mChannelTVList.add(
                new ChannelTV("TF 1","http://www.tf1.fr")
        );
        mChannelTVList.add(
                new ChannelTV("France 2","http://www.france2.fr")
        );
        mChannelTVList.add(
                new ChannelTV("France 3","http://www.france3.fr")
        );
        mChannelTVList.add(
                new ChannelTV("France 5","http://www.france5.fr")
        );
        mChannelTVList.add(
                new ChannelTV("Arte","http://www.france2.fr")
        );
        mChannelTVList.add(
                new ChannelTV("Canal+","http://www.cplus.fr")
        );
        mChannelTVList.add(
                new ChannelTV("M6","http://www.m6.fr")
        );
        mChannelTVList.add(
                new ChannelTV("RFO","http://www.rfo.fr")
        );
    }
}
