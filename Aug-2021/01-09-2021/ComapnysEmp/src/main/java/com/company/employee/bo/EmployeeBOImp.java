package com.company.employee.bo;

import java.util.Map;

import com.company.dao.CrudDAO;
import com.company.dao.impl.EmployeeDAOImpl;
import com.company.entities.Employee;

public class EmployeeBOImp implements EmployeeBO {

	CrudDAO<Employee> crudDAO = new EmployeeDAOImpl();
	
	public Map<Integer, Employee> createEmployee() {
		return crudDAO.create();
	}
	
	public Employee printEmployee(Map<Integer, Employee> list) {
		return crudDAO.print(list);
	}
	
	public Employee findEmployee(Integer empid) {
		return crudDAO.find(empid);
	}

	public Employee deleteEmployee(Integer empid) {
		return crudDAO.delete(empid);
	}

	public Employee updateEmployee(String Location, Integer empid) {
		return crudDAO.update(Location,empid);
	}
	
	
	

}
