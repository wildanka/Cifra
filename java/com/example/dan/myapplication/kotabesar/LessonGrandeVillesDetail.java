package com.example.dan.myapplication.kotabesar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myapplication.R;

public class LessonGrandeVillesDetail extends AppCompatActivity {

    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_grande_villes_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create a bundle of extras
        Bundle bundle = getIntent().getExtras();

        //pass datastring to Variables
        String villeName = bundle.getString("villaName");
        String villeID = bundle.getString("villaID");
        String villeMateri = bundle.getString("materi");

        //assign to xml

        TextView tvNamaKota = (TextView) findViewById(R.id.tv_nama_kota_besar);
        TextView tvMateri = (TextView) findViewById(R.id.tv_materi_grande_ville_textOnly);
        tvMateri.setText(villeMateri);
        tvNamaKota.setText(villeName);
        Toast.makeText(this, villeName,Toast.LENGTH_SHORT).show();
    }

}
