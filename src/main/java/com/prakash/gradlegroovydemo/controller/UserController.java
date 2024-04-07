package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.jpaone2one.User;
import com.prakash.gradlegroovydemo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
        //System.out.println(user);
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/count")
    public Long getUsersCount(){
        return userService.getUsersCount();
    }
}
