package com.appln;

public class Calculator {

	private int result;

	public Calculator() {
		super();
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int sum(int a, int b) {
		result = a + b;
		return result;
	}

	public String sum(String a, String b) {
		return a + b;
	}

	public String sum(String a, String b, String c) {
		return a + b + c;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String args[])
	{
		Calculator calculator=new Calculator();
		calculator.result=calculator.sum(10,20,30);
		System.out.println(calculator.result);
		System.out.println(calculator.sum("Hello ", "World"));
	}
}
