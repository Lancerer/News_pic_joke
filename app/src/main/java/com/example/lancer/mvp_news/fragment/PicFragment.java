package com.example.lancer.mvp_news.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.View.ReflashListView;
import com.example.lancer.mvp_news.activity.WebActivity;
import com.example.lancer.mvp_news.adapter.picadapter;
import com.example.lancer.mvp_news.api.pe_imp;
import com.example.lancer.mvp_news.bean.picBean;
import com.example.lancer.mvp_news.utils.httputil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class PicFragment extends Fragment {

    @Bind(R.id.lv_pic)
    ReflashListView lvPic;
    @Bind(R.id.tool_pic)
    Toolbar toolPic;
    private String Baseurl = "http://api.tianapi.com/";
    private com.example.lancer.mvp_news.utils.httputil httputil;
    private picadapter adapter;
    private List<picBean.NewslistBean> piclist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_pic, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }



    public void initData() {
        toolPic.setLogo(R.drawable.plan);//设置app logo
        toolPic.setTitle("Pic");//设置主标题
        piclist = new ArrayList<>();
        httputil = new httputil();
        lvPic.setOnRefreshListener(new ReflashListView.OnRefreshListener() {
            @Override
            public void onPullRefresh() {

            }

            @Override
            public void onLoadingMore() {
                request(true);
            }
        });
        lvPic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Url = piclist.get(position).getPicUrl();
                String replace = Url.replace("\\", "");
                Intent intent = new Intent(getContext(), WebActivity.class);
                intent.putExtra("URL", replace);
                startActivity(intent);
            }
        });
        request(false);
    }


    public void request(final boolean flag) {
        pe_imp request = httputil.getRequest(Baseurl);
        request.getPic()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<picBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(picBean value) {
                        Log.d("rxjava", Thread.currentThread().getName());
                        if(!flag){
                            piclist = value.getNewslist();


                            adapter = new picadapter(getContext(), piclist);
                            lvPic.setAdapter(adapter);
                        }else {
                            List<picBean.NewslistBean> newslist = value.getNewslist();
                            piclist.addAll(newslist);
                            adapter.notifyDataSetChanged();
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


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
