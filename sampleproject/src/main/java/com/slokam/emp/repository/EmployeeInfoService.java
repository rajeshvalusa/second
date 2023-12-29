package com.slokam.emp.repository;

import com.slokam.emp.dto.EmployeeDTO;
import com.slokam.emp.exception.UserInputException;

public interface EmployeeInfoService {
	public void saveEmployee(EmployeeDTO employeeDTO) throws UserInputException;
}
