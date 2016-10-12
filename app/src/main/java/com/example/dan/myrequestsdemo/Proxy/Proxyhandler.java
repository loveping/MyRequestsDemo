package com.example.dan.myrequestsdemo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dan on 2016/10/12.
 */

public class Proxyhandler implements InvocationHandler{

    private Peple man;

    //    构造方法，给我们要代理的真实对象赋初值
    public Proxyhandler(Peple man)
    {
        this.man = man;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //　　在代理真实对象前我们可以添加一些自己的操作
        System.out.println("************before rent proxy*****************");

        System.out.println("***********Method:***********" + method);

        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(man, objects);

        //　　在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("************after rent proxy*************");

        return null;
    }
}
