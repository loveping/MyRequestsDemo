package com.example.dan.myrequestsdemo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by dan on 2016/10/12.
 */

public class Test {

    public static void main(String[] args ) throws Exception{

        Peple man = new Man();
        Proxyhandler ih = new Proxyhandler(man);

//        Peple man1 = (Peple)Proxy.newProxyInstance(man.getClass().getClassLoader(), man.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//
//                //　　在代理真实对象前我们可以添加一些自己的操作
//                System.out.println("************before*************");
//
//                method.invoke(man,objects);
//
//                //　　在代理真实对象后我们也可以添加一些自己的操作
//                System.out.println("************after*************");
//                return null;
//
//            }
//        });

        Peple peple1 = (Peple)Proxy.newProxyInstance(man.getClass().getClassLoader(),man.getClass().getInterfaces(),ih);
        peple1.sayHello();
    }
}
