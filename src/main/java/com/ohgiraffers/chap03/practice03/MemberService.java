package com.ohgiraffers.chap03.practice03;

import com.ohgiraffers.chap02.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberService3")
public class MemberService {

    private MemberDAO3 memberDAO;

    @Autowired
    public void setMemberDAO(MemberDAO3 memberDAO) {
        this.memberDAO = memberDAO;
    }




    public Map<Long, MemberDTO> selectMember() {

        return memberDAO.selectMember();
    }

}
