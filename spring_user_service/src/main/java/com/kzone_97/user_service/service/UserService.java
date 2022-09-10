package com.kzone_97.user_service.service;

import com.kzone_97.user_service.dto.UserDto;
import com.kzone_97.user_service.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
