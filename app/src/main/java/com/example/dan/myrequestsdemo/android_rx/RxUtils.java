package com.example.dan.myrequestsdemo.android_rx;


import android.util.Log;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by dan on 2016/10/11.
 */

public class RxUtils {
    private static final String TAG = RxUtils.class.getSimpleName();

    public static void createObserable(){
        //定义被观察者
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                if (!subscriber.isUnsubscribed()){
                    subscriber.onNext("hello");
                    subscriber.onNext("hi");
                    subscriber.onNext(downloadjson());
                    subscriber.onNext("world");
                    subscriber.onCompleted();

                }
            }
        });

        Subscriber<String > subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                Log.i(TAG,"onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG,e.getMessage());
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG,"result-->>" +s);
            }
        };

        observable.subscribe(subscriber);//关联被观察者
    }

    /**
     *
     * @return
     * 使用下载方法
     */
    public static String downloadjson(){
        return "json data";
    }


}
