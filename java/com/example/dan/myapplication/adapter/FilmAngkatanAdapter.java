package com.example.dan.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.model.Film;
import com.example.dan.myapplication.model.Press;
import com.example.dan.myapplication.viewholders.FilmAngkatanViewHolder;
import com.example.dan.myapplication.viewholders.FilmViewHolder;
import com.example.dan.myapplication.viewholders.PressAreaViewHolder;
import com.example.dan.myapplication.viewholders.PressViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by DAN on 11/6/2017.
 */

public class FilmAngkatanAdapter extends ExpandableRecyclerViewAdapter<FilmAngkatanViewHolder, FilmViewHolder> {

    public FilmAngkatanAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public FilmAngkatanViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_film_angkatan, parent,false);
        return new FilmAngkatanViewHolder(view);
    }

    @Override
    public FilmViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_film,parent,false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(FilmViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Film film = (Film) group.getItems().get(childIndex);
        holder.setTvJudulFilm(film.getJudulFilm());
        holder.setTvTahunFilm(film.getTahun());
    }

    @Override
    public void onBindGroupViewHolder(FilmAngkatanViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setTvFilmAngkatan(group.getTitle());
    }
}
