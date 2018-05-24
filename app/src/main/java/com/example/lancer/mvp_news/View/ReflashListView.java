package com.example.lancer.mvp_news.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.lancer.mvp_news.R;


public class ReflashListView extends ListView implements AbsListView.OnScrollListener {
    private int measuredHeight;
    private View view;

    public ReflashListView(Context context) {
        super(context);
        initfootView();
    }


    public ReflashListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initfootView();
    }

    public ReflashListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initfootView();

    }

    private void initfootView() {
        view = View.inflate(getContext(), R.layout.foot_view, null);
        addFooterView(view);
        measuredHeight = view.getMeasuredHeight();
        view.setPadding(0, -measuredHeight, 0, 0);
        this.setOnScrollListener(this);//滑动监听
    }

    /**
     * 设置滑动监听事件
     */
    private boolean isLoadingMore;//标记是否正在加载

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        if (scrollState == OnScrollListener.SCROLL_STATE_IDLE
                && getLastVisiblePosition() == (getCount() - 1) && !isLoadingMore) {
            isLoadingMore = true;

            view.setPadding(0, 0, 0, 0);//显示出footerView
            setSelection(getCount());//让listview最后一条显示出来，在页面完全显示出底布局

            if (listener != null) {
                listener.onLoadingMore();
            }
        }
    }

    // 当ListView滚动的时候会调用这个方法
    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }


    private OnRefreshListener listener;

    public void setOnRefreshListener(OnRefreshListener listener) {
        this.listener = listener;
    }

    /**
     * ListView刷新的监听器
     */
    public interface OnRefreshListener {
        /**
         * 当ListView可以刷新数据的时候会调用这个方法
         */
        void onPullRefresh();

        /**
         * 当ListView可以加载更多 的时候会调用这个方法
         */
        void onLoadingMore();
    }

    /**
     * 刷新结束,收起控件
     */
    public void onRefreshComplete(boolean success) {
       /* if(!isLoadMore) {
            mHeaderView.setPadding(0, -mHeaderViewHeight, 0, 0);

            mCurrentState = STATE_PULL_TO_REFRESH;
            tvTitle.setText("下拉刷新");
            pbProgress.setVisibility(View.INVISIBLE);
            ivArrow.setVisibility(View.VISIBLE);

            if (success) {// 只有刷新成功之后才更新时间
                setCurrentTime();
            }
        }else {*/
        //加载更多
        view.setPadding(0, -measuredHeight, 0, 0);//隐藏布局
        isLoadingMore = false;
        /*}*/
    }
}
