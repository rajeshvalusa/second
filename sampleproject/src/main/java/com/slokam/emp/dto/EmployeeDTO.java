package com.slokam.emp.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Integer id;
    private String name;
    private Integer age;
    private String employeeDesignation;
    private String employeeHigherEdu;
}
