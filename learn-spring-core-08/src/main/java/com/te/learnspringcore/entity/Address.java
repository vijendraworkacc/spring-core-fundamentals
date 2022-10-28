package com.te.learnspringcore.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String addressType;
	private String addressCountry;
	private String addressCity;

	public Address() {
		super();
	}

	public Address(String addressType, String addressCountry) {
		super();
		this.addressType = addressType;
		this.addressCountry = addressCountry;
	}

	public Address(String addressType, String addressCountry, String addressCity) {
		System.out.println("Address(String addressType, String addressCountry, String addressCity)!");
		this.addressType = addressType;
		this.addressCountry = addressCountry;
		this.addressCity = addressCity;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	@Override
	public String toString() {
		return "Address [addressType=" + addressType + ", addressCountry=" + addressCountry + ", addressCity="
				+ addressCity + "]";
	}
}
