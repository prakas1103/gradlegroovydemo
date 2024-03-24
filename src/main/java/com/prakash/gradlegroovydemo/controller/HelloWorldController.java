package com.prakash.gradlegroovydemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
    @GetMapping("/")
    public ResponseEntity<String> getHelloWorld(){
        logger.info("Executing getHelloWorld");
        return ResponseEntity.ok("Hello World !!!");
    }
    @GetMapping("/badRequest")
    public ResponseEntity<String> getBadRequest(){
        return ResponseEntity.badRequest().body("It is a bad request");
    }
}
