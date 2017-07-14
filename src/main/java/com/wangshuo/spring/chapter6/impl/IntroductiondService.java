package com.wangshuo.spring.chapter6.impl;


import com.wangshuo.spring.chapter6.IIntroductionService;

public class IntroductiondService implements IIntroductionService {

    public void induct() {
        System.out.println("=========introduction");
    }
}
