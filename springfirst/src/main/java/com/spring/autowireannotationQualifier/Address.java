package com.spring.autowireannotationQualifier;

public class Address {

	private String State;
	private String city;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [State=" + State + ", city=" + city + "]";
	}
	
}