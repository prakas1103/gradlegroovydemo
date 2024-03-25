package com.prakash.gradlegroovydemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class HelloWorldControllerTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getHelloWorldTest() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(
                new URI("http://localhost:" + port + "/").toString(), String.class);
        assertEquals("Hello World !!!", response.getBody());

    }

    @Test
    public void getBadRequestTest() throws Exception {

        ResponseEntity<String> response = restTemplate.getForEntity(
                new URI("http://localhost:" + port + "/badRequest").toString(), String.class);
        assertEquals("It is a bad request", response.getBody());
        assertEquals(response.getStatusCode(), HttpStatus.BAD_REQUEST);

    }
}
