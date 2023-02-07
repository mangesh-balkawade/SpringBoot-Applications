package com.mangesh.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@NamedQueries(value = {
//		@NamedQuery(name = "Employee.getEmployeeDateAfter",
//				query = "Select e from Employee as e where dob>:date"),
		@NamedQuery(name="Employee.countByCity",query = "Select count(City) from Employee where City=:city")
})

@NamedNativeQueries(
		value = {
				@NamedNativeQuery(name = "Employee.getEmployeeDateAfter",
						query = "Select * from Employee  where dob>:date",resultClass = Employee.class)
		}
		)


public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private LocalDate dob;

	private String City;

	public Employee(String name, LocalDate dob, String city) {
		super();
		this.name = name;
		this.dob = dob;
		City = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

}
