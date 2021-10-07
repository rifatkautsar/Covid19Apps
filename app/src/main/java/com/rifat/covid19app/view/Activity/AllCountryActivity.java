package com.rifat.covid19app.view.Activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rifat.covid19app.Adapter.AllCountryAdapter;
import com.rifat.covid19app.Model.AllCountryModel;
import com.rifat.covid19app.R;
import com.rifat.covid19app.ViewModel.AllCountryDataViewModel;

import java.util.ArrayList;

/**
 * Created by Rifat on 10/7/21.
 */
public class AllCountryActivity extends AppCompatActivity {

    private AllCountryAdapter allCountryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailworlddata);

        RecyclerView recyclerView = findViewById(R.id.rvAllcountry);
        allCountryAdapter = new AllCountryAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(allCountryAdapter);

        getDataAllCountry();
    }

    private void getDataAllCountry() {
        AllCountryDataViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(AllCountryDataViewModel.class);
        viewModel.setAllCountry();
        viewModel.getSummaryData().observe(this, new Observer<ArrayList<AllCountryModel>>() {
            @Override
            public void onChanged(ArrayList<AllCountryModel> allCountryModels) {
                allCountryAdapter.setCountryList(allCountryModels);
                Log.d(String.valueOf(allCountryModels), "responsee");
            }
        });
    }
}
