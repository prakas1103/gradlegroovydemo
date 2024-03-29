package com.prakash.gradlegroovydemo.service;

import java.util.List;

import com.prakash.gradlegroovydemo.dto.DeptEmpDto;
import com.prakash.gradlegroovydemo.model.EmployeeJpa;
import com.prakash.gradlegroovydemo.repository.DepartmentRepository;
import com.prakash.gradlegroovydemo.repository.EmployeeJpaRepository;
import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;


@Service
public class JoinService {
	private final DepartmentRepository departmentRepository;
	private final EmployeeJpaRepository employeeRepository;

	public JoinService(DepartmentRepository departmentRepository, EmployeeJpaRepository employeeRepository) {
		this.departmentRepository = departmentRepository;
		this.employeeRepository = employeeRepository;
	}

	public List<DeptEmpDto> getDeptEmployeesLeftJoin() {
		List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataLeftJoin();
		list.forEach(System.out::println);
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesRightJoin() {
		List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataRightJoin();
		list.forEach(System.out::println);
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesInnerJoin() {
		List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataInnerJoin();
		list.forEach(System.out::println);
		return list;
	}

	public List<DeptEmpDto> getDeptEmployeesCrossJoin() {
		List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataCrossJoin();
		list.forEach(System.out::println);
		return list;
	}

	public List<EmployeeJpa> getDeptEmployees() {
		return employeeRepository.findAll();
	}
}