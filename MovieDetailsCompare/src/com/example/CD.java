package com.example;

import java.util.Objects;

public class CD {

	private int cdId;
	private String cdName;
	private boolean isAvailable;

	public CD() {

	}

	public CD(int cdId, String cdName, boolean isAvailable) {

		this.cdId = cdId;
		this.cdName = cdName;
		this.isAvailable = isAvailable;
	}

	public void myCD()
	{
		System.out.println("within CD class");
	}
	public String getDetails() {
		return "CD ID: " + cdId + " CD Name: " + cdName+" available? "+isAvailable;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cdId, cdName, isAvailable);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
	
		CD other = (CD) obj;
		return cdId == other.cdId && Objects.equals(cdName, other.cdName) && isAvailable == other.isAvailable;
	}
	
}
