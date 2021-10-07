package com.rifat.covid19app.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rifat.covid19app.Model.HomeModel;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.Network.ApiInterface;
import com.rifat.covid19app.Network.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Rifat on 10/6/21.
 */
public class ProvinsiIndonesiaViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<ProvinsiModel>> provinsidata= new MutableLiveData<>();

    public void setProvinsiIndonesia() {

        Retrofit retrofit = RetrofitClient.getDataIndonesia();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<ProvinsiModel>> call = apiInterface.getProvinsiData();
        call.enqueue(new Callback<List<ProvinsiModel>>() {
            @Override
            public void onResponse(Call<List<ProvinsiModel>> call, Response<List<ProvinsiModel>> response) {
                if (response.isSuccessful()){
                    provinsidata.setValue((ArrayList<ProvinsiModel>) response.body());
                }
            }

            @Override
            public void onFailure(Call<List<ProvinsiModel>> call, Throwable t) {

            }
        });


    }

    public MutableLiveData<ArrayList<ProvinsiModel>> getSummaryData(){
        return provinsidata;
    }
}
