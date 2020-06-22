package com.spring.map;

import java.util.Map;

public class colourmap {

	Map<String, String> city;

	public Map<String, String> getCity() {
		return city;
	}

	public void setCity(Map<String, String> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "colourmap [city=" + city + "]";
	}
	
	
	
}
