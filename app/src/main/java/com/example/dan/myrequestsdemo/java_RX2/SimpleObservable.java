package com.example.dan.myrequestsdemo.java_RX2;

import java.util.Observable;

/**
 * Created by dan on 2016/10/11.
 * 创建一个被观察者
 */

public class SimpleObservable extends Observable{
    private int data =0;
    public int getData(){
        return data;
    }

    public void setData(int i){
        if (this.data != i){
            this.data = i;
            setChanged();
            notifyObservers();//通知观察者，状态发生改变
        }
    }
}
