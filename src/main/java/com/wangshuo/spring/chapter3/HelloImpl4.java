package com.wangshuo.spring.chapter3;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

/**
 * Created by Administrator on 2017/6/30.
 */
public class HelloImpl4 implements HelloApi {
    private String message;
    private int index;
    //setter方法
    public void setMessage(String message) {
        this.message = message;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
