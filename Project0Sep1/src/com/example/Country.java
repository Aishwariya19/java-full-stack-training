package com.example;

public class Country {
	private int countryId;
	private String countryName;
	private String countryCapital;
	//default constructor
	public Country()
	{
		countryId=2;
		countryName="USA";
		countryCapital="New Jersy";
		System.out.println(countryCapital+countryId+countryName);
	}
	//right click source -> generate constructor using fields
	public Country(int countryId, String countryName, String countryCapital) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
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
