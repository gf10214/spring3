package com.wangshuo.spring.chapter2;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;
/**
 * Created by Administrator on 2017/6/29.
 */
public class HelloImpl2 implements HelloApi {

    private String message;
    public HelloImpl2(){
        this.message="Hello nihao";
    }
    public HelloImpl2(String message){
        this.message=message;
    }
    public void sayHello() {
        System.out.println(message);
    }
}
