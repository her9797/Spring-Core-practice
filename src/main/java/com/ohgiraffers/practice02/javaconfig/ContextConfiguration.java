package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    @Bean(name = "board")
    public BoardDTO getBoard() {

        return new BoardDTO(2L,"제목2","내용2", "이내용");

    }

}
