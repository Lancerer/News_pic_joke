package com.example.lancer.mvp_news.model;

import com.example.lancer.mvp_news.api.pe_imp;
import com.example.lancer.mvp_news.bean.ITBean;
import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.utils.httputil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Lancer on 2018/4/13.
 */

public class ItModel implements Cantranct.IModel {
    private String BaseUrl = "http://api.tianapi.com/";
    public List<ITBean.NewslistBean> beanList = new ArrayList<>();
    private com.example.lancer.mvp_news.utils.httputil httputil;


    @Override
    public void model(final CallBack callBack, final boolean flag) {
        httputil = new httputil();
        pe_imp request = httputil.getRequest(BaseUrl);
        request.getit()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ITBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ITBean value) {
                        if (!flag) {
                            beanList = value.getNewslist();
                            callBack.callData(beanList);
                        } else {
                            List<ITBean.NewslistBean> newslist = value.getNewslist();
                            callBack.callData(newslist);
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
