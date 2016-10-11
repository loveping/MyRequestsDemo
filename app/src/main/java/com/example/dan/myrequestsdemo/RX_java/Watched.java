package com.example.dan.myrequestsdemo.RX_java;

/**
 * Created by dan on 2016/10/11.
 */

public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWatcher(Watcher watcher);
    public void notifyWatcher(String string);
}
