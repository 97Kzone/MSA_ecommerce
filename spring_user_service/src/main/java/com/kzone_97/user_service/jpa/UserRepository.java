package com.kzone_97.user_service.jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId);

    UserEntity findByEmail(String email);
}
