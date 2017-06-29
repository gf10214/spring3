package com.wangshuo.spring.chapter2.Helloworld;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

/**
 * Created by Administrator on 2017/6/27.
 */
public class HelloImpl implements HelloApi {
    public void sayHello() {
        System.out.println("Hello World");
    }
}
