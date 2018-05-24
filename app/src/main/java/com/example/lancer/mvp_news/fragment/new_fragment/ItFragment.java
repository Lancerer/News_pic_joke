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
import com.example.lancer.mvp_news.adapter.ITAdapter;
import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.model.ItModel;
import com.example.lancer.mvp_news.presenter.Presenter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItFragment extends Fragment implements Cantranct.IView {


    @Bind(R.id.re_it)
    RecyclerView reIt;
    @Bind(R.id.swip_it)
    SwipeRefreshLayout swipIt;
    private String BaseUrl = "http://api.tianapi.com/";
    private ITAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private ItModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_it, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    private void initData() {
        Presenter presenter = new Presenter(this);
        presenter.presenter(3);
        linearLayoutManager = new LinearLayoutManager(getContext());
        reIt.setLayoutManager(linearLayoutManager);
        model=new ItModel();
        swipIt.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                model.model(new Cantranct.IModel.CallBack() {
                    @Override
                    public void callData(List comics) {
                        adapter=new ITAdapter(getContext(),comics);
                        reIt.setAdapter(adapter);
                    }
                },false);
                adapter.notifyDataSetChanged();
                swipIt.setRefreshing(false);
            }
        });
        reIt.addOnScrollListener(new RecyclerView.OnScrollListener() {
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


                    model.model(new Cantranct.IModel.CallBack() {
                        @Override
                        public void callData(List comics) {
                            model.beanList.addAll(comics);
                            adapter.notifyDataSetChanged();
                        }
                    }, true);
                }
            }
        });

    }

    @Override
    public void view(final List comics) {
        adapter = new ITAdapter(getContext(), comics);
        reIt.setAdapter(adapter);
        /*adapter.setOnItemClickListener(new ITAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                String Url = model.beanList.get(position).getUrl();
                String replace = Url.replace("\\", "");
                Intent intent = new Intent(getContext(), WebActivity.class);
                intent.putExtra("URL", replace);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

}
