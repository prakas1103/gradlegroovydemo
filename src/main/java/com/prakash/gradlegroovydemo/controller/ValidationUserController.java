package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.validation.ValidationUser;
import com.prakash.gradlegroovydemo.service.ValidationUserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/validationuser")
public class ValidationUserController {

    private final ValidationUserService service;

    public ValidationUserController(ValidationUserService service) {
        this.service = service;
    }

    @GetMapping
    public List<ValidationUser> getAllUsers(){
        return service.getAllUser();
    }

    @PostMapping
    public ResponseEntity<ValidationUser> saveUser(@Valid @RequestBody ValidationUser user){
        //System.out.println(user);
        ValidationUser savedUser = service.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/count")
    public Long getUsersCount(){
        return service.getUsersCount();
    }
}
