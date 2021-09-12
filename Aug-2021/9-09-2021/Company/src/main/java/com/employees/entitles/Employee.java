package com.employees.entitles;

public class Employee {

	private String lastName;
	private String firstName;
	private String Location;
	private int empId;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(String lastName, String firstName, String location, int empId, int salary) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		Location = location;
		this.empId = empId;
		this.salary = salary;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [lastName=" + lastName + ", firstName=" + firstName + ", Location=" + Location + ", empId="
				+ empId + ", salary=" + salary + "]\n";
	}
	
	
}
