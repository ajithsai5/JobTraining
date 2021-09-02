package com.company.entities;

public class Employee {
	private String lastName;
	private String firstName;
	private String Location;
	private int empId;

	public Employee() {
		super();
	}

	public Employee(String lastName, String firstName, String Location, int empId) {
		super(); // What is super;?Read about Java Beans?
		this.lastName = lastName;
		this.firstName = firstName;
		this.Location = Location;
		this.empId = empId;
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

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() { // read about it?
		return "Employee [Employee Name=" + firstName + lastName + ",Location=" + Location + ",Employee Id=" + empId
				+ "]\n";
	}

}
