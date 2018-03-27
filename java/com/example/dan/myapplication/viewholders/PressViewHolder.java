package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by DAN on 11/6/2017.
 */

public class PressViewHolder extends ChildViewHolder {

    private TextView pressName;
    private TextView pressUrl;
    public PressViewHolder(View itemView) {
        super(itemView);
        pressName = (TextView) itemView.findViewById(R.id.list_item_pressname);
        pressUrl = (TextView) itemView.findViewById(R.id.list_item_presslink);
    }

    public void setPressName(String namaPress) {
        pressName.setText(namaPress);
    }

    public void setPressUrl(String url){
        pressUrl.setText(url);
    }
}
