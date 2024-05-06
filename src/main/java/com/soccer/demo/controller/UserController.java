package com.soccer.demo.controller;

import com.soccer.demo.dto.UserDto;
import com.soccer.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<UserDto> getAllUsers() {
        log.info();

        return userService.getAllUsers();
    }
}
