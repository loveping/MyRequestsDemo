package com.example.dan.myrequestsdemo.Proxy.staticProxy;

/**
 * Created by dan on 2016/10/12.
 */

public interface UserManager<T,V> {

    void addUser(T userId, V userName);
    void delUser(T userId);
    String findUser(T userId);
    void modifyUser(T userId, V userName);

}
