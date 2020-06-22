package com.spring.constructer;

public class student {
	public int id;
	public String name;
	public String schname;

	public student(int id, String name, String schname) {
	
		this.id = id;
		this.name = name;
		this.schname = schname;
	}

	public int getId() {
		return id;
	}

	/*
	 * public void setId(int id) { this.id = id; }
	 */
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public String getSchname() {
		return schname;
	}

	/*
	 * public void setSchname(String schname) { this.schname = schname; }
	 */
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", schname=" + schname + "]";
	}

	

}
