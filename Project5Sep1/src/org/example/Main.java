
package org.example;

import com.example.Address;

import com.example.Employee;


public class Main {

	public static void main(String[] args) {

		Employee employee=new Employee();
		employee.setEmployeeId(100);
		employee.setFirstName("John");
		employee.setLastName("Doe");
		employee.setEmail("john@email.com");
		Address address=new Address();
		address.setAddressLine1("Chennai");
		address.setAddressLine2("India");
		employee.setAddress(address);
		System.out.println(employee);
		
		
		
	}

}