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

public class DetilKotaTigaGambar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_kota_tiga_gambar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create a bundle of extras
        Bundle bundle = getIntent().getExtras();

        //pass datastring to Variables
        String villeName = bundle.getString("villaName");
        String villeID = bundle.getString("villaID");
        String villeMateri = bundle.getString("materi");
        int villeImage1 = bundle.getInt("gambar1");
        int villeImage2 = bundle.getInt("gambar2");
        int villeImage3 = bundle.getInt("gambar3");

        //assign to xml

        TextView tvNamaKota = (TextView) findViewById(R.id.tv_nama_kota_besar_3_gambar);
        TextView tvMateri = (TextView) findViewById(R.id.tv_materi_grande_ville_3_gambar);
        ImageView ivDetailKota1 = (ImageView) findViewById(R.id.iv_grande_ville_3_gambar1);
        ImageView ivDetailKota2 = (ImageView) findViewById(R.id.iv_grande_ville_3_gambar2);
        ImageView ivDetailKota3 = (ImageView) findViewById(R.id.iv_grande_ville_3_gambar3);
        tvMateri.setText(villeMateri);
        tvNamaKota.setText(villeName);
        ivDetailKota1.setImageDrawable(this.getResources().getDrawable(villeImage1));
        ivDetailKota2.setImageDrawable(this.getResources().getDrawable(villeImage2));
        ivDetailKota3.setImageDrawable(this.getResources().getDrawable(villeImage3));
        Toast.makeText(this, villeName,Toast.LENGTH_SHORT).show();
    }

}
