package com.example.lancer.mvp_news.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.lancer.mvp_news.R;
import com.example.lancer.mvp_news.activity.RobatAdapter;
import com.example.lancer.mvp_news.bean.RobatBean;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;


public class RobatFragment extends Fragment {


    @Bind(R.id.tool_robat)
    Toolbar toolRobat;
    @Bind(R.id.lv_robat)
    ListView lvRobat;
    @Bind(R.id.et_robat)
    EditText etRobat;
    @Bind(R.id.iv_robat_plus)
    ImageView ivRobatPlus;
    private String BaseUrl = "http://www.tuling123.com/";
    private String msg;
    private String url;
    private ArrayList<RobatBean> list;
    private RobatAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_robat, null);
        ButterKnife.bind(this, view);
        initData();
        return view;
    }

    private void initData() {
        toolRobat.setTitle("Robat");
        toolRobat.setLogo(R.drawable.plan);
        list = new ArrayList<>();
        etRobat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(etRobat.getText().toString())) {
                    //todo 弹出popview
                    ivRobatPlus.setImageResource(R.drawable.circle_plus);
                } else if (!TextUtils.isEmpty(etRobat.getText().toString())) {
                   // ivRobatPlus.setImageResource(R.drawable.send);
                    ivRobatPlus.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            RobatBean robatBean = new RobatBean(msg, RobatBean.SEND);
                            list.add(robatBean);
                            adapter.notifyDataSetChanged();
                            etRobat.setText("");
                        }
                    });
                }
            }
        });
        adapter = new RobatAdapter(list, getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
