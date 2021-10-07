package com.rifat.covid19app.Network;

import com.rifat.covid19app.Model.HomeModel;
import com.rifat.covid19app.Model.Provinsi;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.Utilities.ApiEndPoint;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rifat on 10/4/21.
 */
public interface ApiInterface {

    @GET(ApiEndPoint.ENDPOINT_SUMMARY_INDONESIA)
    Call<List<HomeModel>> getData();

    @GET("indonesia/provinsi")
    Call<List<ProvinsiModel>> getProvinsiData();


}
