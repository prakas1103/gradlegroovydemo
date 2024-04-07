package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.jpaone2one.Address;
import com.prakash.gradlegroovydemo.model.jpaone2one.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseUrl = "http://localhost:";
    @BeforeEach
    public void setup(){
        baseUrl = baseUrl.concat(port+"").concat("/user");
    }
    //this works but not returning the address validation error messages in the output. will have to check
    @Test
    public void saveUserTest() {
        Address address = new Address("");
        User user = new User("bk",address);
        ResponseEntity<User> response =  restTemplate.postForEntity(
                baseUrl, user, User.class);
        User user1 = response.getBody();
        System.out.println(user1);
    }
}
