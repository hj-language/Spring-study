package com.apiexample.study.entity;

import lombok.Data;

@Data
public class MemberResponseDto {
    public MemberResponseDto(String name, String company, String status, String message) {
        this.name = name;
        this.company = company;
        this.status = status;
        this.message = message;
    }
    String name;
    String company;
    String status;
    String message;
}
