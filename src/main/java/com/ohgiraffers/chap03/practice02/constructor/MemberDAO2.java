package com.ohgiraffers.chap03.practice02.constructor;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO2 {

    private final Map<Long, MemberDTO> memberMap;


    public MemberDAO2() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "갈갈이"));
        memberMap.put(2L, new MemberDTO(2L, "옥동자"));

    }

    public Map<Long, MemberDTO> selectMember() {

        return memberMap;
    }

}
