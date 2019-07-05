package com.docker.mysqldocker.controller;


import com.docker.mysqldocker.model.Users;
import com.docker.mysqldocker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<Users> all() {


        return userRepository.findAll();
    }


    @GetMapping("/create")
    public List<Users> users() {
        Users users = new Users();
        users.setId(1);
        users.setName("Sam");
        users.setSalary(3400);
        users.setTeamName("Development");

        userRepository.save(users);

        return userRepository.findAll();
    }
}
