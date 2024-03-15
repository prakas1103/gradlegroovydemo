package com.prakash.gradlegroovydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello World !!!");
    }
    @GetMapping("/badRequest")
    public ResponseEntity<String> getBadRequest(){
        return ResponseEntity.badRequest().body("It is a bad request");
    }
}
