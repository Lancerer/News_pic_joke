package com.example.lancer.mvp_news.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.bean.picBean;
import com.lidroid.xutils.BitmapUtils;

import java.util.ArrayList;
import java.util.List;


public class picadapter extends BaseAdapter {
    public List<picBean.NewslistBean> PicList = null;
    private Context mContext;
    BitmapUtils bitmapUtils;

    public picadapter(Context context, List<picBean.NewslistBean> list) {
        this.mContext = context;
        this.bitmapUtils = new BitmapUtils(context);
        this.PicList = list;
    }

    @Override
    public int getCount() {
        return PicList.size();
    }

    @Override
    public picBean.NewslistBean getItem(int position) {
        return PicList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.pic_item, null);
            viewHolder = new ViewHolder();
            viewHolder.ivpic = convertView.findViewById(R.id.iv_pic_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        picBean.NewslistBean item = getItem(position);
        String picUrl = item.getPicUrl();
        String replace = picUrl.replace("\\", "");
        bitmapUtils.display(viewHolder.ivpic, replace);
        return convertView;
    }

    static class ViewHolder {
        ImageView ivpic;
    }
}
