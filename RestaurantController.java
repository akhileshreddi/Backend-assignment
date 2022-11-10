package com.example.RestaurantApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestaurantApp.Repository.RestaurantRepository;
import com.example.RestaurantApp.Services.RestaurantService;
import com.example.RestaurantApp.model.Restaurant;


@RestController
public class RestaurantController {

	@Autowired
	public RestaurantService restaurantservice;
	
	public RestaurantRepository repository;
	
	@GetMapping("/restaurants")
	public List<Restaurant> getrestaurants()
	{
		return restaurantservice.getrestaurant();
	}
	
	@PostMapping("/restaurants/addNew")
	public void addNew(@RequestBody Restaurant restaurant) {
		restaurantservice.save(restaurant);
	}
	
	@DeleteMapping("/restaurant/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		restaurantservice.delete(id);
		
	}
	
	@GetMapping(value = "/restaurants", params = {"name"})
	public List<Restaurant> getrestaurantbykey(@RequestParam String name)
	{
		return restaurantservice.getrestaurantbykeywordd(name);
	}
	
	@GetMapping(value = "/restaurants", params = {"name","city"})
	public List<Restaurant> getrestaurantbykeycity(@RequestParam(required=false) String name, @RequestParam(required=false) String city)
	{
		return restaurantservice.getrestaurantbykeywordcity(name, city);
	}
	
	@GetMapping(value = "/restaurants", params = {"keyword","city","cusine"})
	public List<Restaurant> getrestaurantbykeyword(@RequestParam(required=false) String keyword, @RequestParam(required=false) String city,
			                                       @RequestParam(required=false) String cusine)
	{
		return restaurantservice.getrestaurantbykeyword(keyword, city,cusine);
	}
	
	@GetMapping(value = "/restaurants", params = {"keyword"})
	public List<Restaurant> getrestaurantbyonlykeyword(@RequestParam(required=false) String keyword)
	{
		return restaurantservice.getrestaurantbyonlykeyword(keyword);
	}
	
	
	
	@RequestMapping(value="/restaurant/update", method= RequestMethod.PUT)
	public void update(Restaurant restaurant) {
		restaurantservice.save(restaurant);
		
	}
	
	
}
