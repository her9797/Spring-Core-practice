package com.ohgiraffers.chap04.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class SingletonBean {

    private String message;

    public SingletonBean(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
