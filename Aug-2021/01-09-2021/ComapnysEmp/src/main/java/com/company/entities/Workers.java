package com.company.entities;

public class Workers {

	private String lastName;
	private String firstName;
	private String Location;
	private int workersId;

	public Workers() {
		super();
	}

	public Workers(String lastName, String firstName, String location, int workersId) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		Location = location;
		this.workersId = workersId;
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

	public int getWorkersId() {
		return workersId;
	}

	public void setWorkersId(int workersId) {
		this.workersId = workersId;
	}

	@Override
	public String toString() {
		return "Workers [lastName=" + lastName + ", firstName=" + firstName + ", Location=" + Location + ", workersId="
				+ workersId + "]\n";
	}

}
