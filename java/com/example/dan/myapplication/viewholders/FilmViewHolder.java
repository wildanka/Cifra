package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by DAN on 11/6/2017.
 */

public class FilmViewHolder extends ChildViewHolder {
    TextView tvJudulFilm;
    TextView tvTahunFilm;
    public FilmViewHolder(View itemView) {
        super(itemView);
        tvJudulFilm = (TextView) itemView.findViewById(R.id.tv_film_judul);
        tvTahunFilm = (TextView) itemView.findViewById(R.id.tv_film_tahun);
    }

    public void setTvJudulFilm(String tvJudulFilm) {
        this.tvJudulFilm.setText(tvJudulFilm);
    }

    public void setTvTahunFilm(String tvTahunFilm) {
        this.tvTahunFilm.setText(tvTahunFilm);
    }
}
