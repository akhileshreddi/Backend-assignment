package com.example.RestaurantApp.Services;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.RestaurantApp.Repository.RestaurantRepository;
import com.example.RestaurantApp.model.Restaurant;

@Service
public class RestaurantService {
 
	@Autowired
	public RestaurantRepository restaurantrepository;
	
	public List<Restaurant> getrestaurant()
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantrepository.findAll().forEach(res -> restaurants.add(res));
	      return restaurants;
	}
	
	public List<Restaurant> getrestaurantbykeywordd(String value)
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantrepository.getbyKeywordd(value).forEach(res -> restaurants.add(res));
	      return restaurants;
	}
	
	public List<Restaurant> getrestaurantbykeywordcity(String value, String city)
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantrepository.getbyKeywordCity(value, city).forEach(res -> restaurants.add(res));
	      return restaurants;
	}
	
	public List<Restaurant> getrestaurantbykeyword(String keyword, String city, String cusine)
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantrepository.getbyKeyword(keyword, city,cusine).forEach(res -> restaurants.add(res));
	      return restaurants;
	}
	
	public List<Restaurant> getrestaurantbyonlykeyword(String keyword)
	{
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurantrepository.getbyonlyKeyword(keyword).forEach(res -> restaurants.add(res));
	      return restaurants;
	}
	
	
	
	//SAve new Restaurant
		public void save(Restaurant Restaurant) {
			restaurantrepository.save(Restaurant);
		}
		
		//get by id
		public Optional<Restaurant> findById(int id) {
			return restaurantrepository.findById(id);
		}

		public void delete(Integer id) {
			restaurantrepository.deleteById(id);
		}
}
