package com.company.dao.impl;

import java.util.HashMap;
import java.util.Map;
import com.company.dao.CrudDAO;
import com.company.entities.Employee;

public class EmployeeDAOImpl implements CrudDAO<Employee> {
	
	 Map<Integer, Employee> empMap  = new HashMap<Integer, Employee>();
	

	public Map<Integer, Employee> create() {
		 empMap.put(4123, new Employee("John","K.","USA", 4123) );
		 empMap.put(2457, new Employee("Zara","E.","USA", 2457)); 
		 empMap.put(2451, new Employee("Mahnaz","L.","USA",2451)); 
		 empMap.put(2453, new Employee("Ayan","S.","USA",  2453)); 
		 empMap.put(2327, new Employee("Daisy","M.","USA", 2327));
		return empMap;
	}

	

	public Employee find(Integer empID) {
		System.out.println("Employee List Details is: \n"+empMap.get(empID));
		return null;
	}

	public Employee delete(Integer empID) {
		Employee returned_value = empMap.remove(empID);
		System.out.println("Removed Employee: "+ returned_value);
	    System.out.println("New Employee List is: \n"+ empMap);
		return null;
	}



	public Employee update(String emplToUpdate, Integer empid) {
		Employee emp=empMap.get(empid);
		emp.setLocation("Hyd");
		empMap.put(empid, emp);
		return emp;
	}



	public Employee print(Map<Integer, Employee> list) {
		System.out.println("Employee List is: \n"+ list );
		return null;
	}
	
	
	}