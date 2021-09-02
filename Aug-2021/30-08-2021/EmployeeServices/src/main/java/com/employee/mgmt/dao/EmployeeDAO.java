package com.employee.mgmt.dao;

import java.util.Map;

import com.employee.mgmt.entities.Employee;

public interface EmployeeDAO {// What is interface?  and Polymophism in Java?
	Employee print(Map<String, Employee> empMap);
}
