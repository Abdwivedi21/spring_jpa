package com.in28minutes.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Person {

	private String name,location;
	
	@Id
	@GeneratedValue
	private int id;
	private Date birthdate;
	public Person()
	{
		
	}
	@Override
	public String toString() {
		return "\n Person [name=" + name + ", location=" + location + ", id=" + id + ", birthdate=" + birthdate + "]";
	}
	
	//this is for JPA as now id will be generated automatically
	public Person(String name, String location,  Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		
		this.birthdate = birthdate;
	}
	
	public Person(int id,String name, String location,  Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		this.id = id;
		this.birthdate = birthdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
