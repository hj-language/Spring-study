package com.apiexample.study.service;

import com.apiexample.study.entity.MemberResponseDto;
import com.apiexample.study.entity.SignUpRequestDto;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public MemberResponseDto doSignUp(SignUpRequestDto signUpRequestDto) {
        return new MemberResponseDto(
                signUpRequestDto.getName(),
                signUpRequestDto.getCompany(),
                "on-line",
                "welcome!"
        );
    }
}
