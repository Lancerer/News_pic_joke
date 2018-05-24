package com.example.lancer.mvp_news.presenter;

import android.print.PageRange;

import com.example.lancer.mvp_news.cantranct.Cantranct;
import com.example.lancer.mvp_news.model.ItModel;
import com.example.lancer.mvp_news.model.Model;
import com.example.lancer.mvp_news.model.jokeModel;

import java.util.List;

/**
 * P层 用于M、V的交互的逻辑 主要将M获取到的数据 给V
 */

public class Presenter implements Cantranct.IPresenter {
    //创建M层对象
    private Model model;
    private jokeModel jmoddel;
    private ItModel itModel;
    //创建V层接口的对象
    private Cantranct.IView iView;
    private static final int s = 1;
    private static final int j = 2;
    private static final int i = 3;

    //构造方法的参数为V层的接口对象
    public Presenter(Cantranct.IView iView) {
        //待会展示数据的类实现V接口 创建P层的时候 将本身传进来 也就是说P层和展示数据的类他俩使用的是共同的一个V层接口 自然这个V层接口方法里的数据就可以共用了
        this.iView = iView;
        //创建M层的时候自然运行M层实现的请求数据方法 现在可以理解为已经请求到了数据
        model = new Model();
        jmoddel = new jokeModel();
        itModel=new ItModel();
    }

    @Override//在这个方法里进行M层和V层的交互
    public void presenter(int choice) {
   /*     //M层创建保存数据的callback接口对象 这个接口里方法的参数就是数据集合
        model.model(new Cantranct.IModel.CallBack() {
            @Override
            public void callData(List<MyBean.DataBean.ComicsBean> data) {
                //然后再用V层接口对象保存数据 在V层里展示出来
                iView.view(data);
            }
        });*/
        switch (choice) {
            case s:
                model.model(new Cantranct.IModel.CallBack() {
                    @Override
                    public void callData(List comics) {
                        iView.view(comics);
                    }
                }, false);
                break;
            case j:
                jmoddel.model(new Cantranct.IModel.CallBack() {
                    @Override
                    public void callData(List comics) {
                        iView.view(comics);
                    }
                }, false);
                break;
            case i:
                itModel.model(new Cantranct.IModel.CallBack() {
                    @Override
                    public void callData(List comics) {
                        iView.view(comics);
                    }
                }, false);
            default:
                break;
        }


    }
}
