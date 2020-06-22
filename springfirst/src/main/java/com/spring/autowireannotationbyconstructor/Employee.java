package com.spring.autowireannotationbyconstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
   
	Address address;

	public Address getAddress() {
		return address;
	}
	
	 
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
    @Autowired
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
	}
	
	
}
