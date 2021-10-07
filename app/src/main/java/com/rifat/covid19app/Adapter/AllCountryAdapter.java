package com.rifat.covid19app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rifat.covid19app.Model.AllCountryModel;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.R;

import java.util.ArrayList;

/**
 * Created by Rifat on 10/8/21.
 */
public class AllCountryAdapter extends RecyclerView.Adapter<AllCountryAdapter.ViewHolder>{

    private final ArrayList<AllCountryModel> allCountryModels = new ArrayList<>();

    private final Context context;

    public AllCountryAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<AllCountryModel> getAllCountryList() {
        return getAllCountryList();
    }

    public void setCountryList(ArrayList<AllCountryModel> indoItem) {
        if (allCountryModels != null) {
            if (allCountryModels.size() > 0) {
                allCountryModels.clear();
            }
            allCountryModels.addAll(indoItem);
        }
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AllCountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_all_country,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCountryAdapter.ViewHolder holder, int position) {

        holder.tvnamaCountry.setText(String.valueOf(getAllCountryList().get(0).getCountry()));
    }

    @Override
    public int getItemCount() {
       return allCountryModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView tvnamaCountry;
        final ImageView imgCuntry;




        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvnamaCountry= itemView.findViewById(R.id.tvNameCountry);
            imgCuntry = itemView.findViewById(R.id.imgAllcountry);


        }
    }
}
