package com.example;

import java.util.Objects;

public class Address {
	
	private String addressLine1;
	private String addressLine2;
	public Address() {
		super();
	}
	public Address(String addressLine1, String addressLine2) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2);
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + "]";
	}

}