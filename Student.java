package com.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Size(min=2,max=50,message="FirstName should be greater than 2 characters and smaller than 50 characters")
	String firstName;
	
	String lastName;
	
	@Email(message="email should be end with @gmail.com")
	String email;
	
	String address;
	
	String city;

	public Student() {
		super();
	}

	public Student(int id,
			@Size(min = 2, max = 50, message = "FirstName should be greater than 2 characters and smaller than 50 characters") String firstName,
			String lastName, @Email(message = "email should be end with @gmail.com") String email, String address,
			String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", city=" + city + "]";
	}		
}
