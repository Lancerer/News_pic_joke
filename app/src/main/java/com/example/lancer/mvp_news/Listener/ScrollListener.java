package com.example.lancer.mvp_news.Listener;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.model.Model;

import java.util.List;

/**
 * Created by Lancer on 2018/4/11.
 */

public class ScrollListener extends RecyclerView {
    private LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
    private RecyclerView recyclerView;
    public ScrollListener(Context context) {
        super(context);
    }

    public ScrollListener(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void addOnScrollListener(OnScrollListener listener) {
        //屏幕中最后一个可见子项的position
        int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        //当前屏幕所看到的子项个数
        int visibleItemCount = linearLayoutManager.getChildCount();
        //当前RecyclerView的所有子项个数
        int totalItemCount = linearLayoutManager.getItemCount();
        //RecyclerView的滑动状态
        int state = recyclerView.getScrollState();
        if (visibleItemCount > 0 && lastVisibleItemPosition == totalItemCount - 1 && state == recyclerView.SCROLL_STATE_IDLE) {

        }
    }
}
