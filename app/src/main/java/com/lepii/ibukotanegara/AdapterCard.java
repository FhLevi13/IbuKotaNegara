package com.lepii.ibukotanegara;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.ClassViewHolder> {
    private ArrayList<ModelIbukota> dataIbukota;
    private Context ctx;

    public AdapterCard(ArrayList<ModelIbukota> dataIbukota, Context ctx) {
        this.dataIbukota = dataIbukota;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);

        return new ClassViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {
        ModelIbukota ibukota = dataIbukota.get(position);
        holder.tvNama.setText(ibukota.getNama());
        holder.tvTentang.setText(ibukota.getTentang());

        Glide
                .with(ctx)
                .load(ibukota.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String xNama, xTentang, xFoto;

                xNama = ibukota.getNama();
                xTentang = ibukota.getTentang();
                xFoto = ibukota.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xTentang", xTentang);
                kirim.putExtra("xFoto", xFoto);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataIbukota.size();
    }

    public class ClassViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama, tvTentang;

        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);

            ivFoto = itemView.findViewById(R.id.iv_foto);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
        }
    }
}
