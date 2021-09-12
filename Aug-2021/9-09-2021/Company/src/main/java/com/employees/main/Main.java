package com.employees.main;

import java.util.Map;

import com.employees.BO.EmployeeBO;
import com.employees.BO.EmployeeBOImpl;
import com.employees.entitles.Employee;

public class Main {

	public static void main(String[] args) {
		EmployeeBO employeeBO = new EmployeeBOImpl();
    	Map<Integer, Employee> emp = employeeBO.createEmployee();
    	employeeBO.printEmployee(emp);
    	employeeBO.findEmployee(2451);
    	employeeBO.deleteEmployee(2451);
    	employeeBO.updateEmployee("Hyd",2327);

	}

}
