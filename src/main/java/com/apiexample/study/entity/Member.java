package com.apiexample.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Member {
    public Member(SignUpRequestDto signUpRequestDto) {
        this.firstName = signUpRequestDto.getName().getFirstName();
        this.lastName = signUpRequestDto.getName().getLastName();
        this.nickName = signUpRequestDto.getNickName();
        this.password = signUpRequestDto.getPassword();
        this.email = signUpRequestDto.getEmail();
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String nickName;
    private String password;
    private String email;
}
