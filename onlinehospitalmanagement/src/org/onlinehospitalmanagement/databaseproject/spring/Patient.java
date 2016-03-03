package org.onlinehospitalmanagement.databaseproject.spring;

public class Patient {
	String first_name;
	String last_name;
	String address;
	int contact_no;
	int id;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public Patient(String first_name, String last_name, String address, int contact_no) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.contact_no = contact_no;
	}
	public Patient() {
		
	}
	public void setID(int id) {
		
		this.id = id;
	}
    public int getID() {
		
		return id;
	}
	@Override
	public String toString() {
		return "Patient [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address
				+ ", contact_no=" + contact_no + ", id=" + id + "]";
	}
	
	
	
	
	

}
