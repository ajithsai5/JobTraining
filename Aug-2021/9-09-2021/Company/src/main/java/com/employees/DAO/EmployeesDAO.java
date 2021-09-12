package com.employees.DAO;

import java.util.Map;

import com.employees.entitles.Employee;

public interface EmployeesDAO {
	Map<Integer, Employee> create();

	Map<Integer, Employee> print();

	Employee find(Integer empid);

	Map<Integer, Employee> delete(Integer empid);

	Map<Integer, Employee> update(int Salary, Integer empid);

}
