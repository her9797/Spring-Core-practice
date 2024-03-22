package com.ohgiraffers.chap04.practice01.bean;

import org.springframework.context.annotation.Bean;

public class InitDestroyBean {

    @Bean("prototypeBean")
    public void init() {
        System.out.println("init 작업이 실행되었습니다.");
    }

    @Bean("prototypeBean")
    public void destroy() {
        System.out.println("destroy 작업이 실행되었습니다.");
    }
}
