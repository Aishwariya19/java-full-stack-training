package com.example;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, String email,Address address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address=address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// explicit type conversion
		Employee tempEmployee = (Employee) obj;
		if ((this.employeeId == tempEmployee.employeeId) && (this.firstName.equals(tempEmployee.firstName))
				&& (this.lastName.equals(tempEmployee.lastName)) && (this.email.equals(tempEmployee.email))) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

}
