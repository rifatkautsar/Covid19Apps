package com.rifat.covid19app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.R;

import java.util.ArrayList;

/**
 * Created by Rifat on 10/6/21.
 */
public class IndoProvinsiAdapter extends RecyclerView.Adapter<IndoProvinsiAdapter.ViewHolder> {

    private final ArrayList<ProvinsiModel> indoList = new ArrayList<>();
    private final Context context;

    public IndoProvinsiAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<ProvinsiModel> getIndoList() {
        return indoList;
    }

    public void setIndoList(ArrayList<ProvinsiModel> indoItem) {
        if (indoList != null) {
            if (indoList.size() > 0) {
                indoList.clear();
            }
            indoList.addAll(indoItem);
        }
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public IndoProvinsiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemdetailprovinsi,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IndoProvinsiAdapter.ViewHolder holder, int position) {

        holder.tvPositif.setText(String.valueOf(indoList.get(position).getAttributesProv().getConfirmed()));
        holder.tvProvinsi.setText(String.valueOf(indoList.get(position).getAttributesProv().getProvinsi()));
    }

    @Override
    public int getItemCount() {
        return indoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvPositif;
        final TextView tvSembuh;
        final TextView tvMeninggal;
        final TextView tvProvinsi;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPositif = itemView.findViewById(R.id.tvKasusProvPositif);
            tvSembuh = itemView.findViewById(R.id.tvKasusProvSembuh);
            tvMeninggal = itemView.findViewById(R.id.tvMeninggal);
            tvProvinsi = itemView.findViewById(R.id.tvProvinsi);

        }
    }
}
