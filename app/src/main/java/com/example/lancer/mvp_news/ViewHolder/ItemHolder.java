package com.example.lancer.mvp_news.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lancer.mvp_news.R;


public class ItemHolder extends RecyclerView.ViewHolder {
    public static TextView tvtitle;
    public static TextView tvtime;
    public static ImageView ivnew;

    public ItemHolder(View itemView) {
        super(itemView);
        tvtime = itemView.findViewById(R.id.tv_time);
        tvtitle = itemView.findViewById(R.id.tv_title);
        ivnew = itemView.findViewById(R.id.iv_news);
    }
}
