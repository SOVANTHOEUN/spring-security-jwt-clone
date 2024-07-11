//package com.sovanthoeun.security.controller;
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@Tag(name = "User Authentication")
//@RequiredArgsConstructor
//@RequestMapping("/api/v2/user")
//@RestController
//public class UserController {
//
//    @Operation(summary = "사용자 전체 조회")
//    @GetMapping("/user-list{userId}")
//    public ResponseEntity<String> userList(@PathVariable Long userId) {
//        return ResponseEntity.ok("User List");
//    }
//
//}
