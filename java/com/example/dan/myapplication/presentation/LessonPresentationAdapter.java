package com.example.dan.myapplication.presentation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.kotabesar.LessonGrandeVilles;
import com.example.dan.myapplication.presentation.materi.LaGeographie;
import com.example.dan.myapplication.presentation.materi.LeClimat;
import com.example.dan.myapplication.presentation.materi.LePaysages;
import com.example.dan.myapplication.presentation.materi.LeRelief;

import java.util.List;

/**
 * Created by DAN on 11/26/2017.
 */

public class LessonPresentationAdapter extends RecyclerView.Adapter<LessonPresentationAdapter.LessonPresentationViewHolder> {
    Context mContext;
    List<LessonPresentationModel> mPresentationList;

    public LessonPresentationAdapter(Context mContext, List<LessonPresentationModel> mPresentationList) {
        this.mContext = mContext;
        this.mPresentationList = mPresentationList;
    }

    @Override
    public LessonPresentationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and return theviewHolder
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_presentation,null);
        return new LessonPresentationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonPresentationViewHolder holder, int position) {
        final LessonPresentationModel selectedPresentationMenu = mPresentationList.get(position);
        String CARDVIEW_PRESENTATION_TITLE = (position+1)+". "+selectedPresentationMenu.getJudulPresentation();
        holder.tvPresentationTitle.setText(CARDVIEW_PRESENTATION_TITLE);
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(selectedPresentationMenu.getImagePresentation()));

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedPresentationMenu.getlessonPresentationTitle()=="Presentation 1"){
                    System.out.println(selectedPresentationMenu.getlessonPresentationTitle());
                    Intent in = new Intent(mContext, LaGeographie.class);
                    in.putExtra("lessonTitle",selectedPresentationMenu.getlessonPresentationTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedPresentationMenu.getlessonPresentationTitle()=="Presentation 2"){
                    Intent in = new Intent(mContext, LeRelief.class);
                    in.putExtra("lessonTitle",selectedPresentationMenu.getlessonPresentationTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedPresentationMenu.getlessonPresentationTitle()=="Presentation 3"){
                    Intent in = new Intent(mContext, LeClimat.class);
                    in.putExtra("lessonTitle",selectedPresentationMenu.getlessonPresentationTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedPresentationMenu.getlessonPresentationTitle()=="Presentation 4"){
                    Intent in = new Intent(mContext, LePaysages.class);
                    in.putExtra("lessonTitle",selectedPresentationMenu.getlessonPresentationTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedPresentationMenu.getlessonPresentationTitle()=="Presentation 5"){
                    Intent in = new Intent(mContext, LessonGrandeVilles.class);
                    in.putExtra("lessonTitle",selectedPresentationMenu.getlessonPresentationTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPresentationList.size();
    }


    class LessonPresentationViewHolder extends RecyclerView.ViewHolder{
        TextView tvPresentationTitle;
        ImageView imageView;
        LinearLayout linlayPresentation;
        public LessonPresentationViewHolder(View itemView) {
            super(itemView);
            linlayPresentation = itemView.findViewById(R.id.btn_linlay_presentation);
            tvPresentationTitle = itemView.findViewById(R.id.tv_presentation_name);
            imageView = itemView.findViewById(R.id.ivPresentation);
        }
    }
}
