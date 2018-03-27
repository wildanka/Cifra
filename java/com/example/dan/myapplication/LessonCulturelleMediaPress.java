package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.adapter.PressAreaAdapter;
import com.example.dan.myapplication.model.Press;
import com.example.dan.myapplication.model.PressArea;

import java.util.ArrayList;
import java.util.List;

public class LessonCulturelleMediaPress extends AppCompatActivity {

    RecyclerView mRecyclerView;
    PressAreaAdapter mPressAreaAdapter;
    List<PressArea> pressArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_culturelle_media_press);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView)findViewById(R.id.rv_media_press);
        getPressArea();
        mPressAreaAdapter = new PressAreaAdapter(pressArea);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(LessonCulturelleMediaPress.this));
        mRecyclerView.setAdapter(mPressAreaAdapter);
    }

    public void getPressArea(){
        pressArea = new ArrayList<>(3);
        //include pressArea Nasional
        List<Press> press = new ArrayList<>(4);
        press.add(new Press("La Croix","http://www.la-croix.com"));
        press.add(new Press("La Tribune","http://www.latribune.fr"));
        press.add(new Press("•Le Figaro","http://www.lefigaro.fr"));
        press.add(new Press("Le Monde","http://www.lemonde.fr"));
        pressArea.add(new PressArea("Presse Quotidienne Nationale",press));

        //include pressArea Regional
        List<Press> pressRegional = new ArrayList<>(4);
        pressRegional.add(new Press("La Voix du Nord","http://www.lavoixdunord.fr"));
        pressRegional.add(new Press("La Midi Libre","http://www.la-croix.com"));
        pressRegional.add(new Press("La Parisien","http://www.leparisien.fr"));
        pressRegional.add(new Press("Nice Matin","http://www.nicematin.fr"));
        pressArea.add(new PressArea("Presse Quotidienne Régionale",pressRegional));

        //include pressArea Umum
        List<Press> pressGeneral = new ArrayList<>(3);
        pressGeneral.add(new Press("•L’Express","http://www.lexpress.com"));
        pressGeneral.add(new Press("Le Nouvel Observateur","http://www.nouvelobs.com"));
        pressGeneral.add(new Press("Le Point","http://www.lepoint.fr"));
        pressArea.add(new PressArea("Presse Hebdomadaire Généraliste",pressGeneral));
    }
}
