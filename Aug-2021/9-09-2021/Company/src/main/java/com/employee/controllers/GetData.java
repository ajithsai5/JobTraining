package com.employee.controllers;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employees.BO.EmployeeBO;
import com.employees.BO.EmployeeBOImpl;
import com.employees.entitles.Employee;

public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public GetData() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeBO employeeBO = new EmployeeBOImpl();
		Map<Integer, Employee> EmployeeID = employeeBO.printEmployee();
		request.setAttribute("EmployeeID", EmployeeID);
	    request.getRequestDispatcher("update.jsp").forward(request, response);
	}



}
