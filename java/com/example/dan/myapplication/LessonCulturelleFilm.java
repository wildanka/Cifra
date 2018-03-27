package com.example.dan.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dan.myapplication.adapter.FilmAngkatanAdapter;
import com.example.dan.myapplication.adapter.PressAreaAdapter;
import com.example.dan.myapplication.model.Film;
import com.example.dan.myapplication.model.FilmAngkatan;

import java.util.ArrayList;
import java.util.List;

public class LessonCulturelleFilm extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FilmAngkatanAdapter mFilmAngkatanAdapter;
    List<FilmAngkatan> mFilmAngkatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_culturelle_film);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_film_angkatan);
        generateDataFilm();
        mFilmAngkatanAdapter = new FilmAngkatanAdapter(mFilmAngkatan);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(LessonCulturelleFilm.this));
        mRecyclerView.setAdapter(mFilmAngkatanAdapter);
    }

    public void generateDataFilm(){
        mFilmAngkatan = new ArrayList<>();

        //1
        List<Film> f1 = new ArrayList<>();
        f1.add(new Film("Pauvre Piettot","(1892)"));
        f1.add(new Film("L’arrosuer Arrosé","(1895)"));
        f1.add(new Film("Sarah Bernhardt ","(1900)"));
        f1.add(new Film("Rêve et Réalité","(1901)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1910",f1));

        //2
        List<Film> f2 = new ArrayList<>();
        f2.add(new Film("Barrabas de Louis Feuillade","(1920)"));
        f2.add(new Film("L’Inhumaine","(1924)"));
        f2.add(new Film("Belphégor  ","(1927)"));
        f2.add(new Film("La Marche Nuptiale ","(1929)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1920",f2));

        //3
        List<Film> f3 = new ArrayList<>();
        f3.add(new Film("Dans les Rues","(1933)"));
        f3.add(new Film("À Venise, Une Nuit","(1937)"));
        f3.add(new Film("Barnabé","(1938)"));
        f3.add(new Film("Le corsaire","(1939)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1930",f3));

        //4
        List<Film> f4 = new ArrayList<>();
        f4.add(new Film("L’Arlésienne","(1942)"));
        f4.add(new Film("Boule de Soif","(1945)"));
        f4.add(new Film("L’Amour Autour de la Maison","(1947)"));
        f4.add(new Film("La Beauté du Diable","(1949)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1940",f4));

        //5
        List<Film> f5 = new ArrayList<>();
        f5.add(new Film("L’Aiguille Rouge","(1951)"));
        f5.add(new Film("Julietta","(1953)"));
        f5.add(new Film("Cela S’appelle l’Aurore","(1956)"));
        f5.add(new Film("À Double Tour","(1959)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1950",f5));

        //6
        List<Film> f6 = new ArrayList<>();
        f6.add(new Film("Adieu Philippine","(1962)"));
        f6.add(new Film("Le Bonheur","(1964)"));
        f6.add(new Film("Belle de Jour ","(1967)"));
        f6.add(new Film("L’Enfant Sauvage","(1969)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1960",f6));

        //7
        List<Film> f7 = new ArrayList<>();
        f7.add(new Film("L'Aveu","(1970)"));
        f7.add(new Film("La Femme en Bleu","(1973)"));
        f7.add(new Film("Barocco ","(1976)"));
        f7.add(new Film("La Chambre Verte","(1978)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1970",f7));

        //8
        List<Film> f8 = new ArrayList<>();
        f8.add(new Film("Beau-Pére","(1981)"));
        f8.add(new Film("Escalier","(1985)"));
        f8.add(new Film("L’Amoureuse  ","(1987)"));
        f8.add(new Film("Deux","(1989)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1980",f8));

        //9
        List<Film> f9 = new ArrayList<>();
        f9.add(new Film("Atlantis","(1991)"));
        f9.add(new Film("Hélas pour Moi","(1993)"));
        f9.add(new Film("La Belle Verte","(1996)"));
        f9.add(new Film("Jeanne d’Arc","(1999)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 1990",f9));

        //10
        List<Film> f10 = new ArrayList<>();
        f10.add(new Film("La Fleur du Mal ","(2003)"));
        f10.add(new Film("Cœurs ","(2006)"));
        f10.add(new Film("Astérix et Obélix aux Jeux Olympiques","(2008)"));
        f10.add(new Film("Bellamy ","(2009)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 2000",f10));

        //4
        List<Film> f11 = new ArrayList<>();
        f11.add(new Film("Papa ou Maman ","(2015)"));
        f11.add(new Film("Le Petit Prince ","(2015)"));
        f11.add(new Film("Retour Chez Ma Mère  ","(2016)"));
        f11.add(new Film("Marie Francine","(2018)"));
        mFilmAngkatan.add(new FilmAngkatan("Les films française sortis avant 2010",f11));

    }
}
