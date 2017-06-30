package com.wangshuo.spring.chapter3;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

/**
 * Created by Administrator on 2017/6/30.
 */
public class HelloImpl3 implements HelloApi {
    private String message;
    private int index;

    //    @java.beans.ConstructorProperties({"message", "index"})
    public HelloImpl3(String message, int index) {
        this.message = message;
        this.index = index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
