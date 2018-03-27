package com.example.dan.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.model.MusisiPerGenre;

import java.util.List;

/**
 * Created by DAN on 11/6/2017.
 */

public class MusisiPerGenreAdapter extends RecyclerView.Adapter<MusisiPerGenreAdapter.MusisiPerGenreViewHolder>{

    private Context mContext;
    private List<MusisiPerGenre> musisiPerGenreList;

    public MusisiPerGenreAdapter(Context mContext, List<MusisiPerGenre> musisiPerGenreList) {
        this.mContext = mContext;
        this.musisiPerGenreList = musisiPerGenreList;
    }

    @Override
    public MusisiPerGenreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_item_musician, null);
        return new MusisiPerGenreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MusisiPerGenreViewHolder holder, int position) {
        //get exerciseMenu on specified position
        MusisiPerGenre mpg = musisiPerGenreList.get(position);

        //binding data with the viewHolder views
        holder.tvMusicianGeneration.setText(mpg.getGenre());
        holder.tvMusisi1.setText(mpg.getName1());
        holder.tvMusisi2.setText(mpg.getName2());
        holder.tvMusisi3.setText(mpg.getName3());
        holder.ivMusisi1.setImageDrawable(mContext.getResources().getDrawable(mpg.getImage1()));
        holder.ivMusisi2.setImageDrawable(mContext.getResources().getDrawable(mpg.getImage2()));
        holder.ivMusisi3.setImageDrawable(mContext.getResources().getDrawable(mpg.getImage3()));
    }

    @Override
    public int getItemCount() {
        return musisiPerGenreList.size();
    }


    class MusisiPerGenreViewHolder extends RecyclerView.ViewHolder{

        TextView tvMusicianGeneration;
        TextView tvMusisi1;
        TextView tvMusisi2;
        TextView tvMusisi3;
        ImageView ivMusisi1;
        ImageView ivMusisi2;
        ImageView ivMusisi3;

        public MusisiPerGenreViewHolder(View itemView) {
            super(itemView);
            tvMusicianGeneration = (TextView) itemView.findViewById(R.id.tv_musician_generation);
            tvMusisi1 = (TextView) itemView.findViewById(R.id.tv_musician_name1);
            tvMusisi2 = (TextView) itemView.findViewById(R.id.tv_musician_name2);
            tvMusisi3 = (TextView) itemView.findViewById(R.id.tv_musician_name3);
            ivMusisi1 = (ImageView) itemView.findViewById(R.id.iv_musician_1);
            ivMusisi2 = (ImageView) itemView.findViewById(R.id.iv_musician_2);
            ivMusisi3 = (ImageView) itemView.findViewById(R.id.iv_musician_3);
        }
    }
}
