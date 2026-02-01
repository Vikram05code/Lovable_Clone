package com.vikram.lovable_clone.service;
import com.vikram.lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
