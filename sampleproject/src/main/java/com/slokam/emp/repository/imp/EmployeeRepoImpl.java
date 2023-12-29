package com.slokam.emp.repository.imp;

import java.sql.PreparedStatement;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.slokam.emp.dto.EmployeeDTO;
import com.slokam.emp.entity.Employee;
import com.slokam.emp.exception.UserInputException;
import com.slokam.emp.repository.EmployeeInfoService;

import lombok.extern.slf4j.Slf4j;
@Repository
@Slf4j
public class EmployeeRepoImpl implements EmployeeInfoService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void saveEmployee(EmployeeDTO employeeDTO) throws UserInputException {
		Employee employee=modelMapper.map(employeeDTO, Employee.class);
		log.info("Entered into save employee");
		if(employeeDTO!=null) {
			String sql="INSERT INTO employeeinfo (name,age,employeeDesignation,employeeHigherEdu) VALUES (?,?,?,?)";
			try {
				jdbcTemplate.update(connection -> {
	                PreparedStatement ps = connection.prepareStatement(sql, new String[]{"id"});
	                ps.setString(1, employee.getName());
	                ps.setInt(2, employee.getAge());
	                ps.setString(3, employee.getEmployeeDesignation());
	                ps.setString(4, employee.getEmployeeHigherEdu());
	                return ps;
	            });
			} catch (Exception e) {
			   throw new UserInputException("User input details are incorrect"+e);
			}
		}
		log.info("exited from save employee");
		
	}
	


}
