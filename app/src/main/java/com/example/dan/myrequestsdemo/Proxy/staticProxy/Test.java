package com.example.dan.myrequestsdemo.Proxy.staticProxy;

/**
 * Created by dan on 2016/10/12.
 */

public class Test {
    public static void main(String[] args) throws Exception{
        UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("1111","張三");
        userManager.findUser("1111");
        userManager.modifyUser("11111","張三");
        userManager.delUser("11111");
    }
}
