package com.slokam.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.emp.dto.EmployeeDTO;
import com.slokam.emp.exception.UserInputException;
import com.slokam.emp.repository.imp.EmployeeRepoImpl;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
     private EmployeeRepoImpl empService;
	@PostMapping("/save")
	public ResponseEntity<EmployeeDTO> savePatient(@RequestBody EmployeeDTO employeeDTO)
	throws UserInputException{
		log.trace("Entered into savePatient");
		
		 if(employeeDTO!=null)
			 log.debug(employeeDTO.toString());

		// empService.saveEmployee(employeeDTO);
		 
		log.trace("Exit from savePatient");
	   return ResponseEntity.ok(employeeDTO);	
	}
}
