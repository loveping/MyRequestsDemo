package com.example.dan.myrequestsdemo.java_RX2;

/**
 * Created by dan on 2016/10/11.
 */

public class MyTest {

    public static void main(String[] args ) throws  Exception{

        SimpleObservable simpleObservable =new SimpleObservable();
        SimpleObserver observer = new SimpleObserver(simpleObservable);

        simpleObservable.setData(1);
        simpleObservable.setData(2);
        simpleObservable.setData(3);
    }
}
