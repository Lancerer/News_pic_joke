package com.example.lancer.mvp_news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.adapter.JokeAdapter;
import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.model.Model;
import com.example.lancer.mvp_news.model.jokeModel;
import com.example.lancer.mvp_news.presenter.Presenter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class JokeFragment extends Fragment implements Cantranct.IView {

    @Bind(R.id.tool_joke)
    Toolbar toolJoke;
    @Bind(R.id.re_joke)
    RecyclerView reJoke;
    @Bind(R.id.swip_joke)
    SwipeRefreshLayout swipJoke;
    private LinearLayoutManager linearLayoutManager;
    private JokeAdapter adapter;
    private jokeModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_joke, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    private void initData() {
        model = new jokeModel();
        toolJoke.setLogo(R.drawable.plan);//设置app logo
        toolJoke.setTitle("Joke");//设置主标题
        //创建P层对象 传入本身 因为P层的构造函数是IView接口 而本类实现了IView接口 将本身传进去之后 在P层进行交互的V接口获取到数据 在本类实现的V层接口方法里的数据就可以用了
        Presenter presenter = new Presenter(this);
        presenter.presenter(2);
        linearLayoutManager = new LinearLayoutManager(getContext());
        reJoke.setLayoutManager(linearLayoutManager);
        swipJoke.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                model.model(new Cantranct.IModel.CallBack() {
                    @Override
                    public void callData(List comics) {
                        adapter = new JokeAdapter(getContext(), comics);
                        reJoke.setAdapter(adapter);
                    }
                }, false);
                adapter.notifyDataSetChanged();
                swipJoke.setRefreshing(false);
            }
        });
        reJoke.addOnScrollListener(new RecyclerView.OnScrollListener() {
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
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void view(List comics) {
        adapter = new JokeAdapter(getContext(), comics);
        reJoke.setAdapter(adapter);
    }
}
