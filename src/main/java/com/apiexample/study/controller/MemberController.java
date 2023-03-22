package com.apiexample.study.controller;

import com.apiexample.study.entity.MemberResponseDto;
import com.apiexample.study.entity.SignUpRequestDto;
import com.apiexample.study.service.MemberService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping()
    public MemberResponseDto postMember(@RequestBody SignUpRequestDto signUpRequestDto) {
        return memberService.doSignUp(signUpRequestDto);
    }
}
