package com.example.contactManager.model;

import javax.persistence.*;

/**
 * Created by afilkevich on 12.9.17.
 */@Entity
@Table(name="contacts")
public class ContactDTO {
 	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;

 	@Column(name="first_name")
	private String firstName;

 	@Column(name="last_name")
	private String lastName;

 	@Column(name="email")
	private String email;

 	@Column(name="phone_number")
	private String phoneNumbe;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumbe() {
		return phoneNumbe;
	}

	public void setPhoneNumbe(String phoneNumbe) {
		this.phoneNumbe = phoneNumbe;
	}
}
