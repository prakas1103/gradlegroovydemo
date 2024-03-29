package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.dto.DeptEmpDto;
import com.prakash.gradlegroovydemo.model.EmployeeJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeJpaRepository extends JpaRepository<EmployeeJpa, Long> {
	@Query("SELECT new com.prakash.gradlegroovydemo.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d INNER JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataInnerJoin();
	@Query("SELECT new com.prakash.gradlegroovydemo.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d, EmployeeJpa e")
	List<DeptEmpDto> fetchEmpDeptDataCrossJoin();
}