package com.example;

public class Main {

	public static void main(String[] args) {
		int arr[];
	    arr=new int[10];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=i+1;
	    }

		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
     
     //enhanched for loop
     
	    for(int a:arr)
	    {
	    	System.out.println(a);
	    }
	    arr=new int[11];
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	    String str[]=new String[5];
	    for(int i=0;i<str.length;i++)
	    {
	    	str[i]="Hi "+(i+1);
	    }
		/*
		 * for(int i=0;i<str.length;i++) { System.out.println(str[i]); }
		 */
	    
	    //Enhanced for loop- to remove 2 for loops as above
	    for(String s:str)
	    {
	    	System.out.println(s);
	    }
	    
	    
	}

}
