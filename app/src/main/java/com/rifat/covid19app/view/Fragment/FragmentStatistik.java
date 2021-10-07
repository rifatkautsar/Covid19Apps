package com.rifat.covid19app.view.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.rifat.covid19app.Model.HomeModel;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.R;
import com.rifat.covid19app.ViewModel.StatistikIndonesiaViewModel;
import com.rifat.covid19app.view.Activity.DetailProvinsiActivity;

import java.util.ArrayList;
import java.util.List;


public class FragmentStatistik extends Fragment {

    String meninggal,positif,sembuh;
    TextView tvPositif,tvMeninggal,tvSembuh;
    List<ProvinsiModel> modelList;
    Button btnDetail;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_statistik, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        tvMeninggal = view.findViewById(R.id.tvMeninggal);
        tvSembuh = view.findViewById(R.id.tvSembuh);
        tvPositif = view.findViewById(R.id.tvPositif);

        btnDetail = view.findViewById(R.id.btnDetailProvinsi);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailProvinsiActivity.class);
                startActivity(intent);
            }
        });

        getDataIndonesia();

    }

    private void getDataIndonesia () {
        StatistikIndonesiaViewModel viewModel = new ViewModelProvider(this,
                new ViewModelProvider.NewInstanceFactory()).get(StatistikIndonesiaViewModel.class);
        viewModel.setStatistikIndonesia();
        viewModel.getSummaryData().observe(this, new Observer<ArrayList<HomeModel>>() {
            @Override
            public void onChanged(ArrayList<HomeModel> homeModels) {
                if (homeModels.size() > 0) {
                    tvMeninggal.setText(homeModels.get(0).getMeninggal());
                    tvSembuh.setText(homeModels.get(0).getSembuh());
                    tvPositif.setText(homeModels.get(0).getPositif());
                }
            }
        });

    }

    private void getProvinsiData () {

    }
}