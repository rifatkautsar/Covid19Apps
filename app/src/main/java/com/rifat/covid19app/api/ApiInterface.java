package com.rifat.covid19app.api;

import com.rifat.covid19app.Model.AllCountryModel;
import com.rifat.covid19app.Model.HomeModel;
import com.rifat.covid19app.Model.ProvinsiModel;
import com.rifat.covid19app.Model.WorldDataModel;

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

    @GET("api")
    Call<WorldDataModel> getWorldData();

    @GET(ApiEndPoint.END_POINT_ALL_COUNTRY)
    Call<List<AllCountryModel>> getAllCountryData();





}
