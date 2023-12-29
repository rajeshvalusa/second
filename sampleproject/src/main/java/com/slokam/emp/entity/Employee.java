package com.slokam.emp.entity;

import lombok.Data;

@Data
public class Employee {
	
	private Integer id;
    private String name;
    private Integer age;
    private String employeeDesignation;
    private String employeeHigherEdu;
}
