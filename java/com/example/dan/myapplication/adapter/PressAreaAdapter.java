package com.example.dan.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.model.Press;
import com.example.dan.myapplication.viewholders.PressAreaViewHolder;
import com.example.dan.myapplication.viewholders.PressViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by DAN on 11/6/2017.
 */

public class PressAreaAdapter extends ExpandableRecyclerViewAdapter<PressAreaViewHolder, PressViewHolder> {

    public PressAreaAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public PressAreaViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_pressarea,parent,false);
        return new PressAreaViewHolder(view);
    }

    @Override
    public PressViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_press,parent,false);
        return new PressViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(PressViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Press press = (Press) group.getItems().get(childIndex);
        holder.setPressName(press.getName());
        holder.setPressUrl(press.getUrlLink());
    }

    @Override
    public void onBindGroupViewHolder(PressAreaViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setPressArea(group.getTitle());
    }
}
