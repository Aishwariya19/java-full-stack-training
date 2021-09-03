package com.example;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(language);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		
		InternationalCD other = (InternationalCD) obj;
		return Objects.equals(language, other.language);
	}

}