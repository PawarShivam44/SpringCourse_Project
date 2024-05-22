package com.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "course_table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String fees;
	private String location;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(int id, String name, String fees, String location) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.location = location;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFees() {
		return fees;
	}


	public void setFees(String fees) {
		this.fees = fees;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + ", location=" + location + "]";
	}
	
	
}
