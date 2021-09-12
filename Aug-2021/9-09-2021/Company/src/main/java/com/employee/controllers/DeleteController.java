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

public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeBO employeeBO = new EmployeeBOImpl();
		String empID = request.getParameter("empID");
		Map<Integer, Employee> EmployeeID = employeeBO.deleteEmployee(Integer.valueOf(empID));
		if(EmployeeID!=null)
		{
			request.setAttribute("EmployeeID", EmployeeID);
	        request.getRequestDispatcher("delete.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

	}



}
