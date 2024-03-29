package com.prakash.gradlegroovydemo.dto;


public record DeptEmpDto(String empDept, String empName, String empEmail, String empAddress) {}
/*
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DeptEmpDto {
	private String empDept;
	private String empName;
	private String empEmail;
	private String empAddress;
}*/
