package com.example.dan.myapplication.kotabesar.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myapplication.R;
import com.example.dan.myapplication.adapter.ChannelTVAdapater;
import com.example.dan.myapplication.kotabesar.DaerahKhususIbukota;
import com.example.dan.myapplication.kotabesar.DetilKotaDuaGambar;
import com.example.dan.myapplication.kotabesar.DetilKotaSatuGambar;
import com.example.dan.myapplication.kotabesar.DetilKotaTigaGambar;
import com.example.dan.myapplication.kotabesar.LessonGrandeVillesDetail;
import com.example.dan.myapplication.kotabesar.model.Ville;

import java.util.List;

/**
 * Created by DAN on 11/7/2017.
 */

public class VilleAdapter extends RecyclerView.Adapter<VilleAdapter.VilleViewHolder> {
    private Context mContext;
    private List<Ville> mVilleList;

    public VilleAdapter(Context mContext, List<Ville> mVilleList) {
        this.mContext = mContext;
        this.mVilleList = mVilleList;
    }


    @Override
    public VilleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_item_grande_villes,null);
        return new VilleAdapter.VilleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VilleViewHolder holder, int position) {
        //get exerciseMenu on specified position
        final Ville ville = mVilleList.get(position);

        //binding data with the viewHolder views
        holder.tvNamaKota.setText(ville.getVilleName());
        holder.ivImageKota.setImageDrawable(mContext.getResources().getDrawable(ville.getImageVille()));
        holder.btnLayoutVilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ville.getStatusMateri() == "textOnly"){
                    Intent intent = new Intent(mContext, LessonGrandeVillesDetail.class);
                    intent.putExtra("villaID",ville.getVilleID());
                    intent.putExtra("villaName",ville.getVilleName());
                    intent.putExtra("materi",ville.getVilleMateri());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    System.out.println(mContext);
                    mContext.startActivity(intent);
                }

                if(ville.getStatusMateri() == "bergambar1"){
                    Intent intent = new Intent(mContext, DetilKotaSatuGambar.class);
                    intent.putExtra("villaID",ville.getVilleID());
                    intent.putExtra("villaName",ville.getVilleName());
                    intent.putExtra("materi",ville.getVilleMateri());
                    intent.putExtra("gambar",ville.getImageDetailVilla1());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                    Toast.makeText(mContext, ville.getVilleName(),Toast.LENGTH_SHORT).show();
                }
                if(ville.getStatusMateri() == "bergambar2"){
                    Intent intent = new Intent(mContext, DetilKotaDuaGambar.class);
                    intent.putExtra("villaID",ville.getVilleID());
                    intent.putExtra("villaName",ville.getVilleName());
                    intent.putExtra("materi",ville.getVilleMateri());
                    intent.putExtra("gambar1",ville.getImageDetailVilla1());
                    intent.putExtra("gambar2",ville.getImageDetailVilla2());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                    Toast.makeText(mContext, ville.getVilleName(),Toast.LENGTH_SHORT).show();
                }
                if(ville.getStatusMateri() == "bergambar3"){
                    Intent intent = new Intent(mContext, DetilKotaTigaGambar.class);
                    intent.putExtra("villaID",ville.getVilleID());
                    intent.putExtra("villaName",ville.getVilleName());
                    intent.putExtra("materi",ville.getVilleMateri());
                    intent.putExtra("gambar1",ville.getImageDetailVilla1());
                    intent.putExtra("gambar2",ville.getImageDetailVilla2());
                    intent.putExtra("gambar3",ville.getImageDetailVilla3());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                    Toast.makeText(mContext, ville.getVilleName(),Toast.LENGTH_SHORT).show();
                }
                if(ville.getStatusMateri() == "DKI"){
                    Intent intent = new Intent(mContext, DaerahKhususIbukota.class);
                    intent.putExtra("villaID",ville.getVilleID());
                    intent.putExtra("villaName",ville.getVilleName());
                    intent.putExtra("materi",ville.getVilleMateri());
                    intent.putExtra("gambar1",ville.getImageDetailVilla1());
                    intent.putExtra("gambar2",ville.getImageDetailVilla2());
                    intent.putExtra("gambar3",ville.getImageDetailVilla3());
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                    Toast.makeText(mContext, ville.getVilleName(),Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(mContext, ville.getVilleName(),Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return mVilleList.size();
    }

    class VilleViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaKota;
        ImageView ivImageKota;
        LinearLayout btnLayoutVilles;
        public VilleViewHolder(View itemView) {
            super(itemView);
            tvNamaKota = (TextView) itemView.findViewById(R.id.tv_grande_ville_name);
            ivImageKota = (ImageView) itemView.findViewById(R.id.iv_grande_ville);
            btnLayoutVilles = (LinearLayout) itemView.findViewById(R.id.btnLayoutGrandeVilleName);
        }
    }
}
