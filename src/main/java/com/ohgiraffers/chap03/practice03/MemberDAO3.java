package com.ohgiraffers.chap03.practice03;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO3 {

    private final Map<Long, MemberDTO> memberMap;


    public MemberDAO3() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "강부자"));
        memberMap.put(2L, new MemberDTO(2L, "강거지"));

    }

    public Map<Long, MemberDTO> selectMember() {

        return memberMap;
    }

}
