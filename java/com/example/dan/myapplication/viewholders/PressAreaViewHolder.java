package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by DAN on 11/6/2017.
 */

public class PressAreaViewHolder extends GroupViewHolder {
    private TextView pressArea;

    public PressAreaViewHolder(View itemView) {
        super(itemView);
        pressArea = (TextView) itemView.findViewById(R.id.list_item_pressarea_name);
    }

    public void setPressArea(String name){
        pressArea.setText(name);
    }

    public TextView getPressArea() {
        return pressArea;
    }
}
