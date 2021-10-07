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

import com.rifat.covid19app.Model.WorldDataModel;
import com.rifat.covid19app.R;
import com.rifat.covid19app.ViewModel.WorldWideDataViewModel;
import com.rifat.covid19app.view.Activity.AllCountryActivity;

public class FragmentWordWide extends Fragment {

    private TextView tvMeninggal , tvSembuh , tvPostifif;
    private Button btnWorldDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_wide, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
       super.onViewCreated(view, savedInstanceState);

       btnWorldDetail = view.findViewById(R.id.btnWorldwide);
       btnWorldDetail.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getActivity(), AllCountryActivity.class);
               startActivity(intent);
           }
       });
       tvPostifif = view.findViewById(R.id.tvPositifWorld);
       tvMeninggal = view.findViewById(R.id.tvMeninggalWorld);
       tvSembuh = view.findViewById(R.id.tvSembuhWorld);


        WorldWideDataViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(WorldWideDataViewModel.class);
        viewModel.setWorldata();
        viewModel.getWorldData().observe(this, new Observer<WorldDataModel>() {
            @Override
            public void onChanged(WorldDataModel worldDataModel) {
                tvPostifif.setText(String.valueOf(worldDataModel.getConfirmed().getValue()));
                tvMeninggal.setText(String.valueOf(worldDataModel.getDeaths().getValue()));
                tvSembuh.setText(String.valueOf(worldDataModel.getRecovered().getValue()));



            }
        });
    }
}