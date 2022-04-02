package com.example.demo.model;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coach {
	@Id
	@GeneratedValue
	private long id;

	private String name;
	
	private String role;
	
	private String company;

	private String tag;
	
	@Convert(converter = RatingsConverter.class)
	private List<Double> ratings;

	private double resumeFee;
	
// hibernate require a no arg constructor 
	public Coach () { }

//	Java provides a default no arg constructor when no explicit constructors are provided
	public Coach(String name, String role, String company, String tag, double resumeFee) {
		super();
		this.name = name;
		this.role = role;
		this.company = company;
		this.tag = tag;
		this.resumeFee = resumeFee;
	}
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Double> getRatings() {
		return ratings;
	}
	public void setRatings(List<Double> ratings) {
		this.ratings = ratings;
	}
	public double getResumeFee() {
		return resumeFee;
	}
	public void setResumeFee(double resumeFee) {
		this.resumeFee = resumeFee;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}	
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", role=" + role + ", ratings=" + ratings + ", resumeFee="
				+ resumeFee + "]";
	}
}
