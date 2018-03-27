package com.example.dan.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.model.FamiliMateri;
import com.example.dan.myapplication.model.FamiliSubMateri;
import com.example.dan.myapplication.model.Press;
import com.example.dan.myapplication.viewholders.FamiliMateriViewHolder;
import com.example.dan.myapplication.viewholders.FamiliSubMateriViewHolder;
import com.example.dan.myapplication.viewholders.PressAreaViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by DAN on 11/7/2017.
 */

public class FamiliMateriAdapter extends ExpandableRecyclerViewAdapter<FamiliMateriViewHolder,FamiliSubMateriViewHolder> {

    public FamiliMateriAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public FamiliMateriViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_famili_materi,parent,false);
        return new FamiliMateriViewHolder(view);
    }

    @Override
    public FamiliSubMateriViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_famili_submateri,parent,false);
        return new FamiliSubMateriViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(FamiliSubMateriViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        FamiliSubMateri familiSubMateri = (FamiliSubMateri) group.getItems().get(childIndex);
        holder.setTvIsiMateri(familiSubMateri.getIsiSubMateri());
    }

    @Override
    public void onBindGroupViewHolder(FamiliMateriViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setTvJudulMateri(group.getTitle());
    }
}
