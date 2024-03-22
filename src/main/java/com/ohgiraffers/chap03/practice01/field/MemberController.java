package com.ohgiraffers.chap03.practice01.field;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    public Map<Long, MemberDTO> selectMember() {

        return memberService.selectMember();
    }

}
