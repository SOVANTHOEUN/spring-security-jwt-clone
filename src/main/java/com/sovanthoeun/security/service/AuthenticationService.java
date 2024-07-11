package com.sovanthoeun.security.service;

import com.sovanthoeun.security.dao.request.SignUpRequest;
import com.sovanthoeun.security.dao.request.SignInRequest;
import com.sovanthoeun.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
