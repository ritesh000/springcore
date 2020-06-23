package com.spring.stereotypecollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {

	@Value("ritesh")
	private String stu_name;
	@Value("123")
	private int stud_id;
	@Value("#{listcities}")
	private List<String> cities;
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	@Override
	public String toString() {
		return "student [stu_name=" + stu_name + ", stud_id=" + stud_id + ", cities=" + cities + "]";
	}
	

	
}
