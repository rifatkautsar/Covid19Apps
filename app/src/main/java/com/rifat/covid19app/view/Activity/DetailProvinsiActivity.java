package com.rifat.covid19app.view.Activity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rifat.covid19app.Adapter.IndoProvinsiAdapter;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.R;
import com.rifat.covid19app.ViewModel.ProvinsiIndonesiaViewModel;

import java.util.ArrayList;

/**
 * Created by Rifat on 10/5/21.
 */
public class DetailProvinsiActivity extends AppCompatActivity {

    private IndoProvinsiAdapter indoProvinsiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprovinsi);

        RecyclerView recyclerView = findViewById(R.id.rvProvinsi);
        indoProvinsiAdapter = new IndoProvinsiAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(indoProvinsiAdapter);

        getDataProvinsi();

    }

    private void getDataProvinsi() {

        ProvinsiIndonesiaViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ProvinsiIndonesiaViewModel.class);
        viewModel.setProvinsiIndonesia();
        viewModel.getSummaryData().observe(this, new Observer<ArrayList<ProvinsiModel>>() {
            @Override
            public void onChanged(ArrayList<ProvinsiModel> provinsiModels) {
                indoProvinsiAdapter.setIndoList(provinsiModels);
            }
        });
    }
}
