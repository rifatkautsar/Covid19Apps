package com.rifat.covid19app.ViewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rifat.covid19app.Model.AllCountryModel;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.api.ApiInterface;
import com.rifat.covid19app.api.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Rifat on 10/8/21.
 */
public class AllCountryDataViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<AllCountryModel>> countrydata = new MutableLiveData<>();

    public void setAllCountry() {

        Retrofit retrofit = RetrofitClient.getAllCountryData();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<AllCountryModel>> call = apiInterface.getAllCountryData();
        call.enqueue(new Callback<List<AllCountryModel>>() {
            @Override
            public void onResponse(Call<List<AllCountryModel>> call, Response<List<AllCountryModel>> response) {
                countrydata.setValue((ArrayList<AllCountryModel>) response.body());
                Log.d(response.body().toString(), "Reessss");
            }

            @Override
            public void onFailure(Call<List<AllCountryModel>> call, Throwable t) {

            }
        });


    }

    public MutableLiveData<ArrayList<AllCountryModel>> getSummaryData(){
        return countrydata;
    }
}
