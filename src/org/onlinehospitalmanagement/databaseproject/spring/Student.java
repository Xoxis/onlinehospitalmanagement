package org.onlinehospitalmanagement.databaseproject.spring;

public class Student {
	 int id;
	 String name;
	 int reg_no;
	 float cgpa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", reg_no=" + reg_no + ", cgpa=" + cgpa + "]";
	}
	
	

}
