package com.sovanthoeun.security.controller;

import com.sovanthoeun.security.dao.request.SignInRequest;
import com.sovanthoeun.security.dao.request.SignUpRequest;
import com.sovanthoeun.security.dao.response.JwtAuthenticationResponse;
import com.sovanthoeun.security.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Authentication Controller", description = "ចូលចុះឈ្មោះ និង ប្រើប្រាស់")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @Operation(summary = "ចុះឈ្មោះ", description = "សូមអានការណែនាំ")
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @Operation(summary = "ចូលប្រើប្រាស់", description = "សូមអានការណែនាំ")
    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
