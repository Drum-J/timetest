package com.sparta.java0610;

import com.sparta.java0610.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Java0610Application {

    public static void main(String[] args) {
        SpringApplication.run(Java0610Application.class, args);
    }
    @Bean
    public CommandLineRunner demo(UserRepository userRepository, UserService userService){
        return (args) ->{

        };
    }

}
