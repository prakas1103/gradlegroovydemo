package com.prakash.gradlegroovydemo.dto;

import com.prakash.gradlegroovydemo.model.Department;
import com.prakash.gradlegroovydemo.model.EmployeeJpa;

public record EmpDept(EmployeeJpa employeeJpa, Department department) {
}
