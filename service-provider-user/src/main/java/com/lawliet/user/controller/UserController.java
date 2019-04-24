package com.lawliet.user.controller;

import com.lawliet.user.dao.UserRepository;
import com.lawliet.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author KongHao  lawliet.haoge@gmail.com
 * 2019/4/21 16:24
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user =  this.userRepository.getOne(id);
        return user;
    }
}
