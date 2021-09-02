package com.company.employee.bo;

import java.util.Map;

import com.company.entities.Employee;

public interface EmployeeBO {
	
	Map<Integer, Employee> createEmployee();
	Employee printEmployee(Map<Integer, Employee> list);
	Employee findEmployee(Integer empid);
	Employee deleteEmployee(Integer empid);
	Employee updateEmployee(String Location, Integer empid);

}
