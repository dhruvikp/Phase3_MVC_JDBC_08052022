package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.EmployeeDAO;
import com.simplilearn.model.Employees;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public List<Employees> getEmployees() {
		return employeeDAO.getEmployees();
	}
}