package com.rifat.covid19app.ViewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rifat.covid19app.Model.HomeModel;
import com.rifat.covid19app.Model.WorldDataModel;
import com.rifat.covid19app.api.ApiInterface;
import com.rifat.covid19app.api.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Rifat on 10/7/21.
 */
public class WorldWideDataViewModel extends ViewModel {

    private final MutableLiveData<WorldDataModel> worlddatamodel= new MutableLiveData<>();

    public void setWorldata () {

        Retrofit retrofit = RetrofitClient.getDataWorldData();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<WorldDataModel> worldData = apiInterface.getWorldData();
        worldData.enqueue(new Callback<WorldDataModel>() {
            @Override
            public void onResponse(Call<WorldDataModel> call, Response<WorldDataModel> response) {
                worlddatamodel.setValue(response.body());

            }

            @Override
            public void onFailure(Call<WorldDataModel> call, Throwable t) {

            }
        });

    }

    public LiveData<WorldDataModel> getWorldData(){
        return worlddatamodel;
    }
}

