/*
 *  Company: RS
 *  Project: hibernate-tutorial
 *  Created: 21 lip 2021  12:33:22
 *  Author:  RS 		
 */
package pl.rsof.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Test encji w Hibernate</p><p>21 lip 2021</p>
 * @author RS
 *
 */
@Entity
@Table(name = "student")
public class Student {

	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	 private String lastName;
	@Column(name = "email")
	private String email;
	
	
	public Student() {
		
	}
	
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
}