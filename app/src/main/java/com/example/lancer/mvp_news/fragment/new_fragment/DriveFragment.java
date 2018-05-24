package com.example.lancer.mvp_news.fragment.new_fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.activity.WebActivity;
import com.example.lancer.mvp_news.adapter.DriverAdapter;
import com.example.lancer.mvp_news.adapter.HappyAdapter;
import com.example.lancer.mvp_news.api.pe_imp;
import com.example.lancer.mvp_news.bean.DriverBean;
import com.example.lancer.mvp_news.bean.HappyBean;
import com.example.lancer.mvp_news.utils.httputil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class DriveFragment extends Fragment {
    @Bind(R.id.re_driver)
    RecyclerView reDriver;
    @Bind(R.id.swip_driver)
    SwipeRefreshLayout swipDriver;
    private String BaseUrl = "http://api.tianapi.com/";
    private List<DriverBean.NewslistBean> beanList;
    private LinearLayoutManager linearLayoutManager;
    private boolean flag;
    private DriverAdapter adapter;
    private com.example.lancer.mvp_news.utils.httputil httputil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_drive, null);
        ButterKnife.bind(this, view);
        initdata();
        return view;
    }

    private void initdata() {
        httputil = new httputil();
        beanList = new ArrayList<>();
        linearLayoutManager = new LinearLayoutManager(getContext());
        swipDriver.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                request(true);
                swipDriver.setRefreshing(false);
            }
        });
        reDriver.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

                //屏幕中最后一个可见子项的position
                int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                //当前屏幕所看到的子项个数
                int visibleItemCount = linearLayoutManager.getChildCount();
                //当前RecyclerView的所有子项个数
                int totalItemCount = linearLayoutManager.getItemCount();
                //RecyclerView的滑动状态
                int state = recyclerView.getScrollState();
                if (visibleItemCount > 0 && lastVisibleItemPosition == totalItemCount - 1 && state == recyclerView.SCROLL_STATE_IDLE) {
                    request(true);
                }
            }
        });
        request(false);
    }

    private void request(final boolean flag) {
        httputil = new httputil();
        pe_imp request = httputil.getRequest(BaseUrl);
        request.getdriver().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DriverBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DriverBean value) {
                        reDriver.setLayoutManager(linearLayoutManager);
                        if (!flag) {
                            beanList = value.getNewslist();
                            adapter = new DriverAdapter(getContext(), beanList);
                            reDriver.setAdapter(adapter);
                            adapter.setOnItemClickListener(new DriverAdapter.OnItemClickListener() {
                                @Override
                                public void onItemClick(View view, int position) {
                                    String Url = beanList.get(position).getUrl();
                                    String replace = Url.replace("\\", "");
                                    Intent intent = new Intent(getContext(), WebActivity.class);
                                    intent.putExtra("URL", replace);
                                    startActivity(intent);
                                }
                            });
                        } else {
                            List<DriverBean.NewslistBean> newslist = value.getNewslist();
                            if(beanList!=null){
                                beanList.addAll(newslist);
                                adapter.notifyDataSetChanged();
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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
