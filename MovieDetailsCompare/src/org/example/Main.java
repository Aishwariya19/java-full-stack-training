
package org.example;

import com.example.CD;
import com.example.InternationalCD;
import com.example.SpecialEditionCD;

public class Main {

	public static void main(String[] args) {

		/*
		 * Country country=new Country();
		 * System.out.println(country.displayCountryDetails());
		 */

		/*
		 * CD myCd=null; // dynamic method dispatching myCd = new
		 * SpecialEditionCD(1,"Titanic",true,"3-D");
		 * System.out.println(myCd.getDetails()); myCd=new
		 * InternationalCD(1,"Godzila",true,"FR");
		 * System.out.println(myCd.getDetails()); myCd.myCD();
		 */

		/*
		 * Employee employee1 = new Employee(1, "John", "Doe", "john@email.com");
		 * System.out.println(employee1); Employee employee2 = new Employee(1, "John",
		 * "Doe", "john@email.com");
		 * 
		 * System.out.println(employee1.equals(employee2));
		 */
		
		
		CD theCD=new SpecialEditionCD(1, "AA", false, "3-D");
		CD theCD1=new SpecialEditionCD(1, "AA", false, "3-D");
		System.out.println(theCD==theCD1);
		System.out.println(theCD.equals(theCD1));
		
		
		
		
	}

}
