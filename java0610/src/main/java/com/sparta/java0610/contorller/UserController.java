package com.sparta.java0610.contorller;

import com.sparta.java0610.User;
import com.sparta.java0610.UserRepository;
import com.sparta.java0610.dto.UserRequestDto;
import com.sparta.java0610.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody UserRequestDto requestDto){
        User user = new User(requestDto);
        return userRepository.save(user);
    }

    @GetMapping("/read/{id}")
    public List<User> getUser(){ return userRepository.findAll();}

    @PutMapping("/update/{id}")
    public Long updateUser(@PathVariable Long id, @RequestBody UserRequestDto requestDto){
        return userService.update(id,requestDto);
    }

    @DeleteMapping("/delete/{id}")
    public Long deleteUser(@PathVariable Long id, @RequestBody UserRequestDto requestDto){
        userRepository.deleteById(id);
        return id;
    }




}
