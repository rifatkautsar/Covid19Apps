package com.rifat.covid19app.ViewModel;

import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rifat.covid19app.Model.HomeModel;
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
public class StatistikIndonesiaViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<HomeModel>> homemodel = new MutableLiveData<>();

  public void setStatistikIndonesia() {

      Retrofit retrofit = RetrofitClient.getDataIndonesia();
      ApiInterface apiInterface = retrofit.create(ApiInterface.class);
      Call<List<HomeModel>> call = apiInterface.getData();
      call.enqueue(new Callback<List<HomeModel>>() {
          @Override
          public void onResponse(Call<List<HomeModel>> call, Response<List<HomeModel>> response) {
              if (response.isSuccessful()){
                  homemodel.setValue((ArrayList<HomeModel>) response.body());
              }
          }

          @Override
          public void onFailure(Call<List<HomeModel>> call, Throwable t) {

          }
      });

  }

    public LiveData<ArrayList<HomeModel>> getSummaryData(){
        return homemodel;
    }

}
