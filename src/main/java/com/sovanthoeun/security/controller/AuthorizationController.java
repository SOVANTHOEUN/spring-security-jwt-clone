package com.sovanthoeun.security.controller;

import com.sovanthoeun.security.service.impl.UserServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/resource")
@Tag(name = "Authorization Controller")
@RequiredArgsConstructor
public class AuthorizationController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping(value = "/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Here is your resource");
    }

    @GetMapping(value = "/get-user")
    public ResponseEntity<UserDetails> getUser() {
        return ResponseEntity.ok(userService.loadUserByUsername("parkjung@gmail.com"));
    }

}
