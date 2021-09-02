package com.employee.mgmt.dao;

import java.util.Map;

import com.employee.mgmt.entities.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {


	public Employee print(Map<String, Employee> empMap) {
		System.out.println(empMap);
		return null;
	}
}