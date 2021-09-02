package com.employee.mgmt;

import java.util.HashMap;
import java.util.Map;

import com.employee.mgmt.dao.EmployeeDAO;
import com.employee.mgmt.dao.EmployeeDAOImpl;
import com.employee.mgmt.entities.Employee;

public class EmployeeMgmtStart 
{
    public static void main( String[] args )
    {
    	Map<String, Employee> empMap  = new HashMap<String, Employee>();
    	empMap.put("001734123", new  Employee("John","K.","USA", 001734123));
    	empMap.put("001732457", new  Employee("Zara","E.","USA", 001732457));
    	empMap.put("001732451", new  Employee("Mahnaz","L.","USA", 001732451));
    	empMap.put("001732453", new  Employee("Ayan","S.","USA", 001732453));
    	empMap.put("001732327", new  Employee("Daisy","M.","USA", 001732327));
    	System.out.println(empMap.get("001732451"));
    	EmployeeDAO employeeDAO = new  EmployeeDAOImpl();
    	employeeDAO.print(empMap);
    
    
    }
}
