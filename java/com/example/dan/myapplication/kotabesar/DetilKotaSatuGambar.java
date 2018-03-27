package com.example.dan.myapplication.kotabesar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myapplication.R;

public class DetilKotaSatuGambar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_kota_satu_gambar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create a bundle of extras
        Bundle bundle = getIntent().getExtras();

        //pass datastring to Variables
        String villeName = bundle.getString("villaName");
        String villeID = bundle.getString("villaID");
        String villeMateri = bundle.getString("materi");
        int villeImage1 = bundle.getInt("gambar");

        //assign to xml

        TextView tvNamaKota = (TextView) findViewById(R.id.tv_nama_kota_besar_1_gambar);
        TextView tvMateri = (TextView) findViewById(R.id.tv_materi_grande_ville_1_gambar);
        ImageView ivDetailKota1 = (ImageView) findViewById(R.id.iv_grande_ville_1_gambar);
        tvMateri.setText(villeMateri);
        tvNamaKota.setText(villeName);
        ivDetailKota1.setImageDrawable(this.getResources().getDrawable(villeImage1));
        Toast.makeText(this, villeName,Toast.LENGTH_SHORT).show();
    }

}
