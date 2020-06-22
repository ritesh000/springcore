package com.spring.pschema;

public class student {

	int stu_id;
	String name;
	String schoolName;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "student [stu_id=" + stu_id + ", name=" + name + ", schoolName=" + schoolName + "]";
	}
	
	
}
