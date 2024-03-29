package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.dto.DeptEmpDto;
import com.prakash.gradlegroovydemo.model.EmployeeJpa;
import com.prakash.gradlegroovydemo.repository.EmployeeJpaRepository;
import com.prakash.gradlegroovydemo.service.JoinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class JoinRestController {
	private final JoinService joinService;

	public JoinRestController(JoinService joinService){
		this.joinService = joinService;
	}

	@GetMapping("/dept/employees/left")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesLeftJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesLeftJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/right")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesRightJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesRightJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/inner")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesInnerJoin() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesInnerJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees/cross")
	public ResponseEntity<List<DeptEmpDto>> getDeptEmployees() {
		return new ResponseEntity<List<DeptEmpDto>>(joinService.getDeptEmployeesCrossJoin(), HttpStatus.OK);
	}

	@GetMapping("/dept/employees")
	public ResponseEntity<List<EmployeeJpa>> getDeptEmployeesCrossJoin() {
		return new ResponseEntity<>(joinService.getDeptEmployees(), HttpStatus.OK);
	}
}