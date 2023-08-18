// Project.java
package com.abdullah.webapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User  extends GenericModels{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
	private String password;
	
	public String getName() {
		return name;   
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return this.email;
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
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public User(int id, String name, String email,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password=password;
	}
	public User() {
		super();
	} 
}