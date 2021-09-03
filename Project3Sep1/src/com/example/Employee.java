package com.example;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, String email) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {

		return "Employee ID-> " + employeeId + " firstName-> " + firstName + " last name-> " + lastName + " email-> "
				+ email;
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
