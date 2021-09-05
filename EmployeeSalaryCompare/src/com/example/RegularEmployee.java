
package com.example;

public class RegularEmployee extends Employee{
	
	private int salary;
	

	public RegularEmployee() {
		super();
	}

	public RegularEmployee(int employeeId, String employeeName, String employeeLocation, int salary) {
		
		super(employeeId,employeeName,employeeLocation);
		this.salary = 2*salary;
	}


	@Override
	public String displayEmployeeDetails() {
		// TODO Auto-generated method stub
		return super.displayEmployeeDetails() +" salary: "+salary;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result =
	 * super.hashCode(); result = prime * result + Objects.hash(salary); return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) { return true;
	 * } if (!super.equals(obj)) { return false; } if (!(obj instanceof
	 * RegularEmployee)) { return false; } RegularEmployee other = (RegularEmployee)
	 * obj; return salary == other.salary; }
	 */
	

}