package com.JGH.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.JGH.domain.model.entity.Member;
import com.JGH.domain.repository.MemberRepository;

@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    
    /**
     *  회원가입 함수
     * @param member 기입된 멤버 객체
     * @return member id
     */
    public Member join(Member member) {
        validateDuplicateMember(member); //중복검사 
        memberRepository.save(member);
        return member;
    }


    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
    
    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Member findOne(String memberNm) {
        return memberRepository.findOne(memberNm);
    }
}
