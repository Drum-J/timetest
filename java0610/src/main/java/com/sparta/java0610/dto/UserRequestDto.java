package com.sparta.java0610.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class UserRequestDto {
    private final String email;
    private final String name;
    private final int age;
    private final int gender;
}
