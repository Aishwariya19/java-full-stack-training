package com.example;

import java.util.Objects;

public class Employee {

	  public int employeeId;
	  public String employeeName;
	  public String employeeLocation;
	  
	public Employee() {
		//super();
	}

	public Employee(int employeeId, String employeeName, String employeeLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}
	
	public void createEmployee(int employeeId, String employeeName, String employeeLocation)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
	}
	
	public String displayEmployeeDetails()
	{
		return "employee id: "+employeeId+" employee name: "+employeeName+" employee Location: "+employeeLocation;
	}

	
	  
	@Override
	public String toString() {
		
		return "employee id-> "+employeeId+" Employee Name-> " + employeeName + " Employee Location-> " + employeeLocation ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeLocation, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeLocation, other.employeeLocation)
				&& Objects.equals(employeeName, other.employeeName);
	}


	
}


