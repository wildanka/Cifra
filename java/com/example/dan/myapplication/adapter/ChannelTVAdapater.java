package com.example.dan.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dan.myapplication.ExerciseMenu;
import com.example.dan.myapplication.ExerciseMenuAdapter;
import com.example.dan.myapplication.R;
import com.example.dan.myapplication.model.ChannelTV;

import java.util.List;

/**
 * Created by DAN on 11/6/2017.
 */

public class ChannelTVAdapater extends RecyclerView.Adapter<ChannelTVAdapater.ChannelTVViewHolder> {
    private Context mContext;
    private List<ChannelTV> channelTVList;

    public ChannelTVAdapater(Context mContext, List<ChannelTV> channelTVList) {
        this.mContext = mContext;
        this.channelTVList = channelTVList;
    }

    @Override
    public ChannelTVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and return the viewHolder
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_item_press_tv,null);
        return new ChannelTVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ChannelTVViewHolder holder, int position) {
        //get exerciseMenu on specified position
        ChannelTV channelTV = channelTVList.get(position);

        //binding data with the viewHolder views
        holder.tvNamaChannel.setText(channelTV.getName());
        holder.tvUrlChannel.setText(channelTV.getUrlLink());
    }

    @Override
    public int getItemCount() {
        return channelTVList.size();
    }


    class ChannelTVViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaChannel;
        TextView tvUrlChannel;

        public ChannelTVViewHolder(View itemView) {
            super(itemView);
            tvNamaChannel = (TextView) itemView.findViewById(R.id.list_item_presstv_namachannel);
            tvUrlChannel = (TextView) itemView.findViewById(R.id.list_item_presstv_url);
        }
    }
}
