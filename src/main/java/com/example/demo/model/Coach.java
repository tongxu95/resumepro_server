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

	
	public Coach(long id, String name, String role, double resumeFee) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.resumeFee = resumeFee;
	}
	
	@Convert(converter = RatingsConverter.class)
	private List<Double> ratings;

	private double resumeFee;
	
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
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", role=" + role + ", ratings=" + ratings + ", resumeFee="
				+ resumeFee + "]";
	}	
}
