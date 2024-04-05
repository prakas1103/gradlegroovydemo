package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.jpaone2one.User;
import com.prakash.gradlegroovydemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        System.out.println(user);
        return userService.saveUser(user);
    }
}
