package com.example.lancer.mvp_news.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.adapter.MyViewPagerAdapter;
import com.example.lancer.mvp_news.fragment.new_fragment.CityFragment;
import com.example.lancer.mvp_news.fragment.new_fragment.DriveFragment;
import com.example.lancer.mvp_news.fragment.new_fragment.HappyFragment;
import com.example.lancer.mvp_news.fragment.new_fragment.ItFragment;
import com.example.lancer.mvp_news.fragment.new_fragment.PeFragment;
import com.example.lancer.mvp_news.fragment.new_fragment.SoldierFragment;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class NewFragment extends BaseFragment implements TabLayout.OnTabSelectedListener {


    @Bind(R.id.pager)
    ViewPager pager;
    @Bind(R.id.timeline_tablayout)
    TabLayout timelineTablayout;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private CityFragment cityFragment;
    private HappyFragment happyFragment;
    private ItFragment itFragment;
    private PeFragment peFragment;
    private SoldierFragment soldierFragment;
    private DriveFragment driveFragment;
    private String[] titles = new String[]{"城市", "娱乐", "互联网", "体育", "军事", "旅游"};
    private ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_new, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    //初始化数据
    @Override
    public void initData() {
        toolbar.setLogo(R.drawable.plan);//设置app logo
        toolbar.setTitle("Lancer");//设置主标题
        //设置tab模式为可滑动的
        timelineTablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //循环注入标签
        for (String tab : titles) {
            timelineTablayout.addTab(timelineTablayout.newTab().setText(tab));
        }
        //注册监听
        timelineTablayout.addOnTabSelectedListener(this);
        //初始化Fragment
        initFragment();
        //设置适配器
        pager.setAdapter(new MyViewPagerAdapter(getFragmentManager(), titles, fragments));
        //绑定viewpager
        timelineTablayout.setupWithViewPager(pager);
    }

    //初始化Fragment
    private void initFragment() {
        cityFragment = new CityFragment();
        happyFragment = new HappyFragment();
        itFragment = new ItFragment();
        peFragment = new PeFragment();
        soldierFragment = new SoldierFragment();
        driveFragment = new DriveFragment();
        fragments.add(cityFragment);
        fragments.add(happyFragment);
        fragments.add(itFragment);
        fragments.add(peFragment);
        fragments.add(soldierFragment);
        fragments.add(driveFragment);
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        //TabLayout里的TabItem被选中的时候触发
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);

    }

    @Override
    public void request() {
    }
}
