package com.sb.laundryapp.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "app_users")
public class User{
	
	@Id
	private String userId;
	private String password;
	private String role;
	
	
	public User() {
		super();

	}

	public User(String usernId, String password, String role) {
		super();
		this.userId = usernId;
		this.password = password;
		this.role = role;
	}

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}

	
}