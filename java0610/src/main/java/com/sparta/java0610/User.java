package com.sparta.java0610;


import com.sparta.java0610.dto.UserRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private int gender;


    public User(String email, String name,int age,int gender){
        this.email = email;
        this.name = name;
        this.age =age;
        this.gender=gender;

    }

    public User(UserRequestDto requestDto){
        this.email =requestDto.getEmail();
        this.name = requestDto.getName();
        this.age =requestDto.getAge();
        this.gender=requestDto.getGender();
    }

    public void update(UserRequestDto requestDto){
        this.name = requestDto.getName();
        this.age =requestDto.getAge();
        this.gender=requestDto.getGender();
    }

}
