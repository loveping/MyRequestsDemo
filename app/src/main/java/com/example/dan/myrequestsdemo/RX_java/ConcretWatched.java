package com.example.dan.myrequestsdemo.RX_java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 2016/10/11.
 */

public class ConcretWatched implements Watched{
    private List<Watcher> list = new ArrayList<>();
    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatcher(String string) {
        for (Watcher watcher:list){
            watcher.update(string);
        }
    }
}
