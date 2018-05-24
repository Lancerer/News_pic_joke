package com.example.lancer.mvp_news;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lancer.mvp_news.fragment.JokeFragment;
import com.example.lancer.mvp_news.fragment.NewFragment;
import com.example.lancer.mvp_news.fragment.PicFragment;
import com.example.lancer.mvp_news.fragment.RobatFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.pool)
    FrameLayout pool;
    @Bind(R.id.iv_new)
    ImageView ivNew;
    @Bind(R.id.tv_new)
    TextView tvNew;
    @Bind(R.id.ll_new)
    LinearLayout llNew;
    @Bind(R.id.iv_pic)
    ImageView ivPic;
    @Bind(R.id.tv_pic)
    TextView tvPic;
    @Bind(R.id.ll_pic)
    LinearLayout llPic;
    @Bind(R.id.iv_joke)
    ImageView ivJoke;
    @Bind(R.id.tv_joke)
    TextView tvJoke;
    @Bind(R.id.ll_joke)
    LinearLayout llJoke;
    @Bind(R.id.iv_robat)
    ImageView ivRobat;
    @Bind(R.id.tv_robat)
    TextView tvRobat;
    @Bind(R.id.ll_robat)
    LinearLayout llRobat;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private NewFragment newFragment;
    private PicFragment picFragment;
    private JokeFragment jokeFragment;
    private RobatFragment robatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        select(0);
    }

    @OnClick({R.id.ll_joke, R.id.ll_new, R.id.ll_pic, R.id.ll_robat})
    public void click(View view) {
        switch (view.getId()) {
            case R.id.ll_new:
                select(0);
                break;
            case R.id.ll_pic:
                select(1);
                break;
            case R.id.ll_joke:
                select(2);
                break;
            case R.id.ll_robat:
                select(3);
                break;
            default:
                break;
        }
    }

    private void select(int i) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        changeTab();
        hideFragment(ft);
        switch (i) {
            case 0:
                if (newFragment == null) {
                    newFragment = new NewFragment();
                    ft.add(R.id.pool, newFragment);
                }
                tvNew.setTextColor(Color.BLUE);
                ft.show(newFragment);
                break;
            case 1:
                if (picFragment == null) {
                    picFragment = new PicFragment();
                    ft.add(R.id.pool, picFragment);
                }
                tvPic.setTextColor(Color.BLUE);
                ft.show(picFragment);
                break;
            case 2:
                if (jokeFragment == null) {
                    jokeFragment = new JokeFragment();
                    ft.add(R.id.pool, jokeFragment);
                }
                tvJoke.setTextColor(Color.BLUE);
                ft.show(jokeFragment);
                break;
            case 3:
                if (robatFragment == null) {
                    robatFragment = new RobatFragment();
                    ft.add(R.id.pool, robatFragment);
                }
                tvRobat.setTextColor(Color.BLUE);
                ft.show(robatFragment);
                break;
            default:
                break;

        }
        ft.commit();
    }

    private void hideFragment(FragmentTransaction ft) {
        if (newFragment != null) {
            ft.hide(newFragment);
        }
        if (picFragment != null) {
            ft.hide(picFragment);
        }
        if (jokeFragment != null) {
            ft.hide(jokeFragment);
        }
        if (robatFragment != null) {
            ft.hide(robatFragment);
        }
    }

    //颜色
    private void changeTab() {
        tvJoke.setTextColor(Color.BLACK);
        tvRobat.setTextColor(Color.BLACK);
        tvPic.setTextColor(Color.BLACK);
        tvNew.setTextColor(Color.BLACK);
    }

}
