package com.example.dan.myrequestsdemo.Proxy.staticProxy;

/**
 * Created by dan on 2016/10/12.
 */

public class UserManagerImplProxy implements UserManager<String ,String> {
    private UserManager userManager ;

    public UserManagerImplProxy(UserManager userManager){
        this.userManager = userManager;
    }
    @Override
    public void addUser(String userId, String userName) {
        try{
            //开始添加用户
            System.out.println("start-->addUser()");
            userManager.addUser(userId, userName);
            //添加用户成功
            System.out.println("success-->addUser()");
        }catch (Exception e){
            //添加用户失败
            System.out.println("error-->addUser()");
        }

    }

    @Override
    public void delUser(String userId) {
        System.out.println("***********UserManagerImplProxy.delUser");
        userManager.delUser(userId);
    }

    @Override
    public String findUser(String userId) {
        System.out.println("**********UserManagerImplProxy.findUser");
        userManager.findUser(userId);
        return "张三";
    }

    @Override
    public void modifyUser(String userId, String userName) {
        System.out.println("************UserManagerImplProxy.modifyUser");
        userManager.modifyUser(userId,userName);
    }
}
