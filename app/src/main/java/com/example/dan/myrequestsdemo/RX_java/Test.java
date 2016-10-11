package com.example.dan.myrequestsdemo.RX_java;

/**
 * Created by dan on 2016/10/11.
 */

public class Test {

    public static void main(String[] args) throws Exception{
        Watched xiaomi = new ConcretWatched();

        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();

        xiaomi.addWatcher(watcher1);
        xiaomi.addWatcher(watcher2);
        xiaomi.addWatcher(watcher3);

        xiaomi.notifyWatcher("我要行动了");
    }
}
