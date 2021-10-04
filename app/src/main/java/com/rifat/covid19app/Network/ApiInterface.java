package com.rifat.covid19app.Network;

import com.rifat.covid19app.Adapter.Model.HomeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rifat on 10/4/21.
 */
public interface ApiInterface {

    @GET("indonesia")
    Call<List<HomeModel>> getData();

}
