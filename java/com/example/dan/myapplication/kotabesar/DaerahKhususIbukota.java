package com.example.dan.myapplication.kotabesar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myapplication.R;

public class DaerahKhususIbukota extends AppCompatActivity {

    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daerah_khusus_ibukota);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //create a bundle of extras
        Bundle bundle = getIntent().getExtras();

        //pass datastring to Variables
        final String villeName = bundle.getString("villaName");
        final String villeID = bundle.getString("villaID");
        final String villeMateri = bundle.getString("materi");
        int villeImage1 = bundle.getInt("gambar");

        //assign to xml

        TextView tvNamaKota = (TextView) findViewById(R.id.tv_nama_dki);
        TextView tvMateri = (TextView) findViewById(R.id.tv_materi_grande_ville_dki);
        tvMateri.setText(villeMateri);
        tvNamaKota.setText(villeName);
        Toast.makeText(this, villeName,Toast.LENGTH_SHORT).show();
        Button btnGoToParis = (Button) findViewById(R.id.btn_go_to_paris);
        btnGoToParis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaerahKhususIbukota.this,DetilParis.class);
                intent.putExtra("villaID",villeID);
                intent.putExtra("villaName",villeName);
                intent.putExtra("materi",villeMateri);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                DaerahKhususIbukota.this.startActivity(intent);
            }
        });
    }

}
