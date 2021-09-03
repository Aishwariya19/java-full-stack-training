package com.example;

public class SpecialEditionCD extends CD{
	
	private String specialFeature;

	public SpecialEditionCD() {
		super();
	}

	public SpecialEditionCD(int cdId, String cdName, boolean isAvailable,String specialFeature) {
		
		super(cdId,cdName,isAvailable);
		this.specialFeature = specialFeature;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() +" Special Feature Is: "+specialFeature;
	}
	

}