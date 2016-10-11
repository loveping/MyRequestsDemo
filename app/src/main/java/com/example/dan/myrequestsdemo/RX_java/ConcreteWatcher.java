package com.example.dan.myrequestsdemo.RX_java;

/**
 * Created by dan on 2016/10/11.
 */

public class ConcreteWatcher implements Watcher{
    @Override
    public void update(String string) {
        System.out.println(string);
    }
}
