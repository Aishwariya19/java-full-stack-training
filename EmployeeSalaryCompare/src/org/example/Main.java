package org.example;
import com.example.Employee;
import com.example.RegularEmployee;
import com.example.HourlyPaidEmployee;
public class Main {

	public static void main(String[] args) {
		
		Employee myEmployee1=null;
		Employee myEmployee2=null;
		
		myEmployee1 = new RegularEmployee(21,"Ramu","Kerala",1000);
		System.out.println(myEmployee1.displayEmployeeDetails());
		myEmployee2=new HourlyPaidEmployee(21,"Ramu","Kerala",10,200);
		System.out.println(myEmployee2.displayEmployeeDetails());
		
		System.out.println(myEmployee1.equals(myEmployee2));
		System.out.println(myEmployee1==myEmployee2);
		
		
		

	}
}

	