package com.rifat.covid19app.Network;

import com.rifat.covid19app.Utilities.ApiEndPoint;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rifat on 10/4/21.
 */
public class RetrofitClient {
    private static final GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();

    private static final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor)
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .build();

    public static Retrofit getDataIndonesia(){
        return new Retrofit.Builder()
                .baseUrl(ApiEndPoint.BASE_URL_INDONESIA)
                .addConverterFactory(gsonConverterFactory)
                .client(okHttpClient)
                .build();
    }




}
