/*
 * package com.example;
 * 
 * public class MyDate {
 * 
 * private int day; private int month; private int year;
 * 
 * public void createDate(int d,int m,int y) { day=d; month=m; year=y; }
 * 
 * public String getMyDate() { return "Date is: "+day+"/"+month+"/"+year; }
 * 
 * }
 */



//while using same name for instance variable and local variable this.variableName=>only for this object.
package com.example;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void createDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String getMyDate()
	{
		return "Date is: "+this.day+"/"+this.month+"/"+this.year;
	}

}
