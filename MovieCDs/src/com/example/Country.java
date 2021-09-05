package com.example;

public class Country {
	private int countryId;
	private String countryName;
	private String countryCapital;
	//default constructor
	public Country()
	{
		this(1);
		System.out.println("default constructor");
	}
	
	//1 arg  constructor
	public Country(int countryId) {
		
		this(countryId,"india");
		System.out.println("1 arg constructor");
	}

	//2 arg  constructor
	public Country(int countryId, String countryName) {
		this(countryId,countryName,"Delhi");
		System.out.println("2 arg constructor");
	}
	//3 arg  constructor
	public Country(int countryId, String countryName, String countryCapital) {
		System.out.println("with in 3 arg constructor");
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		System.out.println("3 arg constructor called and excecuted successfully");
	}

	public void createCountry(int countryId,String countryName,String countryCapital)
	{
		this.countryId=countryId;
		this.countryName=countryName;
		this.countryCapital=countryCapital;
	}
	
	public String displayCountryDetails()
	{
		return "country id: "+countryId+" country name: "+countryName+" country capital: "+countryCapital;
	}

}
