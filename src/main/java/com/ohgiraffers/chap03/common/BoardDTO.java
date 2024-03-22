package com.ohgiraffers.chap03.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class BoardDTO {

    private Long id;
    private String title;
    private String content;
    private MemberDTO writer;

}
