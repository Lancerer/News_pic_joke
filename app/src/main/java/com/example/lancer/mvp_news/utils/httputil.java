package com.example.lancer.mvp_news.utils;

import com.example.lancer.mvp_news.api.pe_imp;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lancer on 2018/4/8.
 */

public class httputil {

    public pe_imp getRequest(String BaseUrl) {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BaseUrl)
                .build();
        pe_imp request = retrofit.create(pe_imp.class);
        return request;
    }
}
