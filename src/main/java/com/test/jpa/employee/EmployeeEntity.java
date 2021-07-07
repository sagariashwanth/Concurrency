package com.test.jpa.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeEntity {
	int employeeNumber;
	String firstName;
	String lastName;
	String email;
	int officeCode;
	
	public EmployeeEntity() {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.officeCode = officeCode;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
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
	public int getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", officeCode=" + officeCode + "]";
	}

}
