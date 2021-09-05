
package com.example;

import java.util.Objects;

public class HourlyPaidEmployee extends Employee{
	
	private int noOfHour;
	private int ratePerHour;
	private int salary;

	public HourlyPaidEmployee() {
		super();
	}

	public HourlyPaidEmployee(int employeeId, String employeeName, String employeeLocation, int ratePerHour,int noOfHour) {
		super(employeeId,employeeName,employeeLocation);
		this.ratePerHour=ratePerHour;
		this.noOfHour=noOfHour;
		this.salary=ratePerHour*noOfHour;
		
		
	}
	
	
	
	@Override
	public String displayEmployeeDetails() {
		
		return super.displayEmployeeDetails()+" salary: "+salary;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result =
	 * super.hashCode(); result = prime * result + Objects.hash(salary); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) { return true;
	 * } if (!super.equals(obj)) { return false; } if (!(obj instanceof
	 * HourlyPaidEmployee)) { return false; } HourlyPaidEmployee other =
	 * (HourlyPaidEmployee) obj; return salary == other.salary; }
	 */
	

}