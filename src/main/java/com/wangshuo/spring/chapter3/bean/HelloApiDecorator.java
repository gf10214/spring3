package com.wangshuo.spring.chapter3.bean;


import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

public class HelloApiDecorator implements HelloApi {
    
    private HelloApi helloApi;
    
    private String message;
    
    public HelloApiDecorator() {
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public HelloApiDecorator(HelloApi helloApi) {
        this.helloApi = helloApi;
    }
    
    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    public void sayHello() {
        System.out.println("==========装饰开始===========");
        helloApi.sayHello();
        System.out.println("==========装饰完毕===========");
    }
    
}
