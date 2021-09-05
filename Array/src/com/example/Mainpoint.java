package com.example;

public class Mainpoint {



	public static void main(String[] args) {
		/*
		 * int arr[]; arr=new int[10]; for(int i=0;i<arr.length;i++) { arr[i]=i+1; }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 * 
		 * for(int a:arr) { System.out.println(a); } arr=new int[11]; for(int
		 * i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 * 
		 * String str[]=new String[5]; for(int i=0;i<str.length;i++) {
		 * str[i]="Hi "+(i+1); }
		 * 
		 * for(int i=0;i<str.length;i++) { System.out.println(str[i]); }
		 * 
		 * 
		 * //enhanched for loop for(String s:str) { System.out.println(s); }
		 * 
		 */
		
		Point []points=new Point[5];
		for(int i=0;i<points.length;i++)
		{
			points[i]=new Point(i+1, i+1);
		}
		for(Point p:points)
		{
			System.out.println(p);
		}
	}

}