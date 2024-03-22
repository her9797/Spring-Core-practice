package com.ohgiraffers.chap01.practice03.anootionconfig;

import com.ohgiraffers.chap01.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("[beanNames] " + beanName);
        }

        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);

        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L, "제목임둥", "내용임둥", "최내용")));
        System.out.println(boardDAO.selectBoard(3L));

    }
}
