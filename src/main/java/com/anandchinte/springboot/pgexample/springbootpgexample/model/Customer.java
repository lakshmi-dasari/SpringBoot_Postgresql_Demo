package com.anandchinte.springboot.pgexample.springbootpgexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "project_one")
public class Customer {
	
	
	private int id;
	private String firstname;
//	private String lastname;
//	private String emailId;
	
	

    public Customer() {
    }
	
	

	
//	public Customer(String firstname, String lastname, String emailId) {
//		
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.emailId = emailId;
//	}
	
	public Customer(String firstname) {
		
		this.firstname = firstname;

	}
	
	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//	public String getEmailId() {
//		return emailId;
//	}
//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}
	
	
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstname + "]";
	}
	

}
