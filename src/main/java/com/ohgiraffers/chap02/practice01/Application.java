package com.ohgiraffers.chap02.practice01;

import com.ohgiraffers.chap02.common.BoardDTO;
import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Application {

    public static void main(String[] args) {

        ApplicationContext context
            = new GenericXmlApplicationContext("chap02/section01/xmlconfig/spring-context.xml");

        BoardDTO board = context.getBean(BoardDTO.class);

        System.out.println(board.getId());
        System.out.println(board.getTitle());
        System.out.println(board.getContent());
        System.out.println(board.getWriter().getId());
        System.out.println(board.getWriter().getNickName());

        System.out.println(board);

    }

}
