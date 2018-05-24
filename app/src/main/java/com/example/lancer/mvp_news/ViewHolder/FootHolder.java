package com.example.lancer.mvp_news.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lancer.mvp_news.R;

/**
 * Created by Lancer on 2018/4/10.
 */

public class FootHolder extends RecyclerView.ViewHolder {

   public static TextView tv_reflash_foot;

    public FootHolder(View itemView) {
        super(itemView);
        tv_reflash_foot = itemView.findViewById(R.id.tv_reflash_foot);
    }
}
