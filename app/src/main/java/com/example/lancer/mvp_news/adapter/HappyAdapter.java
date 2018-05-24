package com.example.lancer.mvp_news.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.ViewHolder.FootHolder;
import com.example.lancer.mvp_news.ViewHolder.ItemHolder;
import com.example.lancer.mvp_news.bean.HappyBean;
import com.lidroid.xutils.BitmapUtils;

import java.util.List;

public class HappyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    Context mContext;
    public List<HappyBean.NewslistBean> HappyList;
    public BitmapUtils bitmapUtils;
    private static final int TYPE_ITEM = 0;  //普通Item View
    private static final int TYPE_FOOTER = 1;  //顶部FootView


    public HappyAdapter(Context context, List<HappyBean.NewslistBean> list) {
        mContext = context;
        this.HappyList = list;
        bitmapUtils = new BitmapUtils(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = View.inflate(mContext, R.layout.pe__item, null);
            ItemHolder viewHolder = new ItemHolder(view);
            //将创建的View注册点击事件
            view.setOnClickListener(this);
            return viewHolder;
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
        if (holder instanceof ItemHolder) {
            ItemHolder viewHolder = (ItemHolder) holder;
            String picUrl = HappyList.get(position).getPicUrl();
            String replace = picUrl.replace("\\", "");
            bitmapUtils.display(viewHolder.ivnew, replace);
            viewHolder.tvtitle.setText(HappyList.get(position).getTitle());
            viewHolder.tvtime.setText(HappyList.get(position).getCtime());
            //将position保存在itemView的Tag中，以便点击时进行获取
            viewHolder.itemView.setTag(position);
        } else if (holder instanceof FootHolder) {
            FootHolder footViewHolder = (FootHolder) holder;
            footViewHolder.tv_reflash_foot.setText("正在加载更多数据...");
            //将position保存在itemView的Tag中，以便点击时进行获取
            footViewHolder.itemView.setTag(position);
        }
    }

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
        if (HappyList!=null){
            return HappyList.size()+1;
        }else {
            return 0;
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
