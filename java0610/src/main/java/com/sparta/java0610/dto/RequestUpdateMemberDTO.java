package com.sparta.java0610.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RequestUpdateMemberDTO {
    private String name;
    private int age;
    private int gender;

    @Builder
    public RequestUpdateMemberDTO(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
