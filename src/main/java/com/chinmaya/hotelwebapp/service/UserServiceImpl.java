package com.chinmaya.hotelwebapp.service;

import com.chinmaya.hotelwebapp.model.User;
import com.chinmaya.hotelwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}
