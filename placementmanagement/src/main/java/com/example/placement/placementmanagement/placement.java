package com.example.placement.placementmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class placement {
	private long id;
	private String name;
	private long Roll;
	private String Qualification;
	private String Course;
	private long Year;
	
	public placement(){
		
	}

	public placement(long id, String name, long roll, String qualification, String course, long year) {
		super();
		this.id = id;
		this.name = name;
		Roll = roll;
		Qualification = qualification;
		Course = course;
		Year = year;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRoll() {
		return Roll;
	}

	public void setRoll(long roll) {
		Roll = roll;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public long getYear() {
		return Year;
	}

	public void setYear(long year) {
		Year = year;
	}
	
	@Override
	public String toString() {
		return "placement [id=" + id + ", name=" + name + ", Roll=" + Roll + ", Qualification=" + Qualification
				+ ", Course=" + Course + ", Year=" + Year + ", Certificate=" 
				 + "]";
	}

}
