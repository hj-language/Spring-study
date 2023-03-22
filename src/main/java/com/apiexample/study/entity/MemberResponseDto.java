package com.apiexample.study.entity;

import lombok.Data;

@Data
public class MemberResponseDto {
    public MemberResponseDto(SignUpRequestDto signUpRequestDto) {
        this.nickName = signUpRequestDto.getNickName();
        this.email = signUpRequestDto.getEmail();
    }
    String nickName;
    String email;
}
