package com.example.lancer.mvp_news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.bean.PeBean;
import com.lidroid.xutils.BitmapUtils;


import java.util.List;

public class PeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    public List<PeBean.NewslistBean> pelist = null;
    Context mContext;
    BitmapUtils bitmapUtils;
    private static final int TYPE_ITEM = 0;  //普通Item View
    private static final int TYPE_FOOTER = 1;  //顶部FootView

    public PeAdapter(Context context, List<PeBean.NewslistBean> list) {
        pelist = list;
        mContext = context;
        bitmapUtils = new BitmapUtils(context);
    }

    //初始化viewholder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = View.inflate(mContext, R.layout.pe__item, null);
            ViewHolder viewHolder = new ViewHolder(view);
            //将创建的View注册点击事件
            view.setOnClickListener(this);
            return viewHolder;
        } else if (viewType == TYPE_FOOTER) {
            View view = View.inflate(mContext, R.layout.foot_view, null);
            FootViewHolder viewHolder = new FootViewHolder(view);
            view.setOnClickListener(this);
            return viewHolder;
        }
        return null;
    }

    //绑定viewholder
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) holder;
            String picUrl = pelist.get(position).getPicUrl();
            String replace = picUrl.replace("\\", "");
            bitmapUtils.display(viewHolder.ivnew, replace);
            viewHolder.tvtitle.setText(pelist.get(position).getTitle());
            viewHolder.tvtime.setText(pelist.get(position).getCtime());
            //将position保存在itemView的Tag中，以便点击时进行获取
            viewHolder.itemView.setTag(position);
        } else if (holder instanceof FootViewHolder) {
            FootViewHolder footViewHolder = (FootViewHolder) holder;
            footViewHolder.tv_reflash_foot.setText("正在加载更多数据...");
            //将position保存在itemView的Tag中，以便点击时进行获取
            footViewHolder.itemView.setTag(position);
        }
    }

    /**
     * 进行判断是普通Item视图还是FootView视图
     *
     * @param position
     * @return
     */
    @Override
    public int getItemViewType(int position) {
        // 最后一个item设置为footerView
        if (position + 1 == getItemCount()) {
            return TYPE_FOOTER;
        } else {
            return TYPE_ITEM;
        }
    }

    @Override
    public int getItemCount() {
        if (pelist != null) {
            return pelist.size() + 1;
        } else {
            return 0;
        }
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvtitle;
        TextView tvtime;
        ImageView ivnew;

        public ViewHolder(View itemView) {
            super(itemView);
            tvtime = itemView.findViewById(R.id.tv_time);
            tvtitle = itemView.findViewById(R.id.tv_title);
            ivnew = itemView.findViewById(R.id.iv_news);
        }
    }

    /**
     * 底部FootView布局   FootViewHolder
     */
    public static class FootViewHolder extends RecyclerView.ViewHolder {

        TextView tv_reflash_foot;

        public FootViewHolder(View itemView) {
            super(itemView);
            tv_reflash_foot = itemView.findViewById(R.id.tv_reflash_foot);
        }
    }

    //声明一个这个接口的变量
    private OnItemClickListener mOnItemClickListener = null;

    //在MyAdapter中定义如下接口,模拟ListView的OnItemClickListener
    public static interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    // 将点击事件转移给外面的调用者
    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v, (int) v.getTag());
        }
    }

    //最后暴露给外面的调用者，定义一个设置Listener的方法（）：
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
}
