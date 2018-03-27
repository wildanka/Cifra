package com.example.dan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dan.myapplication.exercise.pirctextquiz.PicNameQuizSeven;
import com.example.dan.myapplication.exercise.pirctextquiz.PicNameQuizSix;
import com.example.dan.myapplication.exercise.pirctextquiz.PicNameQuizTwo;
import com.example.dan.myapplication.exercise.textonly.TextOnlyQuizOne;
import com.example.dan.myapplication.exercise.textonly.TextOnlyQuizFive;
import com.example.dan.myapplication.exercise.textpicquiz.QuizFour;
import com.example.dan.myapplication.exercise.textpicquiz.QuizThree;
import com.example.dan.myapplication.exercise.truefalse.QuizEight;

import java.util.List;

/**
 * Created by DAN on 11/4/2017.
 */

public class ExerciseMenuAdapter extends RecyclerView.Adapter<ExerciseMenuAdapter.ExerciseViewHolder>{

    private Context mContext;
    private List<ExerciseMenu> exerciseMenuList;

    public ExerciseMenuAdapter(Context mContext, List<ExerciseMenu> exerciseMenuList) {
        this.mContext = mContext;
        this.exerciseMenuList = exerciseMenuList;
    }

    @Override
    public ExerciseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and return the viewHolder
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_exercise,null);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExerciseViewHolder holder, int position) {
        //get exerciseMenu on specified position
        final ExerciseMenu exerciseMenu = exerciseMenuList.get(position);

        //binding data with the viewHolder views
        //holder.tvExerciseTitle.setText(exerciseMenu.getExerciseTitle());
        holder.imageView.setImageDrawable(mContext.getResources().getDrawable(exerciseMenu.getImage()));

        holder.linlayExerciseMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(exerciseMenu.getExerciseTitle()=="Exercise 1"){
                    Intent in = new Intent(mContext, TextOnlyQuizOne.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 2"){
                    Intent in = new Intent(mContext, PicNameQuizTwo.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 3"){
                    Intent in = new Intent(mContext, QuizThree.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 4"){
                    Intent in = new Intent(mContext, QuizFour.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 5"){
                    Intent in = new Intent(mContext, TextOnlyQuizFive.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 6"){
                    Intent in = new Intent(mContext, PicNameQuizSix.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 7"){
                    Intent in = new Intent(mContext, PicNameQuizSeven.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
                if(exerciseMenu.getExerciseTitle()=="Exercise 8"){
                    Intent in = new Intent(mContext, QuizEight.class);
                    in.putExtra("exerciseSection",1);
                    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(in);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return exerciseMenuList.size();
    }

    class ExerciseViewHolder extends RecyclerView.ViewHolder{
        TextView tvExerciseTitle;
        ImageView imageView;
        LinearLayout linlayExerciseMenu;

        public ExerciseViewHolder(View itemView) {
            super(itemView);

            linlayExerciseMenu = itemView.findViewById(R.id.btnLinearLayoutExerciseMenu);
            //tvExerciseTitle = itemView.findViewById(R.id.tvExerciseTitle);
            imageView = itemView.findViewById(R.id.imageViewExercise);
        }
    }

}
