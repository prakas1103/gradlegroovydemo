package com.prakash.gradlegroovydemo.service;

import com.prakash.gradlegroovydemo.model.Employee;
import com.prakash.gradlegroovydemo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployeeById(Integer id){
        employeeRepository.deleteById(id);
    }
}
