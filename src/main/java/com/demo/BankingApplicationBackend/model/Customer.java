package com.demo.BankingApplicationBackend.model;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	private Integer id;
	private String username;
	private String fullname;
	private String password;
	public Customer(Integer id, String username, String fullname, String password) {
		super();
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", fullname=" + fullname + ", password=" + password + "]";
	}
	
	
	
	
}
