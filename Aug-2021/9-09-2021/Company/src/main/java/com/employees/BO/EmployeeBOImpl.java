package com.employees.BO;

import java.util.Map;

import com.employees.DAO.EmployeeDAOImp;
import com.employees.DAO.EmployeesDAO;
import com.employees.entitles.Employee;

public class EmployeeBOImpl implements EmployeeBO {
	
	EmployeesDAO employeesDAO = new EmployeeDAOImp();

	public Map<Integer, Employee> createEmployee() {
		return employeesDAO.create();
	}

	public Map<Integer, Employee> printEmployee() {
		return employeesDAO.print();
	}

	public Employee findEmployee(Integer empid) {
		return employeesDAO.find(empid);
	}

	public Map<Integer, Employee> deleteEmployee(Integer empid) {
		return employeesDAO.delete(empid);
	}

	public Map<Integer, Employee> updateEmployee(int salary, Integer empid) {
		return employeesDAO.update(salary, empid);
	}

}
