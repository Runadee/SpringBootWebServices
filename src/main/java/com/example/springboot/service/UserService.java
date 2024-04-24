package com.example.springboot.service;

import com.example.springboot.entity.User;

public interface UserService {

    User createUser(User user);

    User getUserById(Long userId);

}
