package com.sparta.java0610.service;

import com.sparta.java0610.User;
import com.sparta.java0610.UserRepository;
import com.sparta.java0610.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public Long update(Long id, UserRequestDto requestDto){
        User user1 = userRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 없습니다.")
        );
        user1.update(requestDto);
        return user1.getId();
    }
}
