package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.Employee;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeControllerTest {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseUrl = "http://localhost:";
    @BeforeEach
    public void setup(){
        baseUrl = baseUrl.concat(port+"").concat("/employee");
    }

    @Test
    @Order(1)
    public void saveEmployeeTest() {
        Employee employee = new Employee("prakash",500);
        ResponseEntity<Employee> response = restTemplate.postForEntity(
                baseUrl, employee, Employee.class);
        Employee employee1 = response.getBody();
        assert employee1 != null;
        assertEquals(1,employee1.getId());
        assertEquals(HttpStatus.CREATED,response.getStatusCode());
    }

    @Test
    @Order(2)
    public void getAllEmployeesTest() {
        ResponseEntity<List> response = restTemplate.getForEntity(
                baseUrl, List.class);
        List employeeList = response.getBody();
        assert employeeList != null;
        assertEquals(1,response.getBody().size());
        assertEquals(HttpStatus.OK,response.getStatusCode());
    }


}
