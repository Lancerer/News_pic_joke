package com.example.lancer.mvp_news.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.lancer.mvp_news.R;


public class JokeHolder extends RecyclerView.ViewHolder {
    public static TextView tvtitlejoke;
    public static TextView tvcontentjoke;

    public JokeHolder(View itemView) {
        super(itemView);
        tvtitlejoke = itemView.findViewById(R.id.tv_title_joke);
        tvcontentjoke = itemView.findViewById(R.id.tv_content_joke);
    }
}
