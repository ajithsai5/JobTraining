package com.company.employee;

import java.util.Map;

import com.company.employee.bo.EmployeeBO;
import com.company.employee.bo.EmployeeBOImp;
import com.company.entities.Employee;
import com.company.entities.Workers;
import com.company.workers.bo.WorkersBO;
import com.company.workers.bo.WorkersBOImpl;

public class AppMain 
{
    public static void main( String[] args )
    {
    	EmployeeBO employeeBO  = new  EmployeeBOImp();
    	Map<Integer, Employee> emp = employeeBO.createEmployee();
    	employeeBO.printEmployee(emp);
    	employeeBO.findEmployee(2451);
    	employeeBO.deleteEmployee(2451);
    	employeeBO.updateEmployee("Hyd",2327);
       //8 System.out.println( "Hello World!" );
    	
    	WorkersBO WorkerBO  = new  WorkersBOImpl();
    	Map<Integer, Workers> work = WorkerBO.createWorker();
    	WorkerBO.printWorker(work);
    	WorkerBO.findWorker(2451);
    	WorkerBO.deleteWorker(2451);
    	WorkerBO.updateWorker("Hyd",4123);

    }
}
