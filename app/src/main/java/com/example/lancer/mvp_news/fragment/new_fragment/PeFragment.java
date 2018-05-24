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
import android.widget.LinearLayout;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.activity.WebActivity;
import com.example.lancer.mvp_news.adapter.PeAdapter;
import com.example.lancer.mvp_news.api.pe_imp;
import com.example.lancer.mvp_news.bean.PeBean;

import com.example.lancer.mvp_news.utils.httputil;

import java.util.ArrayList;
import java.util.List;


import butterknife.Bind;
import butterknife.ButterKnife;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class PeFragment extends Fragment {
    @Bind(R.id.reflash)
    SwipeRefreshLayout reflash;
    private String BaseUrl = "http://api.tianapi.com/";
    @Bind(R.id.re_pe)
    RecyclerView rePe;
    private com.example.lancer.mvp_news.utils.httputil httputil;
    private PeAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private boolean flag;
    private List<PeBean.NewslistBean> beanList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_pe, null);

        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    public void initData() {
        beanList = new ArrayList();
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        reflash.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                request(true);
                reflash.setRefreshing(false);
            }
        });
        rePe.addOnScrollListener(new RecyclerView.OnScrollListener() {
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

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            }
        });
        request(false);

    }

    public void request(final boolean flag) {
        httputil = new httputil();
        pe_imp request = httputil.getRequest(BaseUrl);
        request.getCall()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PeBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PeBean value) {
                        //recycleView设置布局管理器
                        rePe.setLayoutManager(linearLayoutManager);
                        //固定高度
                        rePe.setHasFixedSize(true);
                        if (!flag) {
                            beanList = value.getNewslist();
                            adapter = new PeAdapter(getContext(), beanList);
                            rePe.setAdapter(adapter);
                            adapter.setOnItemClickListener(new PeAdapter.OnItemClickListener() {
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
                            List<PeBean.NewslistBean> newslist = value.getNewslist();
                            beanList.addAll(newslist);
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