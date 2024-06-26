package com.ohgiraffers.chap01.practice03.anootionconfig;

import com.ohgiraffers.chap01.common.BoardDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BoardDAO {

    private final Map<Long, BoardDTO> boardMap;

    public BoardDAO() {
        boardMap = new HashMap<>();
        boardMap.put(1L, new BoardDTO(1L, "스프링 수업 어떠세요", "저는 재밌어요", "꿈나무개발자"));
        boardMap.put(2L, new BoardDTO(2L, "세미 끝~~", "파이널이 기다려져요", "나무개발자"));
    }

    public BoardDTO selectBoard(Long id) {
        return boardMap.get(id);
    }

    public boolean insertBoard(BoardDTO newBoard) {

        int before = boardMap.size();

        boardMap.put(newBoard.getId(), newBoard);

        int after = boardMap.size();
        return after > before ? true : false;

    }

}
