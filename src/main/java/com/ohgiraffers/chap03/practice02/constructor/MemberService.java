package com.ohgiraffers.chap03.practice02.constructor;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberService2")
public class MemberService {

    private MemberDAO2 memberDAO;


    @Autowired
    public MemberService(MemberDAO2 memberDAO) {
        this.memberDAO = memberDAO;
    }




    public Map<Long, MemberDTO> selectMember() {

        return memberDAO.selectMember();
    }

}
