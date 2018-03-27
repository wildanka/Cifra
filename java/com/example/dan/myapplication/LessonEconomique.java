package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class LessonEconomique extends AppCompatActivity {

    ExpandableTextView expandableTextView1, expandableTextView2;
    String longtext = "";
    String longtext2 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_economique);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadTeksMateri();
        //create expandableTextView
        /*expandableTextView1 = (ExpandableTextView) findViewById(R.id.expandableTextViewLessonEconomique);
        expandableTextView1.setText(longtext);

        expandableTextView2 = (ExpandableTextView) findViewById(R.id.expandableTextViewLessonEconomique2);
        expandableTextView2.setText(longtext2);*/


    }

    private void loadTeksMateri(){
        longtext = "1.\tLa France est présente en Europe et dans le monde par ses produit et ses services elle est la quatrième puissance économique mondiale\n" +
                "3.\tLa France importe les mêmes types de produits, ainsi que des matières premières (gaz, pétrole en particulier)\n" +
                "4.\tLes principaux partenaires commerciaux de la France sont les pays de l’Union européenne (l’Allemagne, l’Italie, l’Espagne, la Belgique, le Royaume-Uni, les États-Unis et le Japon\n" +
                "6.\tDe plus, un certain nombre d’entreprise françaises se sont installées à l’étranger\n";

        longtext2 = "2.\tLes produit que la France export le plus sont les produit industriels et manufactures et les services \n"+
                "5.\tLa France a créé des multinationals dans différents domains : Michelin (pneus); Danone (agroalimentaire); Renault (automobile); Accord (hôtellerie); Carrefour (grande distribution)\n";
    }
}
