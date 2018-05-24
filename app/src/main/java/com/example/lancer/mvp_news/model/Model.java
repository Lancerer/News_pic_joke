package com.example.lancer.mvp_news.model;

import com.example.lancer.mvp_news.adapter.SoldierAdapter;
import com.example.lancer.mvp_news.api.pe_imp;
import com.example.lancer.mvp_news.bean.SoldierBean;
import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.utils.httputil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Lancer on 2018/4/11.
 */

public class Model implements Cantranct.IModel {
    private String BaseUrl = "http://api.tianapi.com/";
    private com.example.lancer.mvp_news.utils.httputil httputil;
    public static List<SoldierBean.NewslistBean> beanList = new ArrayList<>();

    @Override
    public void model(final CallBack callBack, final boolean flag) {
        httputil = new httputil();
        pe_imp request = httputil.getRequest(BaseUrl);
        request.getSoldier().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SoldierBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SoldierBean value) {
                        if (!flag) {
                            if (beanList != null) {
                                beanList = value.getNewslist();
                                callBack.callData(beanList);
                            }

                        } else {
                            try {
                                if (beanList != null) {
                                    List<SoldierBean.NewslistBean> newslist = value.getNewslist();
                                    //请求到数据后 将数据保存到callback接口的方法里
                                    //用于将数据回调给P层 在P层里将数据给V
                                  /*  beanList.addAll(newslist);*/
                                    callBack.callData(newslist);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
