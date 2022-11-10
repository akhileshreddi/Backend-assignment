package com.example.RestaurantApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	@Id
	private int id;
	private String name;
	private String city;
	private String cusine;
	private String address;
	private int  rating;
	
	private String description;
	
	
	
	
	public Restaurant() {
		
	}
	public Restaurant(int id, String name,String city, String cusine,String address, int rating, String description) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		this.cusine = cusine;
		this.address = address;
		this.rating = rating;
		this.description = description;
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
	
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
		

}
