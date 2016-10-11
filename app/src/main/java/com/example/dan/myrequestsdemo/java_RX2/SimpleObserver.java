package com.example.dan.myrequestsdemo.java_RX2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dan on 2016/10/11.
 */

public class SimpleObserver implements Observer {

    public  SimpleObserver(SimpleObservable simpleObservable){
        simpleObservable.addObserver(this);
    }

    //当被观察者状态发生改变时会调用
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("data is changed：" +((SimpleObservable)observable).getData());
    }
}
