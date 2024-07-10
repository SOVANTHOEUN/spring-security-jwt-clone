package com.truongbn.security.service;

import com.truongbn.security.dao.request.SignUpRequest;
import com.truongbn.security.dao.request.SignInRequest;
import com.truongbn.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}
