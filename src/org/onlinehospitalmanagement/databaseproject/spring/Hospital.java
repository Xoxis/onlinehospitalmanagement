package org.onlinehospitalmanagement.databaseproject.spring;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Hospital {

	@NotBlank(message="Username cannot be blank")
	//@Pattern(regexp="^\\w$",message="username can only consist of numbers,letters & underscores")
	private String username;

//	@ValidEmail(message="enter a valid email")
	private String email;
	@NotBlank(message="password cannot be blank")
	@Pattern(regexp="^\\S+$",message="password cannot contain spaces")
	@Size(min=4,max=15,message="password is too short")
	private String password;
	private boolean enable = true;
	private String authority;
	
	public Hospital() {
		
	}

	
	public Hospital(String username, String email, String password, boolean enable, String authority) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.enable = enable;
		this.authority = authority;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	
}
