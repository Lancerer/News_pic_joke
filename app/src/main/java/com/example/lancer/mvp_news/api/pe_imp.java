package com.example.lancer.mvp_news.api;

import com.example.lancer.mvp_news.bean.CityBean;
import com.example.lancer.mvp_news.bean.DriverBean;
import com.example.lancer.mvp_news.bean.HappyBean;
import com.example.lancer.mvp_news.bean.ITBean;
import com.example.lancer.mvp_news.bean.JokeBean;
import com.example.lancer.mvp_news.bean.PeBean;
import com.example.lancer.mvp_news.bean.SoldierBean;
import com.example.lancer.mvp_news.bean.picBean;

import io.reactivex.Observable;
import retrofit2.http.GET;


public interface pe_imp {
    @GET("tiyu/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<PeBean> getCall();

    @GET(" world/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<CityBean> getCity();

    @GET("huabian/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<HappyBean> gethappy();

    @GET("mobile/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1&")
    Observable<ITBean> getit();

    @GET("qiwen/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<DriverBean> getdriver();

    @GET("military/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10&rand=1")
    Observable<SoldierBean> getSoldier();

    @GET("meinv/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=20&rand=1")
    Observable<picBean> getPic();

    @GET("txapi/joke/?key=4e8309c39e4ddab74b0b3ac294030bc3&num=10")
    Observable<JokeBean> getJoke();
}
