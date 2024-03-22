package com.ohgiraffers.chap03.practice01.field;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberService")
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public Map<Long, MemberDTO> selectMember() {

        return memberDAO.selectMember();
    }

}
