package com.example.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Rxjava";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initData2();
        initData3();
    }

    //线程调度的使用
    private void initData3() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                Log.d("所在的线程：", Thread.currentThread().getName());
                Log.d("发送的数据:", 1 + "");
                e.onNext(1);
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        Log.d("所在的线程：", Thread.currentThread().getName());
                        Log.d("接收到的数据:", "integer:" + integer);
                    }
                });
     /*   01-19 10:06:38.275 27734-27783/? D/所在的线程：: RxCachedThreadScheduler-1
        01-19 10:06:38.275 27734-27783/? D/发送的数据:: 1
        01-19 10:06:38.285 27734-27734/? D/所在的线程：: main
        01-19 10:06:38.285 27734-27734/? D/接收到的数据:: integer:1*/
       /* 可以看到, Observable(被观察者) 发送事件的线程的确改变了,
         是在一个叫 RxCachedThreadScheduler - 1 的线程中发送的事件,
         而Observer(观察者) 仍然在主线程中接收事件。
        由此我们实现了线程调度的操作，可以在此基础上尽情的进行异步操作。*/

    }

    //基于事件流的链式调用方式
    private void initData2() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            // 1. 创建被观察者 & 生产事件
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Exception {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        }).subscribe(new Observer<Integer>() {
            // 2. 通过通过订阅（subscribe）连接观察者和被观察者
            // 3. 创建观察者 & 定义响应事件的行为
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "开始采用subscribe连接");
            }
            // 默认最先调用复写的 onSubscribe（）

            @Override
            public void onNext(Integer value) {
                Log.d(TAG, "对Next事件" + value + "作出响应");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "对Error事件作出响应");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "对Complete事件作出响应");
            }

        });
    }

    private void initData() {
        io.reactivex.Observable<Integer> observable = io.reactivex.Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(2);
                e.onComplete();
            }
        });
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d("TAG", "开始采用subscribe连接");

            }

            @Override
            public void onNext(Integer value) {
                Log.d("TAG", "对Next事件作出响应" + value);
            }

            @Override
            public void onError(Throwable e) {
                Log.d("TAG", "对Error事件作出响应");
            }

            @Override
            public void onComplete() {
                Log.d("TAG", "对Complete事件作出响应");
            }
        };
        observable.subscribe(observer);
    }

}
