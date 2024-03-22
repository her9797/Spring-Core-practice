package com.ohgiraffers.chap03.practice03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.chap03");

        MemberService memberService = context.getBean("memberService3", MemberService.class);


        System.out.println(memberService.selectMember());

    }
}
