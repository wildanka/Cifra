package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by DAN on 11/7/2017.
 */

public class FamiliMateriViewHolder extends GroupViewHolder{

    private TextView tvJudulMateri;
    public FamiliMateriViewHolder(View itemView) {
        super(itemView);
        tvJudulMateri = (TextView) itemView.findViewById(R.id.list_item_famili_materi_name);
    }

    public void setTvJudulMateri(String tvJudulMateri) {
        this.tvJudulMateri.setText(tvJudulMateri);
    }
}
