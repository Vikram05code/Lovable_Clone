package com.vikram.lovable_clone.service;

import com.vikram.lovable_clone.dto.auth.AuthResponse;
import com.vikram.lovable_clone.dto.auth.LoginRequest;
import com.vikram.lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
