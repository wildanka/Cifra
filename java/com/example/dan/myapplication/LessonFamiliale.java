package com.example.dan.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.adapter.FamiliMateriAdapter;
import com.example.dan.myapplication.model.FamiliMateri;
import com.example.dan.myapplication.model.FamiliSubMateri;

import java.util.ArrayList;
import java.util.List;

public class LessonFamiliale extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FamiliMateri> familiMateriList;
    FamiliMateriAdapter mFamiliMateriAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_familiale);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //invoke the recyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_famili);
        //get data
        generateData();

        //instance new adapter
        mFamiliMateriAdapter = new FamiliMateriAdapter(familiMateriList);
        //setLayoutManager for the recyclerView
        mRecyclerView.setLayoutManager(new LinearLayoutManager(LessonFamiliale.this));
        //inflate Adapter
        mRecyclerView.setAdapter(mFamiliMateriAdapter);
    }

    private void generateData(){
        familiMateriList = new ArrayList<>();
        //insert the materi
        List<FamiliSubMateri> sub1 = new ArrayList<>();
        sub1.add(new FamiliSubMateri(
                "-\tOn se marie tard: 28 ans pour les femmes et 30 ans pour les hommes\n" +
                        "-\tAvant de se marier, on vit souvent ensemble sans engagement official\n" +
                        "-\tLe marriage religieux, les couples se marie à l’église, est devenu moins frequent\n" +
                        "-\tAujoud’hui. Le marriage est l’occasion d’une fête\n" +
                        "-\tTraditionnellement, les mariés reçoivent des cadeaux, souvent choisis sur une liste établie par eux à l’avance: la liste de marriage\n"
        ));
        familiMateriList.add(new FamiliMateri("1.\tLe marriage",sub1));

        //2
        List<FamiliSubMateri> sub2 = new ArrayList<>();
        sub2.add(new FamiliSubMateri(
                "-\tLes couples qui vivent en cohabitation sont plus nombreux que les couples mariés\n" +
                        "-\tPès de 15% des couple préfèrennt ce mode de vie (l’union libre) surtout dans les grandes villes et 43% des enfants naissent hors marriage\n"
        ));
        familiMateriList.add(new FamiliMateri("2.\tL’union libre",sub2));

        //3
        List<FamiliSubMateri> sub3 = new ArrayList<>();
        sub3.add(new FamiliSubMateri(
                "-\tEn 1999, a été créé le pacte civil de solidarité (PACS), contrat conclu entre deux personnes majeures, de sexe different ou de même sexe, pour organizer leur vie commune.\n" +
                        "-\tEn 2002, on estime approximativement que huit PACS ont été signés pour cent mariages\n"
        ));
        familiMateriList.add(new FamiliMateri("3.\tLe pacs",sub3));

        //4
        List<FamiliSubMateri> sub4 = new ArrayList<>();
        sub4.add(new FamiliSubMateri(
                "-\tDans une famille monoparentale, un adulte (souvent la mère) vit seul avec ses enfant\n" +
                        "-\tC’est le cas après un divorce, après la mort du conjoint, ou quand un adulte célibataire élève seul un enfant\n" +
                        "-\tEn France, aujourd’hui, plus d’un enfant sur dix (1:10) vit dans une famille monoparentale\n"
        ));
        familiMateriList.add(new FamiliMateri("4.\tLes familles monoparentales",sub4));

        //5
        List<FamiliSubMateri> sub5 = new ArrayList<>();
        sub5.add(new FamiliSubMateri(
                "-\t40% des mariages en France se terminent par un divorce (50% à Paris)\n" +
                        "-\tOn parle de famille recompose quand les enfants du nouveau marriage vivent avec leurs demi-frères et demi-sœurs\n"
        ));
        familiMateriList.add(new FamiliMateri("5.\tDivorce et familles recomposées",sub5));

        //6
        List<FamiliSubMateri> sub6 = new ArrayList<>();
        sub6.add(new FamiliSubMateri(
                "-\tToutes les familles d’au moins deux enfants reçoivent des allocation familliales\n" +
                        "-\tEn 2003, les allocations est environ 110 euros par mois pour deux enfants et 250 euros pour trois enfants\n" +
                        "-\tD’autres aides sont attribuées\n" +
                        "\t\t•\tUne reduction d’impôt sur le revenue\n" +
                        "\t\t•\tUne allocation logement\n" +
                        "\t\t•\tUne allocation de rentrée scolaire\n" +
                        "\t\t•\tUne allocation parentale d’éducation\n"
        ));
        familiMateriList.add(new FamiliMateri("6.\tLes aides financières",sub6));
    }
}
