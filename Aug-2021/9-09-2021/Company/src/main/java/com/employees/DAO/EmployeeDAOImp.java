package com.employees.DAO;

import java.util.HashMap;
import java.util.Map;

import com.employees.entitles.Employee;

public class EmployeeDAOImp implements EmployeesDAO {
	

	 static Map<Integer, Employee> empMap  = new HashMap<Integer, Employee>();
	 
	static {
	 empMap.put(123, new Employee("John","K.","USA", 123,500000) );
	 empMap.put(2457, new Employee("Zara","E.","USA", 2457,500000)); 
	 empMap.put(2451, new Employee("Mahnaz","L.","USA",2451,500000)); 
	 empMap.put(2453, new Employee("Ayan","S.","USA",  2453,500000)); 
	 empMap.put(2327, new Employee("Daisy","M.","USA", 2327,500000));
	}
	
	public Map<Integer, Employee> create() {
		return empMap;
	}

	public Map<Integer, Employee> print() {
		System.out.println("Employee List is: \n"+ empMap );
		return empMap;
	}

	public Employee find(Integer empid) {
		System.out.println("Employee List Details is: \n"+empMap.get(empid));
		return empMap.get(empid);
	}

	public Map<Integer, Employee> delete(Integer empid) {
		Employee returned_value = empMap.remove(empid);
		System.out.println("Removed Employee: "+ returned_value);
	    System.out.println("New Employee List is: \n"+ empMap);
		return empMap;
	}

	public Map<Integer, Employee> update(int salary, Integer empid) {
		Employee emp=empMap.get(empid);
		emp.setSalary(salary);
		empMap.put(empid, emp);
		System.out.println("New Employee List is: \n"+ empMap);
		return empMap;
	}

}
