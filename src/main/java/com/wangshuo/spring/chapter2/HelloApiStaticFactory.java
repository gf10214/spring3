package com.wangshuo.spring.chapter2;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

/**
 * Created by Administrator on 2017/6/30.
 */
public class HelloApiStaticFactory {
    public static HelloApi newInstance(String message){
        return new HelloImpl2(message);
    }
}
