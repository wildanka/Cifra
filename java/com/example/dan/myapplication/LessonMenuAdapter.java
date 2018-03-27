package com.example.dan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myapplication.kotabesar.LessonGrandeVilles;
import com.example.dan.myapplication.presentation.LessonPresentationList;
import com.example.dan.myapplication.scolaire.LessonScolaire;

import java.util.List;

/**
 * Created by DAN on 11/3/2017.
 */
/**
 * We couldn't come up with a good name for this class. Then, we realized
 * that this lesson is about RecyclerView.
 *
 * RecyclerView... Recycling... Saving the planet? Being green? Anyone?
 * #crickets
 * wkwkwkwk
 * Avoid unnecessary garbage collection by using RecyclerView and ViewHolders.
 *
 * If you don't like our puns, we named this Adapter GreenAdapter because its
 * contents are green.
 */

public class LessonMenuAdapter extends RecyclerView.Adapter<LessonMenuAdapter.LessonMenuViewHolder> {
    Context mContext;
    List<LessonMenu> listLessonMenu;

    public LessonMenuAdapter(Context mContext, List<LessonMenu> lessonMenuList) {
        this.mContext = mContext;
        this.listLessonMenu = lessonMenuList;
    }

    @Override
    public LessonMenuAdapter.LessonMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and return theviewHolder
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_lesson,null);
        return new LessonMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LessonMenuAdapter.LessonMenuViewHolder holder, int position) {
        final LessonMenu selectedLessonMenu = listLessonMenu.get(position);
        String CARDVIEW_LESSON_TITLE = (position+1)+". "+selectedLessonMenu.getLessonJudul();
        //binding data with the viewHolder views
        holder.tvLessonTitle.setText(CARDVIEW_LESSON_TITLE);
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(selectedLessonMenu.getImageLesson()));

        holder.imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 1"){
                    Intent in = new Intent(mContext, LessonPresentationList.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 2"){
                    Intent in = new Intent(mContext, LessonCulturelle.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 3"){
                    Intent in = new Intent(mContext, LessonEconomique.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 4"){
                    Intent in = new Intent(mContext, LessonFamiliale.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 5"){
                    Intent in = new Intent(mContext, LessonPolitique.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 6"){
                    Intent in = new Intent(mContext, LessonQuotidienneList.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }else if (selectedLessonMenu.getLessonMenuTitle()=="Lesson 7"){
                    Intent in = new Intent(mContext, LessonScolaire.class);
                    in.putExtra("lessonTitle",selectedLessonMenu.getLessonMenuTitle());
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }


                Toast.makeText(mContext, selectedLessonMenu.getLessonMenuTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listLessonMenu.size();
    }


    class LessonMenuViewHolder extends RecyclerView.ViewHolder{
        TextView tvLessonTitle;
        ImageView imageView;

        public LessonMenuViewHolder(View itemView) {
            super(itemView);

            tvLessonTitle = itemView.findViewById(R.id.tvLessonMenuItem);
            imageView = itemView.findViewById(R.id.imageViewLessonMenu);
        }
    }
}


