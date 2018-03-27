package com.example.dan.myapplication.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by DAN on 11/7/2017.
 */

public class FamiliSubMateriViewHolder extends ChildViewHolder {

    private TextView tvIsiMateri;
    public FamiliSubMateriViewHolder(View itemView) {
        super(itemView);
        tvIsiMateri = (TextView) itemView.findViewById(R.id.list_item_famili_submateri);
    }

    public void setTvIsiMateri(String tvIsiMater) {
        this.tvIsiMateri.setText(tvIsiMater);
    }
}
