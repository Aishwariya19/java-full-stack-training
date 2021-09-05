package com.example;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(specialFeature);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof SpecialEditionCD)) {
			return false;
		}
		SpecialEditionCD other = (SpecialEditionCD) obj;
		return Objects.equals(specialFeature, other.specialFeature);
	}
	
	

}