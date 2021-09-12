package com.employees.BO;

import java.util.Map;

import com.employees.entitles.Employee;

public interface EmployeeBO {
	Map<Integer, Employee> createEmployee();
	Map<Integer, Employee> printEmployee();
	Employee findEmployee(Integer empid);
	Map<Integer, Employee> deleteEmployee(Integer empid);
	Map<Integer, Employee> updateEmployee(int salary, Integer empid);
}