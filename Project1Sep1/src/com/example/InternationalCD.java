package com.example;

public class InternationalCD extends CD{
	
	private String language;

	public InternationalCD() {
		super();
	}

	public InternationalCD(int cdId, String cdName, boolean isAvailable,String language) {
		super(cdId, cdName, isAvailable);
		this.language=language;
		
	}
	public void myInternationalCD()
	{
		System.out.println("within Int National CD Class");
	}
	@Override
	public String getDetails() {
		
		return super.getDetails()+" language: "+language;
	}
	
	

}