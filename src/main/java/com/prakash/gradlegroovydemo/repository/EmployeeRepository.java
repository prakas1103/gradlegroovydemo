package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
