package com.example.service;

import com.example.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplement implements UserService{

    @Autowired
    protected UserRepository userRepository;
}
