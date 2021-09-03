package org.example;

import com.example.Employee;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "John", "Doe", "john@email.com");
		System.out.println(employee1);
		Employee employee2 = new Employee(1, "John", "Doe", "john@email.com");

		System.out.println(employee1.equals(employee2));
	}

}
