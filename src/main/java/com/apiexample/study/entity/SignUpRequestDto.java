package com.apiexample.study.entity;

import lombok.Data;

@Data
public class SignUpRequestDto {
    @Data
    public static class Name {
        String firstName;
        String LastName;
    }

    Name name;
    String nickName;
    String password;
    String email;
}
