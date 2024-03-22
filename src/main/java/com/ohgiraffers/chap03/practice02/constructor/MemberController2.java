package com.ohgiraffers.chap03.practice02.constructor;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class MemberController2 {

    @Autowired
    private MemberService memberService;

    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }

}
