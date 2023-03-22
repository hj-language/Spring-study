package com.apiexample.study.service;

import com.apiexample.study.entity.Member;
import com.apiexample.study.entity.MemberResponseDto;
import com.apiexample.study.entity.SignUpRequestDto;
import com.apiexample.study.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public MemberResponseDto doSignUp(SignUpRequestDto signUpRequestDto) {
        Member member = new Member(signUpRequestDto);
        memberRepository.save(member);
        return new MemberResponseDto(signUpRequestDto);
    }
}
