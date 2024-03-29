package com.prakash.gradlegroovydemo.repository;

import com.prakash.gradlegroovydemo.dto.DeptEmpDto;
import com.prakash.gradlegroovydemo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
	@Query("SELECT new com.prakash.gradlegroovydemo.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
	@Query("SELECT new com.prakash.gradlegroovydemo.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d RIGHT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();
}