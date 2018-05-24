package com.example.newstest;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Lancer on 2018/4/7.
 */

public interface GetRequest {
    @GET("it/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<InfoBean> getCall();
}
