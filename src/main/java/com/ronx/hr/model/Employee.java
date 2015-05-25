package com.ronx.hr.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class Employee implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;

	private Long id;

	private String lastName;

	private String firstName;

	private Date dateOfBirth;

	private Date dateOfHire;

	private BigDecimal salary;

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", dateOfBirth=" + dateOfBirth +
				", dateOfHire=" + dateOfHire +
				", salary=" + salary +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee)) return false;

		Employee employee = (Employee) o;

		if (id != employee.id) return false;
		if (!lastName.equals(employee.lastName)) return false;
		if (!firstName.equals(employee.firstName)) return false;
		if (!dateOfBirth.equals(employee.dateOfBirth)) return false;
		if (!dateOfHire.equals(employee.dateOfHire)) return false;
		return salary.equals(employee.salary);

	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + lastName.hashCode();
		result = 31 * result + firstName.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		result = 31 * result + dateOfHire.hashCode();
		result = 31 * result + salary.hashCode();
		return result;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonSerialize(using=DateSerializer.class)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@JsonSerialize(using=DateSerializer.class)
	public Date getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}
