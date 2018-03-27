package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by DAN on 11/6/2017.
 */

public class FilmAngkatanViewHolder extends GroupViewHolder {
    private TextView tvFilmAngkatan;

    public FilmAngkatanViewHolder(View itemView) {
        super(itemView);
        tvFilmAngkatan = (TextView) itemView.findViewById(R.id.list_item_film_angkatan);
    }

    public void setTvFilmAngkatan(String tvFilmAngkatan) {
        this.tvFilmAngkatan.setText(tvFilmAngkatan);
    }
}
