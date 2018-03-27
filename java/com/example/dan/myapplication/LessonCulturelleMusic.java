package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.adapter.MusisiPerGenreAdapter;
import com.example.dan.myapplication.model.MusisiPerGenre;

import java.util.ArrayList;
import java.util.List;

public class LessonCulturelleMusic extends AppCompatActivity {

    RecyclerView rv;
    MusisiPerGenreAdapter musisiPerGenreAdapter;
    List<MusisiPerGenre> mMusisiPerGenreList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_culturelle_music);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //invoke recyclerView from rv_list
        rv = (RecyclerView) findViewById(R.id.rv_lesson_musician);
        rv.setHasFixedSize(true);

        //set layout manager for recyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(linearLayoutManager);

        //generate data
        generateData();

        //create recycleView adapter
        MusisiPerGenreAdapter adapter = new MusisiPerGenreAdapter(this, mMusisiPerGenreList);

        //invoking adapter for recyclerView
        rv.setAdapter(adapter);

    }

    private void generateData(){
        mMusisiPerGenreList = new ArrayList<>();

        //1
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Pricipaux Compositeurs",
                        getString(R.string.adam_dela_halle),
                        getString(R.string.g_machaut),
                        getString(R.string.perotin),
                        R.drawable.adam_de_la_halle_materi_1,
                        R.drawable.guillaume_de_machaut_materi_1,
                        R.drawable.perotin_materi_1)
        );
        //2
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Renaissance",
                        getString(R.string.josquin),
                        getString(R.string.g_dufay),
                        getString(R.string.roland),
                        R.drawable.josquin_des_pres_materi_1,
                        R.drawable.guillaume_dufay_materi_1,
                        R.drawable.roland_de_lassus_materi_1)
        );
        //3
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Baroque",
                        getString(R.string.francois),
                        getString(R.string.marin_marais),
                        getString(R.string.jp_rameau),
                        R.drawable.francois_couperin_materi_1,
                        R.drawable.marin_marais_materi_1,
                        R.drawable.jean_philippe_rameau_materi_1)
        );
        //4
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Classique",
                        getString(R.string.luigi_cherubini),
                        getString(R.string.nicolas_dalayrac),
                        getString(R.string.andre_gretry),
                        R.drawable.luigi_cherubini_materi_1,
                        R.drawable.nicolas_dalayrac_materi_1,
                        R.drawable.andr_grtry_materi1)
        );
        //5
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Romantique",
                        getString(R.string.h_berlios),
                        getString(R.string.g_bizet),
                        getString(R.string.e_chabrier),
                        R.drawable.hector_berlioz_materi_1,
                        R.drawable.georges_bizet_materi_1,
                        R.drawable.emmanuel_chabrier_materi_1)
        );
        //6
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Moderne",
                        getString(R.string.a_caplet),
                        getString(R.string.c_debussy),
                        getString(R.string.ad_clos),
                        R.drawable.andre_caplet_materi_1,
                        R.drawable.claude_debussy_materi_1,
                        R.drawable.alfred_desenclos_materi_1)
        );
        //7
        mMusisiPerGenreList.add(
                new MusisiPerGenre(
                        "Compositeurs de la Musique Contemporaine",
                        getString(R.string.p_boules),
                        getString(R.string.g_conneson),
                        getString(R.string.p_dusapin),
                        R.drawable.pierre_boulez_materi_1,
                        R.drawable.guillaume_connesson_materi_1,
                        R.drawable.pascal_dusapin_materi_1)
        );

    }
}
