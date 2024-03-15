package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.Employee;
import com.prakash.gradlegroovydemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(){
        Random random = new Random();
        int randomWintNextIntWithinARange = random.nextInt(1000 - 1) + 1;

        Employee employee = new Employee("prakash"+randomWintNextIntWithinARange,randomWintNextIntWithinARange);
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping
    public void deleteEmployeeById(@PathVariable Integer id){
        employeeService.deleteEmployeeById(id);
    }
}
