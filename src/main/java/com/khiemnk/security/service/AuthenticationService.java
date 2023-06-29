package com.khiemnk.security.service;

import com.khiemnk.security.dto.request.AuthenticationRequest;
import com.khiemnk.security.dto.request.RegisterRequest;
import com.khiemnk.security.dto.response.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
