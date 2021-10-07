package com.rifat.covid19app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.R;

import java.util.ArrayList;

/**
 * Created by Rifat on 10/6/21.
 */
public class IndoProvinsiAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

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
        View view = LayoutInflater.from(context).inflate(R.layout.activity_detailprovinsi,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return indoList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}
