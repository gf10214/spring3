package com.wangshuo.spring.chapter3;

import com.wangshuo.spring.chapter2.Helloworld.HelloApi;

/**
 * Created by Administrator on 2017/6/30.
 */
public class DependencyInjectByStaticFactory {
    public static HelloApi newInstance(String message, int index) {
        return new HelloImpl3(message, index);
    }
}
