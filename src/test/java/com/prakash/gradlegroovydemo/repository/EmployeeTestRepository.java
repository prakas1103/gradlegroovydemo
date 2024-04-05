package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTestRepository extends JpaRepository<Employee,Integer> {
}
