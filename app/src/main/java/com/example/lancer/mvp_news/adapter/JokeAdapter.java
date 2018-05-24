package com.example.lancer.mvp_news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.ViewHolder.FootHolder;
import com.example.lancer.mvp_news.ViewHolder.JokeHolder;
import com.example.lancer.mvp_news.bean.JokeBean;

import java.util.List;


public class JokeAdapter extends RecyclerView.Adapter implements View.OnClickListener {
    private List<JokeBean.NewslistBean> jokeList;
    Context mContext;
    private static final int TYPE_ITEM = 0;  //普通Item View
    private static final int TYPE_FOOTER = 1;  //顶部FootView

    public JokeAdapter(Context context, List<JokeBean.NewslistBean> list) {
        mContext = context;
        jokeList = list;

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = View.inflate(mContext, R.layout.joke_item, null);
            JokeHolder jokeHolder = new JokeHolder(view);
            view.setOnClickListener(this);
            return jokeHolder;
        } else if (viewType == TYPE_FOOTER) {
            View view = View.inflate(mContext, R.layout.foot_view, null);
            FootHolder viewHolder = new FootHolder(view);
            view.setOnClickListener(this);
            return viewHolder;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof JokeHolder) {
            JokeHolder jokeHolder = (JokeHolder) holder;
            String replace = jokeList.get(position).getContent().replace("<br/>", "");
            jokeHolder.tvtitlejoke.setText(jokeList.get(position).getTitle());
            jokeHolder.tvcontentjoke.setText(replace);
            jokeHolder.itemView.setTag(position);
        } else if (holder instanceof FootHolder) {
            FootHolder footViewHolder = (FootHolder) holder;
            footViewHolder.tv_reflash_foot.setText("正在加载更多数据...");
            //将position保存在itemView的Tag中，以便点击时进行获取
            footViewHolder.itemView.setTag(position);
        }
    }

    @Override
    public int getItemCount() {
        return jokeList.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position + 1 == getItemCount()) {
            return TYPE_FOOTER;
        } else {
            return TYPE_ITEM;
        }
    }

    private OnItemClickListener onItemClickListener = null;

    public static interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    @Override
    public void onClick(View v) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(v, (int) v.getTag());
        }
    }

    //最后暴露给外面的调用者，定义一个设置Listener的方法（）：
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }
}
